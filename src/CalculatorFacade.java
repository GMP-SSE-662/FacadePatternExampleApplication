import calculators.*;
import conditions.InitialCondition;
import conditions.PostCondition;

public class CalculatorFacade {
    private FinalHeightCalculator heightCalc;
    private FinalLateralSpeedCalculator latSpeedCalc;
    private PossibleDistanceCalculator possibleDistCalc;
    private AverageAccelerationCalculator avgAccelCalc;
    private ForceOfGravityCalculator forceOfGravCalc;
    private WorkByGravityCalculator workByGravCalc;

    public CalculatorFacade(FinalHeightCalculator heightCalc,
                     FinalLateralSpeedCalculator latSpeedCalc,
                     PossibleDistanceCalculator possibleDistCalc,
                     AverageAccelerationCalculator avgAccelCalc,
                     ForceOfGravityCalculator forceOfGravCalc,
                     WorkByGravityCalculator workByGravCalc)
    {
        this.heightCalc = heightCalc;
        this.latSpeedCalc = latSpeedCalc;
        this.possibleDistCalc = possibleDistCalc;
        this.avgAccelCalc = avgAccelCalc;
        this.forceOfGravCalc = forceOfGravCalc;
        this.workByGravCalc = workByGravCalc;
    }

    public PostCondition getPostCondition(InitialCondition init) {
        PostCondition post = new PostCondition();
        post.setHeight(heightCalc.CalculateFinalHeight(init.getHeight(), init.getVerticalVelocity(), init.getAccelDueGravity(), init.getPlannedDuration()));


        return post;
    }
}
