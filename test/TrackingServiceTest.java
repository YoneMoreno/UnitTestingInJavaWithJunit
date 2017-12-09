import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrackingServiceTest {

    @Test
    public void NewTrackingServiceTotalIsZero(){
        TrackingService trackingService = new TrackingService();

        assertEquals(0, trackingService.getTotal());
    }

    @Test
    public void ProteinIsAddedToTheTotal(){
        TrackingService trackingService = new TrackingService();

        trackingService.addProtein(10);

        assertEquals(10, trackingService.getTotal());
    }
}