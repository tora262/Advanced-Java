public class DemoThreadSafe extends Thread {
    private static int count2 = 0;
    private static int count1 = 0;
    private static int count3 = 0;
    private Object key;

    public DemoThreadSafe(Object key) {
        this.key = key;
    }

    public static void main(String[] args) throws InterruptedException {
        Object key1 = new Object();
        Object key2 = new Object();
        Object key3 = new Object();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                increase1(new Object());
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                increase2(new Object());
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                increase3(new Object());
            }
        };
        System.out.println(System.currentTimeMillis());
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            increase3(new Object());
        }
    }

     private static void increase1(Object key) {
         synchronized (key) {
             for (int i = 0; i < 1000000; i++) {
                 count1++;
             }
         }
     }

    private static void increase2(Object key) {
        synchronized (key) {
            for (int i = 0; i < 1000000; i++) {
                count2++;
            }
        }
    }

    private static void increase3(Object key) {
        synchronized (key) {
            for (int i = 0; i < 10000; i++) {
                count3++;
            }
        }
    }
}
