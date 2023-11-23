import java.util.Scanner;

public class two_d_array {
    public static boolean search(int mat[][], int key) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j]==key){
                    System.out.println("Key found at :"+(i+1)+","+(j+1));
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix element:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);
        sc.close();
    }
}
