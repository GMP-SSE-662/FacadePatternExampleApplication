import calculators.WorkByGravityCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkByGravityCalculatorTests {
    private WorkByGravityCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new WorkByGravityCalculator();
    }

    @Test
    void testGetWorkByGravityZero() {
        double expected = 0;
        double actual = testCalc.calculateWorkByGravity(5, 6.936717523, -9.81, Math.sqrt(2));
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetWorkByGravityNegative() {
        double expected = -740.40975;
        double actual = testCalc.calculateWorkByGravity(5, 20, -9.81, 1);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetWorkByGravityPositive() {
        double expected = 1109.75625;
        double actual = testCalc.calculateWorkByGravity(5, 20, -9.81, 5);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
