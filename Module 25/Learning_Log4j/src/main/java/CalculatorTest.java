import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@SuppressWarnings({"AccessStaticViaInstance", "ResultOfMethodCallIgnored", "InstantiationOfUtilityClass"})
public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void getSum() {
        assertEquals(14, calculator.getSum(7,7));
    }

    @Test
    public void getDiv() {
        assertEquals(25, calculator.getDiv(100,4));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDiv(15,0); // Division by Zero Maths Exception
    }

    @Test
    public void getProduct() {
        assertEquals(48, calculator.getProduct(6,8));
    }

    @Test
    public void getSub() {
        assertEquals(12, calculator.getSub(71,59));
    }


    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
    }
}
