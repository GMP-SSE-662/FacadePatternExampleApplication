package calculators;

/**
 * <h1>Final Height Calculator</h1>
 * Calculates the final height based
 * on specific input parameters.
 */
public class FinalHeightCalculator {

    /**
     * Constructs a new instance of the Final
     * Height Calculator object.
     */
    public FinalHeightCalculator() {
    }

    public double calculateFinalHeight(double initialHeight, double initialVerticalVelocity, double accelDueGravity, double duration) {
        double finalHeight;

        finalHeight = initialHeight + calculateChangeInHeight(initialVerticalVelocity, accelDueGravity, duration);

        return finalHeight;
    }

    private double calculateChangeInHeight(double initialVerticalVelocity, double accelDueGravity, double duration) {
        return (initialVerticalVelocity * duration) + (0.5 * accelDueGravity * Math.pow(duration, 2));
    }
}
