package Array;

import java.util.Scanner;

public class array_ass_1 {
    public static boolean compare(int arr[]){
        // int count=0;
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
                
            }
        }
        return false;
      
    }
    public static void main(String[] args) {
        int []nums = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int test = sc.nextInt();
        while(test>0){
        System.out.println("Enter an array of length 5:");
        for (int i = 0; i < nums.length; i++) {
             nums[i]=sc.nextInt();
        }
        boolean c =compare(nums);
        if(c==true){
            System.out.println("one number is repeating");
        }
        else{
            System.out.println("no repeats");
        }
        test--;
    }
    sc.close();
    }
}
