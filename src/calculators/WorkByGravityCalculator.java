package calculators;

/**
 * <h1>Work by Gravity Calculator</h1>
 * Calculates the work by gravity based
 * on specific input parameters.
 */
public class WorkByGravityCalculator {

    /**
     * Constructs a new instance of the Work
     * by Gravity Calculator object.
     */
    public WorkByGravityCalculator() {
    }

    public double calculateWorkByGravity(double mass, double initialVerticalVelocity, double accelDueGravity, double duration) {
        double work;

        work = mass * accelDueGravity * calculateChangeInHeight(initialVerticalVelocity, accelDueGravity, duration);

        return work;
    }

    private double calculateChangeInHeight(double initialVerticalVelocity, double accelDueGravity, double duration) {
        return (initialVerticalVelocity * duration) + (0.5 * accelDueGravity * Math.pow(duration, 2));
    }
}
