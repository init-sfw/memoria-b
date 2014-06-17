package com.init.memoria

import grails.converters.JSON

class CountryController {

	def list() {
        def countries = Country.list()

        withFormat {
                json { render countries as JSON }
                   }
               }
}
