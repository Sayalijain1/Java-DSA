public class peak_element{
    public static void main(String[] args) {
        int arr[]={5,10,2,33,4};
        int largest=Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}