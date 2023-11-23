import java.util.*;
public class iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("a", 10);
        hm.put("b", 20);
        hm.put("c", 30);
        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        //iterate by loop
        for (String k : keys) {
            System.out.println("keys: "+k+" values :"+hm.get(k));
        }
    }
}
