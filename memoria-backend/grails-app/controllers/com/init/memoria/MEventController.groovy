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
}
