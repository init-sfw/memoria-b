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
	def events = MEvent.findAll("""from MEvent as m where 
		m.date between :fromDate and :toDate 
		and m.rate=:view 
		and m.category.id IN (:categories) 
		and m.country.id IN (:countries)""", [params.fromDate, params.toDate, params.view, params.categories, params.countries])

	render events as JSON
	}
}
