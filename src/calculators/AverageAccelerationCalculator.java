package calculators;

/**
 * <h1>Average Acceleration Calculator</h1>
 * Calculates the average acceleration based
 * on specific input parameters.
 */
public class AverageAccelerationCalculator {

    /**
     * Constructs a new instance of the Average
     * Acceleration Calculator object.
     */
    public AverageAccelerationCalculator() {
    }

    public double calculateAverageAcceleration(double initialVelocity, double plannedDistance, double duration) {
        double avgAccel;

        avgAccel = ((2 * (plannedDistance - (initialVelocity * duration))) / Math.pow(duration, 2));

        return avgAccel;
    }
}
