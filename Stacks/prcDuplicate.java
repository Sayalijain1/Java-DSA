import java.util.Stack;
public class prcDuplicate {
    public static boolean isDuplicate(String str){
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            char ch = str.charAt(i);
            if (ch==')') {
                while (sc.peek()!='(') {
                    sc.pop();
                    count++;
                }
                if (count<1) {
                    return true;
                }
                else{
                    sc.pop();
                }
            }
            else{
                sc.push(ch);
            }
        }

    }
    public static void main(String[] args) {
        String str = "((a+b))";
    }
}
