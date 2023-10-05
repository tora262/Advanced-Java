package ra.entity;

public class Node<T> {
    // 1. Attributes
    private T value;

    private Node<T> next;

    // 2. Constructors
    public Node() {

    }

    public Node(T value) {
        this.value = value;
    }

    // 3. Methods
    // 3.1 Methods
    // 3.2 Getters and Setters
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
