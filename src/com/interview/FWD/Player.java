package com.interview.FWD;

import java.util.Scanner;

public class Player {
	public Player(Seed seed) {
		super();
		this.seed = seed;
	}

	private Seed seed;
	
	public Seed getSeed() {
		return seed;
	}

	public void setSeed(Seed seed) {
		this.seed = seed;
	}

	/**
	 * Player with the "theSeed" makes one move, with input validation. Update
	 * global variables "currentRow" and "currentCol".
	 */
	public int[] move(Seed[][] board, Scanner in) {
		boolean validInput = false; // for input validation
		int row,col;
		do {
			System.out.print("Player "+ seed.toString()+", enter your move (row[1-3] column[1-3]): ");
			row = in.nextInt() - 1; // array index starts at 0 instead of 1
			col = in.nextInt() - 1;
			if (row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == Seed.EMPTY) {
				board[row][col] = seed; // update game-board
														// content
				validInput = true; // input okay, exit loop
			} else {
				System.out.println("This move at (" + (row + 1) + "," + (col + 1) + ") is not valid. Try again...");
			}
		} while (!validInput); // repeat until input is valid
		
		int[] moveResult = {row,col};
		return moveResult;
	}
}
