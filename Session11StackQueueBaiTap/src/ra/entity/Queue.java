package ra.entity;

import java.util.Objects;

public class Queue<T> {
    // 1. Attributes
    private Node<T> front;
    private Node<T> rear;

    // 2. Constructor
    public Queue() {
    }

    // 3. Methods
    // 3.1 Methods
    public void enqueue(T t) {
        Node<T> node = new Node<>(t);
        if (empty()) {
            rear = node;
            front = node;
            front.setNext(rear);
            rear.setNext(front);
        } else {
            rear.setNext(node);
            rear = node;
            rear.setNext(front);
        }
    }

    public T deQueue() {
        if (empty()) {
            return null;
        } else {
            Node<T> node = front.getNext();
            T t = front.getValue();
            front = node;
            rear.setNext(front);
            return t;
        }
    }

    public boolean empty() {
        return front == null;
    }

    public void displayQueue() {
        if (empty()) {
            System.out.println("Hàng đợi rỗng");
        } else {
            Node<T> node = front;
            System.out.println("Các phần tử của queue");
            do {
                System.out.println(node.getValue());
                node = node.getNext();
            } while (!node.equals(front));
        }
    }
    // 3.2 Getters and Setters

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getRear() {
        return rear;
    }

    public void setRear(Node<T> rear) {
        this.rear = rear;
    }
}
