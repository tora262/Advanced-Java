package ra.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        handledAddInteger(scanner);
    }

    private static void handledAddInteger(Scanner scanner) {
        try {
            System.out.println("Hãy nhập vào lần lượt 2 số a và b:");
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("a + b = " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Đầu vào không đúng định dạng. Hãy thử lại");
            handledAddInteger(scanner);
        }
    }
}
