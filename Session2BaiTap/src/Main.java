import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n:");
        int n = scanner.nextInt();
        int c = 1;

        for (int i = n; i >= 0; i--) {
            for (int u = 0; u < i; u++) {
                System.out.print(" ");
            }
            for (int v = 0; v < c; v++) {
                System.out.print("*");
            }
            System.out.println();
            c += 2;
        }

        
    }
}