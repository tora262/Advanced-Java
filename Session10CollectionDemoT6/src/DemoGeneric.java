public class DemoGeneric {
    public static void main(String[] args) {
        Clone clone = new Clone();
        String i1 = "5";
        Integer i = 5;
        System.out.println("i1 = " + clone.get(i));

        Clone cloneString = new Clone<>();
        System.out.println("i1 = " + cloneString.get(i1));

        Map<Integer, String> map = new Map<>(1, "5");

        Adder<Float> adder = new Adder<>();
        adder.addInteger(12.4f, 12.5f);
    }
}
