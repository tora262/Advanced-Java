package demo;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r1 = new RunnableImpl("thread1");
        Runnable r2 = new RunnableImpl("thread2");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        try {
            t1.join();

        } catch (InterruptedException e) {
            System.out.println(((RunnableImpl) r1).getName() + "is terminated");
        }
        t2.start();
        t2.interrupt();
        try {
            t2.join();

        } catch (InterruptedException e) {
            System.out.println(((RunnableImpl) r2).getName() + "is terminated");
        }
    }
}
