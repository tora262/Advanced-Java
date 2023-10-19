package ra.util;

import java.util.Scanner;

public class InOutUtil {
    public static int inputInt(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputString(Scanner scanner) {
        return scanner.nextLine();
    }

    public static String validateInputString(Scanner scanner) {
        System.out.println("Nhập vào thông tin");
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println("Độ dài nhập vào cần chứa ít nhất 1 ký tự");
            input = validateInputString(scanner);
        }

        return input;
    }

    public static boolean validateInputBoolean(Scanner scanner) {
        System.out.println("Nhập vào giá trị:");
        String input = scanner.nextLine();
        boolean value;
        try {
            value = Boolean.parseBoolean(input);
        } catch (Exception e) {
            System.out.println("Giá trị vừa nhập không hợp lệ (chỉ nhập true/false)");
            value = validateInputBoolean(scanner);
        }

        return value;
    }

}
