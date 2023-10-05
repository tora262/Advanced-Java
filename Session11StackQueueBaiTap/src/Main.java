import ra.entity.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);

        queue.deQueue();
        queue.displayQueue();
    }
}