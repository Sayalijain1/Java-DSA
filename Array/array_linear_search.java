package Array;

import java.util.Scanner;

public class array_linear_search {
    public static int linear_search(int array[], int key) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == key) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter numbers from 1-10:");
        for (int i = 0; i <= 9; i++) {
            array[i] = sc.nextInt();

        }
        int index = linear_search(array, 3);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("Found at :" + (index + 1));
        }
        sc.close();
    }
}
