import java.lang.ref.Reference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class DemoReferenceConcurrent extends Thread {
    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new DemoReferenceConcurrent();
        Thread thread2 = new DemoReferenceConcurrent();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Đã đếm được: " + count.get());
    }
}
