 import java.util.Scanner;

public class inertedPyramid {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] currency = { 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] count = new int[currency.length];

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < currency.length; i++) {
            if (amount >= currency[i]) {
                count[i] = amount / currency[i];
                amount %= currency[i];
            }
        }

        System.out.println("Currency breakdown:");
        for (int i = 0; i < currency.length; i++) {
            if (count[i] > 0) {
                System.out.println(currency[i] + " : " + count[i]);
            }
        }
    }
}




