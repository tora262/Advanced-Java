package bt3;

import java.util.Scanner;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("Hãy nhập giá trị n");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Thread lazy = new Thread(new LazyPrimeFactorization(n));
        Thread optimize = new Thread(new OptimizedPrimeFactorization(n));
        lazy.start();
        optimize.start();
    }
}
