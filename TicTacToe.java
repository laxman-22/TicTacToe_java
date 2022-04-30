/**
 * A class modelling a tic-tac-toe game
 * 
 * @author Aryan Laxman Sirohi
 * @version March 29, 2022
 */

public class TicTacToe {

    public static final String PLAYER_X = "X"; // player using "X"
    public static final String PLAYER_O = "O"; // player using "O"
    public static final String EMPTY = " ";  // empty cell
    public static final String TIE = "T"; // game ended in a tie
  
    public String player;   // current player (PLAYER_X or PLAYER_O)
 
    public String winner;   // winner: PLAYER_X, PLAYER_O, TIE, EMPTY = in progress
 
    private int numFreeSquares; // number of squares still free
    
    private String board[][]; // 3x3 array representing the board

    /**
     * Sets everything up for a new game.  Marks all squares in the Tic Tac Toe board as empty,
     * and indicates no winner yet, 9 free squares and the current player is player X.
     */
    public TicTacToe() {
        board = new String[3][3];
        clearBoard();
    }

    public void clearBoard()
    {
       for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
             board[i][j] = EMPTY;
          }
       }
       winner = EMPTY;
       numFreeSquares = 9;
       player = PLAYER_X;     // Player X always has the first turn.
    }

    /**
    * Plays one game of Tic Tac Toe.
    */
    public void playGame(int row, int col)
    {
        if (winner == EMPTY) {
            board[row][col] = player;
            numFreeSquares--;
            if (haveWinner(row, col)) {
                winner = player;
            }
            else if (numFreeSquares == 0) {
                winner = TIE;
            }
            
            if (player == PLAYER_X) {
                player = PLAYER_O;

            }
            else {
                player = PLAYER_X;
            }
        }
 
    } 
 
 
    /**
     * Returns true if filling the given square gives us a winner, and false
     * otherwise.
     *
     * @param int row of square just set
     * @param int col of square just set
     * 
     * @return true if we have a winner, false otherwise
     */
    private boolean haveWinner(int row, int col) 
    {
        // unless at least 5 squares have been filled, we don't need to go any further
        // (the earliest we can have a winner is after player X's 3rd move).
 
        if (numFreeSquares>4) {return false;}
 
        // Note: We don't need to check all rows, columns, and diagonals, only those
        // that contain the latest filled square.  We know that we have a winner 
        // if all 3 squares are the same, as they can't all be blank (as the latest
        // filled square is one of them).
 
        // check row "row"
        if ( board[row][0].equals(board[row][1]) &&
             board[row][0].equals(board[row][2])) {return true;}
        
        // check column "col"
        if ( board[0][col].equals(board[1][col]) &&
             board[0][col].equals(board[2][col]) ) {return true;}
 
        // if row=col check one diagonal
        if (row==col)
           if ( board[0][0].equals(board[1][1]) &&
                board[0][0].equals(board[2][2]) ) {return true;}
 
        // if row=2-col check other diagonal
        if (row==2-col)
           if ( board[0][2].equals(board[1][1]) &&
                board[0][2].equals(board[2][0]) ) {return true;}
 
        // no winner yet
        return false;
    }
}
