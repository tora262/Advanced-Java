import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào một số nguyên: ");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("Đây là số 1");
                break;
            case 2:
                System.out.println("Đây là số 2");
                break;
            case 3:
                System.out.println("Đây là số 3");
                break;
            default:
                System.out.println("Đây là một số lớn hơn 3");

        }
    }
}
