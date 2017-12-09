import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class TrackingServiceTheories {
    @DataPoints
    public static int[] data() {
        return new int[]{
                1, 5, 10, 15, 20, 50, -4, 0, -999
        };
    }

    @Theory
    public void positiveValuesShouldAlwaysHavePositiveTotalsOfProtein(int value) {
        TrackingService trackingService = new TrackingService();
        trackingService.addProtein(value);

        assumeTrue(value > 0);

        assertTrue(trackingService.getTotal() > 0);
    }
}
