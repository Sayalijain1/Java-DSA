package Array;

// public class array_reverse_array {
//     public static void reverse_array(int array[]){
//         int start=0, end=array.length-1;
//         while(start<end){
//             int temp = array[end];
//             array[end]=array[start];
//             array[start]=temp;
//             start++;
//             end--;
//         }
//     } 
//     public static void main(String[] args) {
//         int []arrray={1,2,3,4,5,6,7};
//         System.out.println("Array befor:");
//         for(int i =0;i<arrray.length;i++){
//             System.out.println(arrray[i]+" ");
//         }
//         reverse_array(arrray);
//         System.out.println("Array after:");
//         for(int i =0;i<arrray.length;i++){
//             System.out.println(arrray[i]+" ");
//         }

//     }
// }
public class array_reverse_array{
    public static void reverse_array(int []arr){
        int start=0, end= arr.length-1;
        while(start<=end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start]= temp ;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7};
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("array after reversing:");
        reverse_array(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
