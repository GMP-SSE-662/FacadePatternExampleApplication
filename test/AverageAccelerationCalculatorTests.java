import calculators.AverageAccelerationCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AverageAccelerationCalculatorTests {
    private AverageAccelerationCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new AverageAccelerationCalculator();
    }

    @Test
    void testGetAverageAccelerationZero() {
        double expected = 0;
        double actual = testCalc.calculateAverageAcceleration(10, 10, 1);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetAverageAccelerationNegative() {
        double expected = -1.1111;
        double actual = testCalc.calculateAverageAcceleration(5, 10, 3);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetAverageAccelerationPositive() {
        double expected = 15;
        double actual = testCalc.calculateAverageAcceleration(10, 50, 2);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
