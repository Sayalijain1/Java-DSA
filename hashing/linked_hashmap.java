import java.util.*;
public class linked_hashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("a", 10);
        lhm.put("b", 20);
        lhm.put("c", 30);
        System.out.println(lhm);
        //values are always printed in the order they inserted
    }
}
