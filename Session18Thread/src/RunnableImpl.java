public class RunnableImpl implements Runnable {
    private String name;

    public RunnableImpl(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(name +": " + (i+1));
        }
    }
}
