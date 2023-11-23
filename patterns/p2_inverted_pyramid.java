import java.util.Scanner;

public class p2_inverted_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of line you want: ");
        int a= sc.nextInt();
        for(int i =1;i<=a;i++){
            for(int j =1;j<=(a-i+1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
sc.close();
    }
}
