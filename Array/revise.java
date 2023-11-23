package Array;

import java.util.Scanner;

public class revise {
    public static void main(String[] args) {
        int []arr= new int[5];
        Scanner sc = new Scanner(System.in);
        int test = 3;
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
