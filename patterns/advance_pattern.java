public class advance_pattern{
    public static void hollow_rectangle(int row,int col){
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=row;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void ulta_half_pyramid(int n){
        for(int i = 0;i<=n;i++){
            // outer loop for rows
               for(int j = 0;j<=n-i;j++){
                //   to print spaces
                   System.out.print("  ");
               }
               for(int j = 0;j<=i;j++){
                //   to print stars
                   System.out.print("* ");
               }
               System.out.println();

        }
    }
    public static void ulta_half__num_pyramid(int n){
        for(int i = 0;i<=n;i++){
            // outer loop for rows
               for(int j = 1;j<=n-i;j++){
                //   to print spaces
                   System.out.print(j);
               }
               for(int j = 1;j<=i;j++){
                //   to print stars
                   System.out.print("  ");
               }
               System.out.println();

        }
    }
    public static void floyd(int n){
        int counter=1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void binary_traingle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
               
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        // hollow_rectangle(7, 7);
        // ulta_half_pyramid(5);
        // ulta_half__num_pyramid(5);
        // floyd(5);
        // binary_traingle(7);
        butterfly(5);
    }
}