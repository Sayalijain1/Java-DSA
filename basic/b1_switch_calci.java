package basic;

import java.util.Scanner;

public class b1_switch_calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a & b :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Select operator:+ - * / %");
        char bb = sc.next().charAt(0);
        switch(bb){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("invalid operator!");
            sc.close();
        }
    }
}
