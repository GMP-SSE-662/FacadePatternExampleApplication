import conditions.PostCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostConditionTests {
    private PostCondition testCondition;
    private final double TEST_HEIGHT = 10;
    private final double TEST_VERT_VELOCITY = 5;
    private final double TEST_LAT_VELOCITY = 25;
    private final double TEST_POSSIBLE_DIST = 57.3;
    private final double TEST_AVG_ACCEL = 23.334;
    private final double TEST_FORCE_GRAV = 50;
    private final double TEST_WORK_GRAV = 12.2;

    @BeforeEach
    void beforeEachTest() {
        testCondition = new PostCondition();
    }

    @Test
    void testSetGetHeight() {
        testCondition.setHeight(TEST_HEIGHT);
        assertEquals(testCondition.getHeight(), TEST_HEIGHT);
    }

    @Test
    void testSetGetVerticalVelocity() {
        testCondition.setEndingVerticalVelocity(TEST_VERT_VELOCITY);
        assertEquals(testCondition.getEndingVerticalVelocity(), TEST_VERT_VELOCITY);
    }

    @Test
    void testSetGetLateralVelocity() {
        testCondition.setEndingLateralVelocity(TEST_LAT_VELOCITY);
        assertEquals(testCondition.getEndingLateralVelocity(), TEST_LAT_VELOCITY);
    }

    @Test
    void testSetGetPossibleDistance() {
        testCondition.setInitialPossibleDistance(TEST_POSSIBLE_DIST);
        assertEquals(testCondition.getInitialPossibleDistance(), TEST_POSSIBLE_DIST);
    }

    @Test
    void testSetGetAverageAccel() {
        testCondition.setAverageAccel(TEST_AVG_ACCEL);
        assertEquals(testCondition.getAverageAccel(), TEST_AVG_ACCEL);
    }

    @Test
    void testSetGetForceGravity() {
        testCondition.setForceOfGravity(TEST_FORCE_GRAV);
        assertEquals(testCondition.getForceOfGravity(), TEST_FORCE_GRAV);
    }

    @Test
    void testSetGetWorkGravity() {
        testCondition.setWorkByGravity(TEST_WORK_GRAV);
        assertEquals(testCondition.getWorkByGravity(), TEST_WORK_GRAV);
    }
}
