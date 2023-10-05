public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("Java");
        stringBuilder.insert(6, "Python, ");
        stringBuilder.delete(6, 14);
        System.out.println(stringBuilder.reverse().reverse().toString());
    }
}
