import calculators.FinalHeightCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalHeightCalculatorTests {
    private FinalHeightCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new FinalHeightCalculator();
    }

    @Test
    void testGetFinalHeightZero() {
        double expected = 0;
        double actual = testCalc.calculateFinalHeight(9.81, 0, -9.81, Math.sqrt(2));
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetFinalHeightNegative() {
        double expected = -43.145;
        double actual = testCalc.calculateFinalHeight(10, -3, -9.81, 3);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetFinalHeightPositive() {
        double expected = 64.855;
        double actual = testCalc.calculateFinalHeight(100,3, -9.81, 3);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }


}
