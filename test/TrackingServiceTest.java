import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class TrackingServiceTest {

    private TrackingService trackingService;

    @BeforeClass
    public static void init() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void exit() {
        System.out.println("After Class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        trackingService = new TrackingService();
    }

    @After

    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void NewTrackingServiceTotalIsZero() {
        assertEquals(0, trackingService.getTotal());
    }

    @Test
    @Ignore
    public void ProteinIsAddedToTheTotal() {


        trackingService.addProtein(10);

        assertEquals(10, trackingService.getTotal());
    }

    @Test
    public void GivenProteinRemovalExpectedTotalWillBeZero() {

        trackingService.removeProtein(5);

        assertEquals(0, trackingService.getTotal());
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();



    @Test
    public void givenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
        thrown.expect(InvalidGoalException.class);
        thrown.expectMessage(containsString("goal"));
        trackingService.setGoal(-1000);
    }

    @Test(timeout = 200)
    public void givenLoopExpectedTimeOut() {
        for (int i = 0; i < 1000000000; i++) {
            trackingService.addProtein(1);
        }
    }

}