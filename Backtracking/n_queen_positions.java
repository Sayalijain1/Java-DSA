public class n_queen_positions {
    public static void nQueens(char chessboard[][],int row) {
        //basecase
        if(row == chessboard.length){
            printboard(chessboard);
            return;
        }
        //recursion
        for (int j = 0; j < chessboard.length; j++) {
            chessboard[row][j]='Q';
            nQueens(chessboard, row+1);//recursion
            chessboard[row][j]='X'; //backtracking
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
        int n = 2;
        //make chessboard
        char [][]chessboard= new char[n][n];
        
        //initiating
        for (int i = 0; i < n  ; i++) {
           for (int j = 0; j < n  ; j++) {
              chessboard[i][j]='X';

           }
        }
        nQueens(chessboard, 0);
    }
}
