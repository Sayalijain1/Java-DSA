import java.util.function.Function;

public class recursion {
    public static void printdef(int n) {
        if (n==1) {
            System.out.println(1);
            return;
           
        }
        System.out.println(n);
        printdef(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printdef(n);
    }
}
