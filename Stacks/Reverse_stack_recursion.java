import java.util.Stack;
public class Reverse_stack_recursion {
    public static void pushs(Stack<Integer> s, int data) {
        if (s.empty()) {
            return;
        }
        int top = s.pop();
        pushs(s, data);
        s.push(top);
    }
public static void stackReverse(Stack<Integer> s){
    if(s.isEmpty()){
        return;
    }
    int top = s.pop();
    stackReverse(s);
    pushs(s,top);

}
public static void printStack(Stack<Integer> s){
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
}
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        printStack(s);
        stackReverse(s);
        printStack(s); 

    }
}
