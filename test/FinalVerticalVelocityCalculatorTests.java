import calculators.FinalVerticalVelocityCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FinalVerticalVelocityCalculatorTests {
    private FinalVerticalVelocityCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new FinalVerticalVelocityCalculator();
    }

    @Test
    void testGetFinalVerticalVelocityZero() {
        double expected = 0;
        double actual = testCalc.calculateFinalVerticalVelocity(20, -9.81, 2.038735984);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetFinalVerticalVelocityNegative() {
        double expected = -78.1;
        double actual = testCalc.calculateFinalVerticalVelocity(20, -9.81, 10);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetFinalVerticalVelocityPositive() {
        double expected = 0.38;
        double actual = testCalc.calculateFinalVerticalVelocity(20, -9.81, 2);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
