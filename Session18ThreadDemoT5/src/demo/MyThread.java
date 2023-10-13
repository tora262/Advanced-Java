package demo;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 10000) {
            System.out.println(this.getId() + "|" + System.currentTimeMillis());
            i++;
        }
    }
}
