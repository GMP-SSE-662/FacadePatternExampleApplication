package calculators;

/**
 * <h1>Force of Gravity Calculator</h1>
 * Calculates the force of gravity based
 * on specific input parameters.
 */
public class ForceOfGravityCalculator {

    /**
     * Constructs a new instance of the Force
     * of Gravity Calculator object.
     */
    public ForceOfGravityCalculator() {
    }

    public double calculateForceOfGravity(double mass, double accelDueGravity) {
        double force;

        force = mass * accelDueGravity;

        return force;
    }
}
