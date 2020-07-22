package Day12;

public class NQueenProblem {

    //int board[][] = new int[4][4];
    private static boolean isSafe(int board[][], int row, int col,int noOfQueen){

        // same column
        for(int i=0;i<row;i++){
            if (board[i][col] == 1)
                return false;
        }
        // left diagonal
        while (row>=0 && col>=0){
            if (board[row][col] == 1)
                return false;
            row--;
            col--;
        }
        // right diagonal
        while (row>=0 && col<noOfQueen){
            if (board[row][col] == 1)
                return false;
            row--;
            col++;
        }
        return true;
    }

    public static boolean NQueen(int board[][], int row, int noOfQueen){

        if (noOfQueen==row)
            return true;

        for(int col=0;col<noOfQueen;col++){
            if(isSafe(board,row,col,noOfQueen)){
                board[row][col] = 1;
            }
            boolean nextRow = NQueen(board,row+1,noOfQueen);
            if (nextRow)
                return true;

            board[row][col] = 0;
        }
        return false;
    }

    public static void main(String[] args) {

        int row = 4, col = 4;
        int noOfQueen = 4;

        // Input array
        int board[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                board[i][j] = 0;
            }
        }

        NQueen(board,0,noOfQueen);

        // Print N queen postion
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


}
