package com.init.memoria

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(MEventController)
class MEventControllerSpec extends Specification {

    void "test something"() {
      given:
        controller.params.fromDate = "01/01/1800"
        controller.params.toDate = "01/01/1900"
        controller.params.view = 2
        controller.params.category = 2
        controller.params.country = [69,12]
        controller.params.action = 'filter'
        controller.params.format = null
        controller.params.controller = MEvent

      when:
        controller.filter()

      then:
        response.text == controller.params
    }
}
