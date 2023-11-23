import java.util.LinkedList;
public class middlell {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1)  ; 
        list.add(2)  ; 
        list.add(3)  ; 
        list.add(4)  ; 
        list.add(5)  ; 
        int slow=0;
        int fast = 0;
        while (fast+1<list.size()) {
            slow++;
            fast+=fast+1;

        }
        for (Integer i = slow-1; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("the middle is:"+slow);
     }
}
