/**
 * Created by robto on 3/18/2016.
 */
import org.junit.Test
import static org.junit.Assert.assertEquals
class Arithmetic {
    @Test
    void additionIsWorking() {
        assertEquals 4, 2+2
    }

    @Test(expected=ArithmeticException)
    void divideByZero() {
        println 1/0
    }
    static constraints = {
    }
}