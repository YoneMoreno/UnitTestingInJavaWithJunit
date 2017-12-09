import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrackingServiceTest {

    private TrackingService trackingService;

    @Before
    public void setUp() throws Exception {
        trackingService = new TrackingService();
    }

    @Test
    public void NewTrackingServiceTotalIsZero(){
        assertEquals(0, trackingService.getTotal());
    }

    @Test
    public void ProteinIsAddedToTheTotal(){


        trackingService.addProtein(10);

        assertEquals(10, trackingService.getTotal());
    }

    @Test
    public void GivenProteinRemovalExpectedTotalWillBeZero(){

        trackingService.removeProtein(5);

        assertEquals(0,trackingService.getTotal());
    }
}