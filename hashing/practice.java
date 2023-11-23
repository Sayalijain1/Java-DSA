// import java.security.Key;
import java.util.HashMap;

public class practice {
    public static void find_duplicate(){
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[]={1,2,3,3,4,5};
        for (int i = 0; i < arr.length; i++) 
        {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
                
            }
            else{
                map.put(arr[i], 1);
            }
            if(map.get(arr[i])>1){
                 System.out.println(arr[i]);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println("key:"+key+" values:"+map.get(key));
        }
    }
    public static void two_sum(){
        int arr[]={1,2,3,4,5};
        int target = 5;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target-arr[i];
            if (map.containsKey(diff)) {
                System.out.println("index:"+map.get(diff)+","+i);
            }
            else{
                map.put(arr[i], i);
            }
        }
    }
    public static void main(String[] args) {
        find_duplicate();
        two_sum();
        
    }
}
