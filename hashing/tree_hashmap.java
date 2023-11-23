import java.util.TreeMap;

public class tree_hashmap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("a", 10);
        tm.put("b", 20);
        tm.put("c", 30);
        System.out.println(tm);
        //keys are sorted
    }
}
