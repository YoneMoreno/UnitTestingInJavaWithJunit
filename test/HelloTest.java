import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertTrue;

@Category(GoodTestsCategory.class)
public class HelloTest {
    @Test
    public void dummyTest(){
        assertTrue(true);
    }
}
