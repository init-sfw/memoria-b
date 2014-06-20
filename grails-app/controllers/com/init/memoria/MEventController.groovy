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
    def (query,queryParams) = buildParameters()
    def events = MEvent.findAll(query, queryParams)
		render events as JSON
	}

  def buildParameters() {
		def query = "from MEvent as m where m.date between :fromDate and :toDate and m.rate <= :view"

    def queryParams = [
      fromDate: params.date('fromDate', 'dd/MM/yyyy'),
      toDate:   params.date('toDate', 'dd/MM/yyyy'),
      view:     params.int('view')
    ]

    def categories = params.list('category').collect{a -> a.toInteger() }
    def countries =  params.list('country').collect{a -> a.toInteger() }

    if(categories.size()) {
      query = query + " and m.category.id IN (:categories)"
      queryParams.categories = categories
    }
    if(countries.size()) {
      query = query + " and m.country.id IN (:countries)"
      queryParams.countries = countries
    }
    return [query, queryParams]
  }
}
