import java.util.Scanner;

public class num_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of line you want: ");
        int n= sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
