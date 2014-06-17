import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
	// Parseo para el retorno de fechas por json
        JSON.registerObjectMarshaller(Date) {
           return it?.format("dd/MM/yyyy")
	}
    }
    def destroy = {
    }
}
