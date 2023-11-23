import java.util.Scanner;

public class kth_ {
    public static void kth(int arr[],int k) {
        int largest=Integer.MIN_VALUE;
        
        for (int i = 0; i <=k; i++) {
             if(largest<arr[i]){
                largest=arr[i];
             }
        }
        System.out.println(largest);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array:");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter array ");
        for (int i = 0; i < n; i++) {
              num[i]=sc.nextInt();
        }
        System.out.println("Enter k index: ");
        int k=sc.nextInt();
        kth(num, k);
        
        sc.close();
    }
}
