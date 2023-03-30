import ie.atu.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator myCalc;

    @Test
    void testAdd() {
        Calculator myCalc = new Calculator();
        assertEquals(40,myCalc.add(20,20));
    }
    @Test
    void testSubtract() {
        Calculator myCalc = new Calculator();
        assertEquals(5,myCalc.subtract(10,5));
    }
}
