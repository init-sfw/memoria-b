package com.init.memoria

class Category {
	int id
	String name

    static constraints = {
	name blank: false
    }
}
