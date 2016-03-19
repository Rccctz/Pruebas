

import grails.test.mixin.TestFor
import grails.test.mixin.support.GrailsUnitTestMixin
import spock.lang.Specification


/**
 * Created by robto on 3/18/2016.
 */
@TestFor(Persona)
class PersonaTest extends Specification {
    def setup() {

    }

    def cleanup() {
    }


    void "test estos"(){


        expect:
        2 == 3
    }
}
