import groovy.test.GroovyAssert

/**
 * Created by robto on 3/18/2016.
 */
class Persona {

    String nombre
    static belongsTo = [escuela:Escuela]

    static constraints = {
        nombre nullable: false, size: 1..20
    }
}

