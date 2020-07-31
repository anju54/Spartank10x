package Day14;

import java.util.Scanner;

public class CheckString {

    public static int find(Character[][] board, String word)
    {
        int row= board.length;
        int col= board[0].length;

        for(int i=0; i< row; i++)
        {
            for(int j=0; j< col; j++)
            {
                if(word.charAt(0)==board[i][j] && findNext(board, word, i, j, 0) )
                    return 1;
            }
        }
        return 0;
    }

    public static boolean findNext(Character[][] board, String word, int i, int j, int index)
    {
        //base case
        if(index== word.length())
            return true;

        if( i<0  || j<0  || i>= board.length  || j>= board[0].length)
            return false;

        if(word.charAt(index)!=board[i][j])
            return false;

        char temp= board[i][j]; // keeping the current value if later later on we have to do backtrack
        board[i][j]='#'; // to mark that position is visited

        //recursive case
        if(findNext(board, word, i+1, j, index+1)  ||
                findNext(board, word, i-1, j, index+1) ||
                findNext(board, word, i, j+1, index+1) ||
                findNext(board, word, i, j-1, index+1) )
            return true;

        board[i][j]=temp; // for backtracking
        return false;

    }

    public static void main(String[] args) {
        int row = 3, col = 4;
        // Input array
        Character[][] board = new Character[row][col];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3*4 matrix of character");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }

        // the 2D array is here.
        System.out.print("The Array is :\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }

        int res = find(board,"SEE");
        System.out.println(res);
    }
}
