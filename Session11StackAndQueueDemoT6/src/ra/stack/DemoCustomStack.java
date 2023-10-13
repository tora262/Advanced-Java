package ra.stack;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DemoCustomStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        int a = 5;
        int b = 6;

        Object o = new Object();
        Object o1 = new Object();


        System.out.println("Thực hiện hàm pop(), giá trị bị loại bỏ là: " + stack.pop());
        System.out.println("Đỉnh stack hiện tại của mình có giá trị là: " + stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty() ? "Stack đang rỗng" : "Stack có phần tử");
    }

    static class Stack<E> {
        private List<E> list = new ArrayList<>();

        public void push(E e) {
            list.add(e);
            push(e);
        }

        public E pop() {
            E peek = list.get(list.size() - 1);
            list.remove(peek);

            return peek;
        }

        public E peek() {
            return list.get(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }

        public boolean isEmpty2() {
            return list.size() == 0;
        }
    }



}