import java.util.*;

public class count_distinct_element {
    public static void main(String[] args) {
        int arr[]={1,2,1,2};
        HashSet<Integer> s = new HashSet();
        for (int i = 0; i < arr.length; i++) {
           s.add(arr[i]); 
        }
        System.out.println(s.size());
    }
}
