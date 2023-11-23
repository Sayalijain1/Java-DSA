package basic;

import java.util.Scanner;

public class swap_variable {
    public static void swap_variabl(int a,int b){
            int temp = a;
            a=b;
            b=temp;
            System.out.println(" a and b are: "+a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap_variabl(a, b);
        sc.close();
    }
    
}
