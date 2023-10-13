package demo;

public class RunnableImpl implements Runnable {
    private String name;

    public RunnableImpl(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println((i+1) + "|" + name + "|" + System.currentTimeMillis());
            i++;
        }
    }

    public String getName() {
        return name;
    }
}
