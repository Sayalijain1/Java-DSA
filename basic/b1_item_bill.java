package basic;

import java.util.Scanner;

public class b1_item_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pen:");
        int pen = sc.nextInt();
        System.out.println("enter price of pencil");
        int pencil=sc.nextInt();
        System.out.println("enter price of eraser");
        int eraser=sc.nextInt();
        int total=pen+pencil+eraser;
        System.out.println("The total bill of your item is: $"+total);
        sc.close();
    }
}
