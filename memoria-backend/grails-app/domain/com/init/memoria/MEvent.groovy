package com.init.memoria

class MEvent {
	int id
	Date date
        Date creationDate
        String title
        Category category
        Country country
        String shortDescription
        String longDescription
        String link
        String imageURI
	int rate


    static constraints = {
	date nullable: false
	creationDate nullable: false
	title blank: false
	category nullable: false
        country nullable: false
	shortDescription blank: false
	longDescription blank: false
	link blank: false
	imageURI blank: false
	rate range: 0..4
    }
}
