package basic;

import java.util.Scanner;

public class b1_switch_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("whats the day ?");
        int weekdays=sc.nextInt();
        switch(weekdays){
             case 1:System.out.println("MONDAY");
             break;
             case 2:System.out.println("TUESDAY");
             break;
             case 3:System.out.println("THURDSAY");
             break;
             case 4:System.out.println("FRIDAY");
             break;
             case 5:System.out.println("SATURDAY");
             break;
             case 6:System.out.println("SUNDAY");
             break;
             case 7:System.out.println("OHH NO DAY");
             break;
             default:System.out.println("Invalid input!");

        }
        sc.close();
    }
}
