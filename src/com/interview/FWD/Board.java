package com.interview.FWD;

public class Board {
	public Board(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		board = new Seed[rows][cols];
		
		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < cols; ++col) {
				board[row][col] = Seed.EMPTY; // all cells empty
			}
		}
	}

	public Seed[][] getBoard() {
		return board;
	}

	private Seed[][] board;
	private int rows;

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	private int cols;

	public Seed getSeed(int row, int col) {
		return board[row][col];
	}

	public void print() {
		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < cols; ++col) {
				printCell(board[row][col]); // print each of the cells
				if (col != cols - 1) {
					System.out.print("|"); // print vertical partition
				}
			}
			System.out.println();
			if (row != rows - 1) {
				System.out.println("-----------"); // print horizontal partition
			}
		}
		System.out.println();
	}

	/** Print a cell with the specified "content" */
	public void printCell(Seed content) {
		System.out.print(" " + content + " ");
	}

}
