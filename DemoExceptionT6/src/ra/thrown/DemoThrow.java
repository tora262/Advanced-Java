package ra.thrown;

public class DemoThrow {
    public void testThrow() throws CustomException {
        throw new CustomException("test throw exception");
    }
}
