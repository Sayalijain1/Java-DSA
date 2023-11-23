package basic;

public class trial {
    public static void main(String[] args) {
        int arr[]={1,2,7,7,2,3,6,4,5};
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);//this line found the largest element present
           
        }
        System.out.println(largest);
        int count[]= new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // so what this loop did is to add the number of  times a integer repeated
        }
        // sorting
        int j=0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(arr[i]);
        }
       
    }
}
