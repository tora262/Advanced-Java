package syncdemo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class DemoSynchronization {
    static int cnt = 0;
    private int nonStaticCnt = 0;

    Object intrinsicLock = new Object();

    static Object staticIntrisicLock = new Object();

    public static void main(String[] args) throws InterruptedException {
        DemoSynchronization demoSynchronization = new DemoSynchronization();
        Object key = new Object();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    demoSynchronization.countNonStatic(key);
                }
            }
        };


        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    demoSynchronization.countNonStatic(key);
                }
            }
        };

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        System.out.println(demoSynchronization.nonStaticCnt);
    }

    private static void count() {
        synchronized (staticIntrisicLock) {
            cnt++;
        };
    }

    private void countNonStatic(Object key) {
        synchronized (key1){
            nonStaticCnt++;
        }
    }

    private void display() {
        synchronized (key2) {

        }
    }

    Object key1 = new Object();
    Object key2 = new Object();
}
