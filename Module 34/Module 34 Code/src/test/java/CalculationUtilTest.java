import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculationUtilTest {
    @BeforeAll
    public static void before() {
        System.out.println("Testing for CalculationUtil.java...");
    }

    @Test
    public void testAddAndMultiply() {
        final int result = CalculationUtil.addAndMultiply(2,3,10);
        Assertions.assertEquals(50, result);
    }

    @AfterAll
    public static void after() {
        System.out.println("Finishing testing for CalculationUtil.java");
    }
}
