package basic;

import java.util.Scanner;

public class b1_avg_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        System.out.println("enter c:");
        int c = sc.nextInt();
        float avg =(a+b+c)/3;
        System.out.println("The average of all numbers is: "+avg);
        sc.close();
    }
}
