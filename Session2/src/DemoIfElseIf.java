import java.util.Scanner;

public class DemoIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số nguyên: ");
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Đây là số 1");
        } else if (a == 2) {
            System.out.println("Đây số 2");
        } else {
            System.out.println("Đây là một số lớn hơn 2");
        }
    }
}
