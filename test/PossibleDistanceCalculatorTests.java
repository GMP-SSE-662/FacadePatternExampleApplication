import calculators.PossibleDistanceCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PossibleDistanceCalculatorTests {
    private PossibleDistanceCalculator testCalc;
    private double EPSILON = 0.0001;

    @BeforeEach
    void beforeEachTest() {
        testCalc = new PossibleDistanceCalculator();
    }

    @Test
    void testGetPossibleDistanceZero() {
        double expected = 0;
        double actual = testCalc.calculateInitialPossibleDistance(0, 10);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetPossibleDistanceNegative() {
        double expected = -50;
        double actual = testCalc.calculateInitialPossibleDistance(-5, 10);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }

    @Test
    void testGetPossibleDistancePositive() {
        double expected = 500;
        double actual = testCalc.calculateInitialPossibleDistance(10, 50);
        assertEquals(expected, actual, EPSILON, String.format("Expected: %s, Actual: %s", expected, actual));
    }
}
