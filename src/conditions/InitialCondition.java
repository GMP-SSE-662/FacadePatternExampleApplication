package conditions;

public class InitialCondition {
    private double height;
    private double accelDueGravity;
    private double verticalVelocity;
    private double lateralVelocity;
    private double plannedDuration;
    private double plannedDistance;
    private double mass;

    public InitialCondition(double height,
                            double accelDueGravity,
                            double verticalVelocity,
                            double lateralVelocity,
                            double plannedDuration,
                            double plannedDistance,
                            double mass)
    {
        this.height = height;
        this.accelDueGravity = accelDueGravity;
        this.verticalVelocity = verticalVelocity;
        this.lateralVelocity = lateralVelocity;
        this. plannedDuration = plannedDuration;
        this.plannedDistance = plannedDistance;
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public double getAccelDueGravity() {
        return accelDueGravity;
    }

    public double getVerticalVelocity() {
        return verticalVelocity;
    }

    public double getLateralVelocity() {
        return lateralVelocity;
    }

    public double getPlannedDuration() {
        return plannedDuration;
    }

    public double getPlannedDistance() {
        return plannedDistance;
    }

    public double getMass() {
        return mass;
    }
}
