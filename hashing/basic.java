import java.util.*;
public class basic{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 567);
        hm.put("puna", 78);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("ndia"));
        System.out.println(hm.remove("puna"));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}