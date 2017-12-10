import conditions.InitialCondition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InitialConditionTests {
    private InitialCondition testCondition;
    private final double TEST_HEIGHT = 10;
    private final double TEST_ACCEL_GRAVITY = -9.81;
    private final double TEST_VERT_VELOCITY = 5;
    private final double TEST_LAT_VELOCITY = 25;
    private final double TEST_DURATION = 3;
    private final double TEST_DISTANCE = 100;
    private final double TEST_MASS = 102.6;

    @BeforeEach
    void beforeEachTest() {
        testCondition = new InitialCondition(TEST_HEIGHT, TEST_ACCEL_GRAVITY, TEST_VERT_VELOCITY,
                 TEST_LAT_VELOCITY, TEST_DURATION, TEST_DISTANCE, TEST_MASS);
    }

    @Test
    void testGetHeight() {
        assertEquals(testCondition.getHeight(), TEST_HEIGHT);
    }

    @Test
    void testGetAccelGrav() {
        assertEquals(testCondition.getAccelDueGravity(), TEST_ACCEL_GRAVITY);
    }

    @Test
    void testGetVerticalVelocity() {
        assertEquals(testCondition.getVerticalVelocity(), TEST_VERT_VELOCITY);
    }

    @Test
    void testGetLateralVelocity() {
        assertEquals(testCondition.getLateralVelocity(), TEST_LAT_VELOCITY);
    }

    @Test
    void testGetDuration() {
        assertEquals(testCondition.getPlannedDuration(), TEST_DURATION);
    }

    @Test
    void testGetDistance() {
        assertEquals(testCondition.getPlannedDistance(), TEST_DISTANCE);
    }

    @Test
    void testGetMass() {
        assertEquals(testCondition.getMass(), TEST_MASS);
    }
}
