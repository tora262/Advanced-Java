package ra.baitap;

import java.util.Scanner;

public class BaiTap1Throws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addInteger(scanner);
    }

    private static void addInteger(Scanner scanner) throws NumberFormatException {
        System.out.println("Hãy nhập vào lần lượt 2 số a và b:");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("a + b = " + (a + b));
    }
}
