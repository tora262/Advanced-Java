import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số nguyên: ");
        int a = scanner.nextInt();
        if (a >= 0) {
            if (a % 2 == 0) {
                System.out.println("Đây là số chẵn");
                // more statements
            } else {
                System.out.println("Đây là số lẻ");
            }
        } else {
            System.out.println("Đây không phải số tự nhiên");
        }
    }
}