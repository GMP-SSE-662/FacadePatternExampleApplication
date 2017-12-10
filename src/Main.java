import calculators.*;
import conditions.InitialCondition;
import conditions.PostCondition;

/**
 * <h1>The Main Class</h1>
 * Upon execution, the main method is called.
 */
public class Main {

    /**
     * The main method, called upon Main execution.
     * @param args unused parameter.
     */
    public static void main(String[] args) {
        FinalHeightCalculator heightCalc = new FinalHeightCalculator();
        FinalLateralSpeedCalculator latSpeedCalc = new FinalLateralSpeedCalculator();
        PossibleDistanceCalculator possibleDistCalc = new PossibleDistanceCalculator();
        AverageAccelerationCalculator avgAccelCalc = new AverageAccelerationCalculator();
        ForceOfGravityCalculator forceOfGravCalc = new ForceOfGravityCalculator();
        WorkByGravityCalculator workByGravCalc = new WorkByGravityCalculator();

        InitialCondition initCondition = new InitialCondition(10, -9.81, -2, 4, 5, 20, 10);
        CalculatorFacade calcFacade = new CalculatorFacade(heightCalc, latSpeedCalc, possibleDistCalc, avgAccelCalc, forceOfGravCalc, workByGravCalc);
        PostCondition postCondition = calcFacade.getPostCondition(initCondition);

        System.out.println("Post Condition Values:");
        System.out.println(String.format("Final height: %s m", postCondition.getHeight()));
        System.out.println(String.format("Final vertical velocity: %s m/s", postCondition.getEndingVerticalVelocity()));
        System.out.println(String.format("Final lateral velocity: %s m/s", postCondition.getEndingLateralVelocity()));
        System.out.println(String.format("Initial possible distance: %s m", postCondition.getInitialPossibleDistance()));
        System.out.println(String.format("Average acceleration: %s m/s^2", postCondition.getAverageAccel()));
        System.out.println(String.format("Force of gravity: %s N", postCondition.getForceOfGravity()));
        System.out.println(String.format("Work done by gravity: %s J", postCondition.getWorkByGravity()));
    }
}
