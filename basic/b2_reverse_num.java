package basic;

import java.util.Scanner;

public class b2_reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num to reverse it :");
        int num = sc.nextInt();
        while(num>0){
            int lastDigit = num%10;
            System.out.print(lastDigit);
            num=num/10;
        }
        sc.close();
    }
}
