package com.company;

public class TicTacToe {
    private String regex = "\\s{3}";
    private String[][] board;
    private static final int COLUMNS = 3;
    private static final int ROWS = 3;
    public boolean isGameOver(){
        //checking rows
        for(int i = 0; i < ROWS; i++) {
            if(!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
        }
        //checking columns

        for(int j = 0; j < COLUMNS; j++) {
            if(!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]))
                return true;
        }
        //checking diagonals
        if(!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
            return true;
        if(!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
            return true;
        //no body's won
        return false;

    }

}
