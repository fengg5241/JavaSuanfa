package com.interview.FWD;

public class NormalTTTRule extends AbstractRule {

	@Override
	public boolean hasWon(Seed theSeed, int currentRow, int currentCol, Seed[][] board) {
	      return (board[currentRow][0] == theSeed         // 3-in-the-row
                  && board[currentRow][1] == theSeed
                  && board[currentRow][2] == theSeed
             || board[0][currentCol] == theSeed      // 3-in-the-column
                  && board[1][currentCol] == theSeed
                  && board[2][currentCol] == theSeed
             || currentRow == currentCol            // 3-in-the-diagonal
                  && board[0][0] == theSeed
                  && board[1][1] == theSeed
                  && board[2][2] == theSeed
             || currentRow + currentCol == 2  // 3-in-the-opposite-diagonal
                  && board[0][2] == theSeed
                  && board[1][1] == theSeed
                  && board[2][0] == theSeed);
	}

}
