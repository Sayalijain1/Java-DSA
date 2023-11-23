public class bubble_sort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void counting_sort(int arr[]) {
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
                for (int i = 0; i < count.length-1; i++) {
                    System.out.println(arr[i]);
                }
               
            }
    public static void selection_sort(int arr[]) {
        // 4 5 3 2 1
        for (int i = 0; i < arr.length-1; i++) {
            int minpos=i;
            for (int j = i+1;j < arr.length; j++) {
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            // swapping
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr=i;
            int prev=i-1;
            // to find correct position
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=arr[curr];
          
        }
        
    }   
    
    public static void main(String[] args) {
        int array[]={5,1,4,2,3};
        System.out.println("The sorted array is:");
        // sort(array);
        // counting_sort(array);
        selection_sort(array);
        // insertion_sort(array);
    }
}
