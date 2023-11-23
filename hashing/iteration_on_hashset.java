import java.util.HashSet;
import java.util.Iterator;


public class iteration_on_hashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("nagpur");
        cities.add("noida");
        cities.add("pune");
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
