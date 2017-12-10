package calculators;

/**
 * <h1>Final Vertical Velocity Calculator</h1>
 * Calculates the final vertical velocity based
 * on specific input parameters.
 */
public class FinalVerticalVelocityCalculator {

    /**
     * Constructs a new instance of the Final
     * Vertical Velocity Calculator object.
     */
    public FinalVerticalVelocityCalculator() {
    }

    public double calculateFinalVerticalVelocity(double initialVerticalVelocity, double accelDueGravity, double duration) {
        double finalVelocity;

        finalVelocity = initialVerticalVelocity + (accelDueGravity * duration);

        return finalVelocity;
    }
}
