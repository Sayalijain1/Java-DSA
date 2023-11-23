import java.util.Stack;;
public class pracvalid {
    public static boolean isValid(String s){
        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='('||ch=='{'||ch=='[') {
                sc.push(ch);
            }
            else{
                if (sc.isEmpty()) {
                    return true;
                }
                else{
                    if (
                        sc.peek()=='(' && ch==')' ||
                        sc.peek()=='{' && ch=='}' ||
                        sc.peek()=='[' && ch==']' 
                        
                       ) {
                           sc.pop();
                         }
                   else{
                    return false;
                   }
                }
            }
            
        }
        if(sc.isEmpty()){
                return true;
            }
            else{
                return false;
            }
    }
    public static void main(String[] args) {
        String sc = "(())";
        System.out.println(isValid(sc));
    }
}
