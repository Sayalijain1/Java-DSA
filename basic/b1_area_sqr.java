package basic;

import java.util.Scanner;

public class b1_area_sqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square:");
        int a = sc.nextInt();
        int area=a*a;
        System.out.println("The area of square is:"+area);
        sc.close();
    }
}
