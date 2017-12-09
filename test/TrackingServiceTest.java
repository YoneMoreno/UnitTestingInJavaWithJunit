import org.junit.*;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
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
    @Category(GoodTestsCategory.class)
    public void NewTrackingServiceTotalIsZero() {
        assertEquals(0, trackingService.getTotal());
    }

    @Test
    @Category(GoodTestsCategory.class)
    public void ProteinIsAddedToTheTotal() {


        trackingService.addProtein(10);


        assertThat(trackingService.getTotal(), allOf(is(10), instanceOf(Integer.class)));
    }

    @Test
    @Category(GoodTestsCategory.class)
    public void GivenProteinRemovalExpectedTotalWillBeZero() {

        trackingService.removeProtein(5);

        assertEquals(0, trackingService.getTotal());
    }

    @Test(expected = InvalidGoalException.class)
    public void givenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
        trackingService.setGoal(-1000);
    }

    @Test(timeout = 200)
    @Category({GoodTestsCategory.class, BadCategory.class})
    public void givenLoopExpectedTimeOut() {
        for (int i = 0; i < 1000000000; i++) {
            trackingService.addProtein(1);
        }
    }

}