import java.util.*;
public class ll_sing_jfc {

    public static void main(String[] args) {
        //add
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(0);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
         System.out.println(ll);
    }
}
