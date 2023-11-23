package Array;

import java.util.*;

public class array_ass_3 {
    public static void profit(int arr[]){
        int buy=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // for (int j = i+1; j < arr.length; j++) {
                if(buy>arr[i]){
                    buy=arr[i];
                    // here we can find lowest prices to buy
                }
            }
        int sell=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==buy){
    
               
                for (int j =i+1 ; j < arr.length; j++) {
                    // by this we can compare values after we have buyed
                    if(sell<arr[j]){
                        sell=arr[j];
                    }
                }
            }
        }
        
        System.out.println(buy);
        System.out.println(sell);
        int profit=sell-buy;
        if(profit>0 && sell>0){
            System.out.println("Profit of:"+profit);
        }
        else{
            System.out.println("Loss !");
        }
        // return buy;
    
    }
    public static void main(String[] args) {
        int []num = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int test = sc.nextInt();
        while(test>0){
            System.out.println("Enter an array of length 5:");
            for (int i = 0; i < num.length; i++) {
                 num[i]=sc.nextInt();
            }
            profit(num);
        }
        sc.close();
    }
    
}
