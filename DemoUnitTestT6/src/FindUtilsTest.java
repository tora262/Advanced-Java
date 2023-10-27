import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindUtilsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting project");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findMax() {
        int[] arr1 = {8, 1, 10, 8, 11, 1};
        int[] arr2 = {7, 11, 6, 12, 11, 12, 5, 3};

        Assert.assertEquals(11, FindUtils.findMax(arr1));
        Assert.assertEquals(12, FindUtils.findMax(arr2));
        Assert.assertNotEquals(1, FindUtils.findMax(arr1));
        Assert.assertNotEquals(8, FindUtils.findMax(arr1));
        Assert.assertNotEquals(10, FindUtils.findMax(arr1));
    }
}