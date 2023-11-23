public class n_queen_isSafe {
    static int count = 0;
    public static boolean isSafe(char chessboard[][], int row,int col) {
        //vertical check
        for (int i = row-1; i >=0; i--) {
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }
        //left diagonal check
        for (int i = row-1, j=col-1; i >=0 && j>=0; i--, j--) {
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        //right diagonal check
         for (int i = row-1, j=col+1; i >=0 && j<chessboard.length; i--, j++) {
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char chessboard[][],int row) {
        //basecase
        if(row == chessboard.length){
            //all quens are placed ,4 queens for 4 rows
            printboard(chessboard);
            count++;
            return;
        }
        //recursion
        for (int j = 0; j < chessboard.length; j++) {
            if(isSafe(chessboard,row,j)==true)
            {
                chessboard[row][j]='Q';
                nQueens(chessboard, row+1);//recursion
                chessboard[row][j]='X'; //backtracking
            }
        }
    }
    public static void printboard(char chessboard[][]) {
         System.out.println("---------------------");
         for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        int n = 5;
        //make chessboard
        char [][]chessboard= new char[n][n];
        
        //initiating
        for (int i = 0; i < n  ; i++) {
           for (int j = 0; j < n  ; j++) {
              chessboard[i][j]='X';

           }
        }
        nQueens(chessboard, 0);
        System.out.println("possible ways are:"+count);
    }
}

