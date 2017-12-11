import calculators.*;
import conditions.InitialCondition;
import conditions.PostCondition;

/**
 * <h1>The Calculator Facade</h1>
 * Simplifies the interface between the Main
 * program and the calculators.
 */
public class CalculatorFacade {
    private FinalHeightCalculator heightCalc;
    private FinalVerticalVelocityCalculator vertVelocityCalc;
    private FinalLateralVelocityCalculator latVelocityCalc;
    private PossibleDistanceCalculator possibleDistCalc;
    private AverageAccelerationCalculator avgAccelCalc;
    private ForceOfGravityCalculator forceOfGravCalc;
    private WorkByGravityCalculator workByGravCalc;

    private static CalculatorFacade instance;

    public static CalculatorFacade getInstance() {
        if (instance == null)
            instance = new CalculatorFacade();
        return instance;
    }

    private CalculatorFacade() {
        heightCalc = new FinalHeightCalculator();
        vertVelocityCalc = new FinalVerticalVelocityCalculator();
        latVelocityCalc = new FinalLateralVelocityCalculator();
        possibleDistCalc = new PossibleDistanceCalculator();
        avgAccelCalc = new AverageAccelerationCalculator();
        forceOfGravCalc = new ForceOfGravityCalculator();
        workByGravCalc = new WorkByGravityCalculator();
    }

    public PostCondition getPostCondition(InitialCondition init) {
        PostCondition post = new PostCondition();

        post.setHeight(heightCalc.calculateFinalHeight(init.getHeight(),
                init.getVerticalVelocity(), init.getAccelDueGravity(),
                init.getPlannedDuration()));
        post.setEndingVerticalVelocity(vertVelocityCalc.calculateFinalVerticalVelocity(
                init.getVerticalVelocity(), init.getAccelDueGravity(),
                init.getPlannedDuration()));
        post.setEndingLateralVelocity(latVelocityCalc.calculateFinalLateralVelocity(
                init.getLateralVelocity(), init.getPlannedDistance(),
                init.getPlannedDuration()));
        post.setInitialPossibleDistance(possibleDistCalc.calculateInitialPossibleDistance(
                init.getLateralVelocity(), init.getPlannedDuration()));
        post.setAverageAccel(avgAccelCalc.calculateAverageAcceleration(
                init.getLateralVelocity(), init.getPlannedDistance(),
                init.getPlannedDuration()));
        post.setForceOfGravity(forceOfGravCalc.calculateForceOfGravity(init.getMass(),
                init.getAccelDueGravity()));
        post.setWorkByGravity(workByGravCalc.calculateWorkByGravity(init.getMass(),
                init.getVerticalVelocity(), init.getAccelDueGravity(),
                init.getPlannedDuration()));

        return post;
    }
}
