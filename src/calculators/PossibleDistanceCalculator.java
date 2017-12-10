package calculators;

/**
 * <h1>Possible Distance Calculator</h1>
 * Calculates the possible distance based
 * on specific input parameters and no
 * acceleration.
 */
public class PossibleDistanceCalculator {

    /**
     * Constructs a new instance of the Possible
     * Distance Calculator object.
     */
    public PossibleDistanceCalculator() {
    }

    public double calculateInitialPossibleDistance(double initialVelocity, double duration) {
        double possibleDistance;

        possibleDistance = initialVelocity * duration;

        return possibleDistance;
    }
}
