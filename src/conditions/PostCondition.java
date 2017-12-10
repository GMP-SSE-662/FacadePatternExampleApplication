package conditions;

/**
 * <h1>Post Condition</h1>
 * A Container object for output of all
 * calculators in the system.
 */
public class PostCondition {
    private double height;
    private double endingVerticalVelocity;
    private double endingLateralVelocity;
    private double initialPossibleDistance;
    private double averageAccel;
    private double forceOfGravity;
    private double workByGravity;

    public PostCondition() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getEndingVerticalVelocity() {
        return endingVerticalVelocity;
    }

    public void setEndingVerticalVelocity(double endingVerticalVelocity) {
        this.endingVerticalVelocity = endingVerticalVelocity;
    }

    public double getEndingLateralVelocity() {
        return endingLateralVelocity;
    }

    public void setEndingLateralVelocity(double endingLateralSpeed) {
        this.endingLateralVelocity = endingLateralSpeed;
    }

    public double getInitialPossibleDistance() {
        return initialPossibleDistance;
    }

    public void setInitialPossibleDistance(double initialPossibleDistance) {
        this.initialPossibleDistance = initialPossibleDistance;
    }

    public double getAverageAccel() {
        return averageAccel;
    }

    public void setAverageAccel(double averageAccel) {
        this.averageAccel = averageAccel;
    }

    public double getForceOfGravity() {
        return forceOfGravity;
    }

    public void setForceOfGravity(double forceOfGravity) {
        this.forceOfGravity = forceOfGravity;
    }

    public double getWorkByGravity() {
        return workByGravity;
    }

    public void setWorkByGravity(double workByGravity) {
        this.workByGravity = workByGravity;
    }
}
