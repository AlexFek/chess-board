/*
 * Alex Feklistov
 *
 * This training programm is designed to train compliance with the Java Code Convention.
 * The programm displays a chessboard to the user on the console. The board is completely
 * filled with "black" and "white" cells in a chessboard pattern.
 */

/**
 * This class contains the implementation of filling the chessboard and outputting it to
 * the console.
 *
 * @author Alex Feklistov
 */
public class ChessBoard {

    /* Chessboard variables */
    private static final int  BOARD_DIM = 8;
    private static char[][] board = new char[BOARD_DIM][BOARD_DIM];

    /* Chessboard content variables */
    private static char black = 'ч';
    private static char white = 'б';

    /**
     * The main class fills the chessboard with black and white cells.
     *
     * @param args Argument args will not be used
     */
    public static void main(String[] args) {

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (isNewBoardCellBlack(i, j)) {
                    setBoardCellBlack(i, j);
                } else {
                    setBoardCellWhite(i, j);
                }
                printBoardCell(i, j);
            }
        }

    }

    /**
     * This method checks if the cell will be black.
     */
    private static boolean isNewBoardCellBlack(int i, int j) {
        return ((i % 2 == 0) && (j % 2 == 0))
                || ((i % 2 != 0) && (j % 2 != 0));
    }

    /**
     * This method sets the cell value to "black".
     */
    private static void setBoardCellBlack(int i, int j) {
        board[i][j] = black;
    }

    /**
     * This method sets the cell value to "white".
     */
    private static void setBoardCellWhite(int i, int j) {
        board[i][j] = white;
    }

    /**
     * This method displays a chessboard on the console.
     */
    private static void printBoardCell(int i, int j) {
        System.out.print(board[i][j] + " ");
        if(j == board.length - 1) {
            System.out.println();
        }
    }

}
