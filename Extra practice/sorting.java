public class sorting {
   public static void selection_sort(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
        int minpos=i;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
        }
        int temp = arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
   }
   public static void main(String[] args) {
    int arr[]={4,2,3,1};
    System.out.println("after sorting:");
    selection_sort(arr);
   }
}
