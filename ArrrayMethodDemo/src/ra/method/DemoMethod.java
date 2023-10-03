package ra.method;

import java.util.Scanner;

public class DemoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        add(scanner);
        add(scanner);
        display("Hello World");
        String output = display("Hello World");
    }

    public static void add(Scanner scanner) {
        System.out.println("Hãy nhập vào số thứ nhất: ");
        int i1 = scanner.nextInt();
        System.out.println("Hãy nhập số thứ hai:");
        int i2 = scanner.nextInt();

        System.out.println("Tổng của 2 số là: " + (i1+i2));
    }

    public static String display(String input) {
        return input;
    }
}
