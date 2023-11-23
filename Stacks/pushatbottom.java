import java.util.Stack;

public class pushatbottom {
    public static void pushs(Stack<Integer> s, int data) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        pushs(s, data);
        s.push(top);
    }



    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushs(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

