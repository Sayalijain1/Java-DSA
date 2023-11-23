package Array;
public class array_ass_5 {
    public static void triplets(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    int val = arr[i] + arr[j] + arr[k] ;
                    while( i != j && i != k  && j != k  && val==0){
                        System.out.println("["+arr[i]+arr[j]+arr[k]+"]");
                    }
                }
            }
        }
    }
     public static void main(String[] args) {
        int array[]={1, 0,  1, 2, -1, -4};
        triplets(array);
     }
}
