package ra.queue;

import java.util.PriorityQueue;

public class DemoQueueJava {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");

        System.out.printf("Poll phần tử %s trong queue\n", queue.poll());
        System.out.printf("Poll phần tử %s trong queue\n", queue.poll());
        System.out.printf("Poll phần tử %s trong queue\n", queue.poll());
        System.out.println("Peek của queue là " + queue.peek());

        System.out.println(queue.isEmpty() ? "Queue đang rỗng" : "Queue có phần tử");
    }
}
