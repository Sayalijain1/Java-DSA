import java.util.ArrayList;

public class consecutive1 {
    public static int consecutive(int arr[]){
        int count=0,  max = 0;
        for (int j = 0; j < arr.length; j++) {
             if (arr[j]==1) {
            count++;
            max=Math.max(count, max);
         }
         else{
            count=0;
         }
       
        }
         return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,1,1,1,1,1};
        System.out.println(consecutive(arr));
        int k=2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i =k ; i <= list.size(); i++) {
            list2.add(i);
        }
        for (int i = 1; i < k; i++) {
            list2.add(i);
        }
        System.out.println(list2);
    }
}
