import org.junit.*;

import static org.junit.Assert.*;

public class TrackingServiceTest {

    private TrackingService trackingService;

    @BeforeClass
    public static void init(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void exit(){
        System.out.println("After Class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Before");
        trackingService = new TrackingService();
    }

    @After

    public void tearDown(){
        System.out.println("After");
    }

    @Test
    public void NewTrackingServiceTotalIsZero(){
        assertEquals(0, trackingService.getTotal());
    }

    @Test
    @Ignore
    public void ProteinIsAddedToTheTotal(){


        trackingService.addProtein(10);

        assertEquals(10, trackingService.getTotal());
    }

    @Test
    public void GivenProteinRemovalExpectedTotalWillBeZero(){

        trackingService.removeProtein(5);

        assertEquals(0,trackingService.getTotal());
    }

    @Test(expected = InvalidGoalException.class)
    public void givenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
        trackingService.setGoal(-1000);
    }

}