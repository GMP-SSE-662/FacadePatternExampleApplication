import calculators.ForceOfGravityCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForceOfGravityCalculatorTest {
    private ForceOfGravityCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new ForceOfGravityCalculator();
    }

    @Test
    void testGetForceOfGravityZero() {
        double expected = 0;
        double actual = testCalc.calculateForceOfGravity(0, -9.81);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetForceOfGravity1() {
        double expected = -49.05;
        double actual = testCalc.calculateForceOfGravity(5, -9.81);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetForceOfGravity2() {
        double expected = -98.1;
        double actual = testCalc.calculateForceOfGravity(10, -9.81);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
