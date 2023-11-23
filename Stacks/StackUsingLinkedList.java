public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        public boolean isEmpty() {
            return top == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
            System.out.println(data + " pushed to the stack.");
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1; // Return a default value indicating stack underflow
            }
            int poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1; // Return a default value indicating stack underflow
            }
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        System.out.println(stack.pop() + " popped from the stack.");
        System.out.println(stack.pop() + " popped from the stack.");

        System.out.println("Top element: " + stack.peek());
    }
}
