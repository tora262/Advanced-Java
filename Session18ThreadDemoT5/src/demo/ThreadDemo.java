package demo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new MyThread();
        myThread.start();
        myThread.join();

        Thread mySecondThread = new MyThread();
        mySecondThread.start();
        mySecondThread.join();
        int i = 0;
        while (i< 10000) {
            System.out.println("Main thread | " + System.currentTimeMillis());
            i++;
        }
    }
}