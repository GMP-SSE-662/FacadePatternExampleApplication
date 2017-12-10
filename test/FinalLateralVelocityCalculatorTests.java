import calculators.FinalLateralVelocityCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalLateralVelocityCalculatorTests {
    private FinalLateralVelocityCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new FinalLateralVelocityCalculator();
    }

    @Test
    void testGetFinalLateralVelocityZero() {
        double expected = 0;
        double actual = testCalc.calculateFinalLateralVelocity(0, 0, 1);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetFinalLateralVelocityNegative() {
        double expected = -3.3333;
        double actual = testCalc.calculateFinalLateralVelocity(10, 10, 3);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetFinalLateralVelocityPositive() {
        double expected = 40;
        double actual = testCalc.calculateFinalLateralVelocity(10, 50, 2);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
