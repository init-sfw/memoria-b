package com.init.memoria

import grails.converters.JSON

class MEventController {

	def list() {
		def events = MEvent.list()

		withFormat {		
			html mEventList:events
			json { render events as JSON }
		} 
	}

	def filter() {
		def events
		def categories = params.list('category').collect{a -> a.toInteger() }
		def countries = params.list('country').collect{a -> a.toInteger() }

		def query = "from MEvent as m where m.date between :fromDate and :toDate and m.rate <= :view"
		query = query + prepareArrayQuery(categories, 'category')
		query = query + prepareArrayQuery(countries, 'country')
		
		//FIXME: Fix this messi properly
		if (categories.size() == 0 && countries.size() == 0) {
			events = MEvent.findAll(query, [fromDate: params.date('fromDate', 'dd/MM/yyyy'), toDate: params.date('toDate', 'dd/MM/yyyy'), view: params.int('view')])			
		}
		else {
			if (categories.size() != 0 && countries.size() != 0) {
				events = MEvent.findAll(query, [fromDate: params.date('fromDate', 'dd/MM/yyyy'), toDate: params.date('toDate', 'dd/MM/yyyy'), view: params.int('view'), category: categories, country: countries])
			}
			else {
				if (categories.size() == 0) {
					events = MEvent.findAll(query, [fromDate: params.date('fromDate', 'dd/MM/yyyy'), toDate: params.date('toDate', 'dd/MM/yyyy'), view: params.int('view'), country: countries])
				}
				else {
					events = MEvent.findAll(query, [fromDate: params.date('fromDate', 'dd/MM/yyyy'), toDate: params.date('toDate', 'dd/MM/yyyy'), view: params.int('view'), category: categories])
				}
			}
		}

		render events as JSON
	}

	def prepareArrayQuery (array, property) {
		if (array.size() > 0) {
			return " and m." + property + ".id IN :" + property
		}
		else {
			return ""
		}
	}
}
