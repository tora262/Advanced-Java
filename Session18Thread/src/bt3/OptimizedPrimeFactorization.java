package bt3;

import java.util.Date;

public class OptimizedPrimeFactorization implements Runnable {
    private int n;

    public OptimizedPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        optimizedPrime(n);
    }

    private void optimizedPrime(int n) {
        System.out.println(OptimizedPrimeFactorization.class.getName() + ": " + System.currentTimeMillis());
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0 && i != 2) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
//                System.out.println(LazyPrimeFactorization.class.getName() + ": " + i);
            }
        }
        System.out.println(OptimizedPrimeFactorization.class.getName() + ": " + System.currentTimeMillis());
    }
}
