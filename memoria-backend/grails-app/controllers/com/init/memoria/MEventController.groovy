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
	def categories = params.list('category').collect{a -> a.toInteger() }
	def countries = params.list('country').collect{a -> a.toInteger() }

	def events = MEvent.findAll("from MEvent as m where m.date between :fromDate and :toDate and m.rate<=:view and m.category.id IN :categories and m.country.id IN :countries", [fromDate: params.date('fromDate', 'dd/MM/yyyy'), toDate: params.date('toDate', 'dd/MM/yyyy'), view: params.int('view'), categories: categories, countries: countries])

	render events as JSON
	}
}
