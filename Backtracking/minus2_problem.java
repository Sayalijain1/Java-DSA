public class minus2_problem{
    public static void changearr(int arr[], int i,int value) {
        //base case 
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recursion step
        arr[i]=value;
        changearr(arr, i+1, value+1);

        //backtracking step
        arr[i]=arr[i]-2;

    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changearr(arr, 0, 1);
        printarr(arr);

    }
}