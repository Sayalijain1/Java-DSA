import java.util.*;
public class Hash_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        System.out.println(set.contains(3));
        set.remove(1);
        System.out.println(set);
    }
}
