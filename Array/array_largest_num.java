package Array;

public class array_largest_num {
    public static int larget_num(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++){
            if(largest<array[i]){
                largest=array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int []array={1,2,3,11,2,33};
        System.out.println("The largest in array is :" +larget_num(array));
    }
}
