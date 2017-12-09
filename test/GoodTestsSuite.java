import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(GoodTestsCategory.class)

@Categories.ExcludeCategory(BadCategory.class)

@Suite.SuiteClasses({
        HelloTest.class,
        TrackingServiceTest.class
        })
public class GoodTestsSuite {
}
