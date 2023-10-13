package ra.stack;

import java.util.Stack;

public class DemoStackJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.printf("Pop giá trị %d ra khỏi stack\n", stack.pop());
        System.out.printf("Giá trị ở đỉnh stack đang là %d\n", stack.peek());
        System.out.printf("Pop giá trị %d ra khỏi stack\n", stack.pop());
        System.out.printf("Pop giá trị %d ra khỏi stack\n", stack.pop());

        System.out.println(stack.isEmpty() ? "Stack đang rỗng" : "Stack có phần tử");
    }
}
