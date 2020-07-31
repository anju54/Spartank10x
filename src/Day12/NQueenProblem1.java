package Day12;

public class NQueenProblem1 {

    //int board[][] = new int[4][4];
    public static boolean isSafe(int row_no, int col_no, int[][] board, int total_queen) {

        //column
        for (int row = 0; row < row_no; row++) {
            if (board[row][col_no] == 1)
                return false;
        }

        //diagonal left
        int row = row_no;
        int col = col_no;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 1)
                return false;

            row--;
            col--;
        }

        //diagonal right
        row = row_no;
        col = col_no;
        while (row >= 0 && col < total_queen) {
            if (board[row][col] == 1)
                return false;

            row--;
            col++;
        }

        return true;
    }


    public static boolean NQueen(int[][] board, int row, int noOfQueen, int N){

        if (noOfQueen==0)
            return true;

        for(int col=0;col<N;col++){
            if(isSafe(row,col,board,N)){
                board[row][col] = 1;

                boolean nextRow = NQueen(board,row+1,noOfQueen-1,N);
                if (nextRow)
                    return true;

                board[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int row = 4, col = 4;
        int noOfQueen = 4;

        // Input array
        int[][] board = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                board[i][j] = 0;
            }
        }

        NQueen(board,0,noOfQueen,noOfQueen);

        // Print N queen position
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }



}
