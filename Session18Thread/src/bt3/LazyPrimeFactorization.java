package bt3;

import java.util.Date;

public class LazyPrimeFactorization implements Runnable {
    private int n;

    public LazyPrimeFactorization(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        lazyPrime(n);
    }

    private void lazyPrime(int n) {
        System.out.println(LazyPrimeFactorization.class.getName() + ": " + System.currentTimeMillis());
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i != 2) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
//                System.out.println(LazyPrimeFactorization.class.getName() + ": " + i);
            }
        }
        System.out.println(LazyPrimeFactorization.class.getName() + ": " + System.currentTimeMillis());

    }
}
