package com.company.Java_Sudoku_dsa;

public class Practise_01 {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        //  check row &colum
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) return false;
            if (board[row][i] == (char) (number + '0')) return false;
            }
        //   check 3 * 3 grid

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) return false;
                }
            }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {

        // base case
        if (row == board.length) {
            return true;
        }
        // next cell
        int nrow = 0;
        int ncol = 0;
        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }
        // if already filled
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {

            // try numbers 1 to 9
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {

                    // place  number
                    board[row][col] = (char) (i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }
                    // backtrack
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {

        helper(board,0,0);
    }

    public static void main(String[] args) {
        char[][] board ={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        Practise_01 obj = new Practise_01();
        obj.solveSudoku(board);

        // print solved board
        System.out.println("solved sudoku");
        for (int i =0; i<9;i++){
            for (int j=0; j<9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

