import java.util.HashMap;
import java.util.Set;

public class majority_element {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,3,3,4};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            // if (hm.containsKey(num)) {
            //     hm.put(num, hm.get(num)+1);
            //     //agar key exist karti hai to hum uski purani freq nikal ke 1 increment karenge
            // }
            // else{
            //     hm.put(num,1 );
            // }
            /**
             * ! instead of using if else we can use a function which inputs key and its value if not present
             */
            hm.put(num, hm.getOrDefault(num,0)+1);

        }
        // Set<Integer> KeySet = hm.keySet();
        //maybe this makes a collection of keys 
         /**
             * ! instead of using set we can directly add keyset in loop
             */
        // for (Integer key : KeySet) {
        //in this loop we are traversing through keys
        //    if (hm.get(key)>arr.length/3) {
        //      System.out.println(key);
        //    }
        // }

        for (Integer key : hm.keySet()) {
        // in this loop we are traversing through keys
           if (hm.get(key)>arr.length/3) {
             System.out.println(key);
           }
        }

    }
}
