public class DemoThrow {
    public static void main(String[] args) {
        throwAndCatchException();

        try {
            throwException();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void throwAndCatchException() {
        try {
            throw new CustomException("Đây là Custom Exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void throwException() throws CustomException {
        throw new CustomException("Đây là Custom Exception");
    }

    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }
}
