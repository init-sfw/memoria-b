package com.init.memoria

import grails.converters.JSON

class CategoryController {

	def list() {
        	def categories = Category.list()

        	withFormat {
                	json { render categories as JSON }
                   	}
                   }

}
