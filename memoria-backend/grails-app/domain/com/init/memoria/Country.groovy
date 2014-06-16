package com.init.memoria

class Country {
	int id
	String name
	String isoAlpha2
	String isoAlpha3

    static constraints = {
	name blank: false
	isoAlpha2 size: 2..2
	isoAlpha3 size: 3..3
    }
}
