import java.util.HashSet;

public class Union_intersection {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={3,4,5,6};
        HashSet<Integer> s = new HashSet();
        for (int i = 0; i < arr1.length; i++) {
           s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            s.add(arr2[i]);
        }
        System.out.println(s.size()+" "+s);
        s.clear();
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            s.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (s.contains(arr2[i])) {
                count++;
                s.remove(arr2[i]);
            }
        }
        System.out.println(count+" "+s);
    }
}
