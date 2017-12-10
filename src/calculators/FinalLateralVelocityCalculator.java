package calculators;

/**
 * <h1>Final Lateral Velocity Calculator</h1>
 * Calculates the final lateral velocity based
 * on specific input parameters.
 */
public class FinalLateralVelocityCalculator {

    /**
     * Constructs a new instance of the Final
     * Lateral Velocity Calculator object.
     */
    public FinalLateralVelocityCalculator() {
    }

    public double calculateFinalLateralVelocity(double initialVelocity, double plannedDistance, double duration) {
        double velocity;

        velocity = (((2 * plannedDistance) / duration) - initialVelocity);

        return velocity;
    }
}
