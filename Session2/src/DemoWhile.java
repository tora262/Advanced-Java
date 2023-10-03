import java.util.Scanner;

public class DemoWhile {
    public static void main(String[] args) {
        boolean isEnd = true;
        Scanner scanner = new Scanner(System.in);
        while (isEnd) {
            System.out.println("Hãy nhập vào một số:");
            int a = scanner.nextInt();
            if (a > 10) {
                System.out.println("Đã nhập một số lớn hơn 10, kết thúc vòng lặp!");
                isEnd = false;
            }
            System.out.println("Hello World");
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
