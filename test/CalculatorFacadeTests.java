import calculators.*;
import conditions.InitialCondition;
import conditions.PostCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorFacadeTests {
    private final double EPSILON = 0.0001;
    CalculatorFacade testFacade;

    @Test
    void testFacade1() {
        InitialCondition initCondition = new InitialCondition(10, -9.81, -2, 4, 5, 20, 10);
        testFacade = new CalculatorFacade(new FinalHeightCalculator(), new FinalVerticalVelocityCalculator(),
                new FinalLateralVelocityCalculator(), new PossibleDistanceCalculator(), new AverageAccelerationCalculator(),
                new ForceOfGravityCalculator(), new WorkByGravityCalculator());
        PostCondition postCondition = testFacade.getPostCondition(initCondition);

        assertEquals(postCondition.getHeight(), -122.625, EPSILON);
        assertEquals(postCondition.getEndingVerticalVelocity(), -51.05, EPSILON);
        assertEquals(postCondition.getEndingLateralVelocity(), 4, EPSILON);
        assertEquals(postCondition.getInitialPossibleDistance(), 20, EPSILON);
        assertEquals(postCondition.getAverageAccel(), 0, EPSILON);
        assertEquals(postCondition.getForceOfGravity(), -98.1, EPSILON);
        assertEquals(postCondition.getWorkByGravity(), 13010.5125, EPSILON);
    }
}
