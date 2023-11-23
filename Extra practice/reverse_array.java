public class reverse_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int start=0,end=arr.length-1;
        // int temp=0;
        while(start<end){
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
                start++;
                end--;
            }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
      
    }
}
