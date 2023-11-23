import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(int data) {
        stack.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Return a sentinel value or throw an exception for empty stack
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // Return a sentinel value or throw an exception for empty stack
        }
        return stack.get(stack.size() - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
