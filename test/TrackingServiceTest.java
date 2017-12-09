import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrackingServiceTest {

    @Test
    public void NewTrackingServiceTotalIsZero(){
        TrackingService trackingService = new TrackingService();
        Assert.assertEquals(0, trackingService.getTotal());
    }
}