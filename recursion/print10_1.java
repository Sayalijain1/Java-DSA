public class print10_1{
    public static void printnum(int n) {
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.println(n+" ");
        printnum(n-1);
    }
    public static void printinr(int a) {
        if(a==10){
            System.out.print(a);
            return;
        }
        System.out.println(a+" ");
        printinr(a+1);
    }
    public static int factorial(int f) {
        if(f==0||f==1){
            return 1;
        }
        else{
            return f*factorial(f-1);
        }
    }
    public static int  sum(int s) {
        if(s==0){
            return 0;
        }
        else{
            return s+sum(s-1);
        }
    }
    public static int fibonacci(int n) {
        //fn = fn-1 + fn-2
        if(n==0||n==1){
            return n;
        }
        int fnm1 = factorial(n-1);
        int fnm2 = factorial(n-2);
        int fn = fnm1+fnm2;
        return fn;
    }
    public static boolean sortedarray(int arr[], int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedarray(arr, i+1);

    }
    public static int firstoccurence(int[]arr,int key, int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
         return firstoccurence(arr, key, i+1);
    }
    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    // public static void duplicate(int ind,String str,StringBuilder newstr,boolean map[]){
   
    public static void main(String[] args) {
        // int n=10;
        // int a =1;
        // int f =4;
        // int s =10;
        int arr[]={1,9,3,4,5};
        // printnum(n);
        // printinr(a);
        // int fact=factorial(f);
        // System.out.println("the factorial is:"+fact);
        // System.out.println("the sum is"+sum(s));
        // int n = 25;
        // System.out.println("fibonacci is :"+fibonacci(n));
        // System.out.println("the array is: "+sortedarray(arr, 0));
        // System.out.println("The ocuurence found at: "+firstoccurence(arr, 5, 0));
        System.out.println("the power is "+power(2, 3));

    }
}