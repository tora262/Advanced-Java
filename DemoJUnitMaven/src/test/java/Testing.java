import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Testing {
    private int i;
    private int j;

    private String a;
    private String b;

    @Before
    public void setData() {
        System.out.println("Before testing");
        i = 5;
        j = 5;
        a = "Java";
        b = "JAVA";
    }

    @Test
    public void testEquals() {
        display("Kiểm tra 2 số i, j");
        Assert.assertEquals("Kiểm tra i == j", i, j);
    }

    private void display(String title) {
        System.out.println(title);
    }

    @Test
    public void testTrue() {
        display("Thực thi kiểm tra 2 string");
        Assert.assertTrue("Thực thi kiểm tra 2 string", a.equalsIgnoreCase(b));
    }
}
