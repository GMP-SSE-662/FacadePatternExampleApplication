import conditions.InitialCondition;
import conditions.PostCondition;
import calculators.*;

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
        InitialCondition init = new InitialCondition(10, -9.81,
                -2, 4, 5, 20, 10);
        CalculatorFacade calcFacade = CalculatorFacade.getInstance();
        PostCondition post = calcFacade.getPostCondition(init);

        System.out.println("Post Condition Values:");
        System.out.println(String.format("Final height: %s m",
                post.getHeight()));
        System.out.println(String.format("Final vertical velocity: %s m/s",
                post.getEndingVerticalVelocity()));
        System.out.println(String.format("Final lateral velocity: %s m/s",
                post.getEndingLateralVelocity()));
        System.out.println(String.format("Initial possible distance: %s m",
                post.getInitialPossibleDistance()));
        System.out.println(String.format("Average acceleration: %s m/s^2",
                post.getAverageAccel()));
        System.out.println(String.format("Force of gravity: %s N",
                post.getForceOfGravity()));
        System.out.println(String.format("Work done by gravity: %s J",
                post.getWorkByGravity()));
    }
}
