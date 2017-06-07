package com.interview.FWD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public Game(AbstractRule rule, Board board) {
		super();
		this.status = GameStatus.PLAYING;// ready to play
		this.rule = rule;
		this.board = board;
	}

	GameStatus status;

	AbstractRule rule;

	Board board;

	List<Player> players = new ArrayList<Player>();
	
	 public static Scanner in = new Scanner(System.in); // the input Scanner

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Player> addPlayer(Player player) {
		this.players.add(player);
		return this.players;
	}

	public GameStatus updateGame(Seed seed, int currentRow, int currentCol) {
		if (rule.hasWon(seed, currentRow, currentCol, board.getBoard())) { // check
																			// if
																			// winning
																			// move
			status = GameStatus.WON;
		} else if (isDraw()) { // check for draw
			status = GameStatus.DRAW;
		}
		return status;
		// Otherwise, no change to currentState (still PLAYING).
	}

	/** Return true if it is a draw (no more empty cell) */
	// TODO: Shall declare draw if no player can "possibly" win
	public boolean isDraw() {
		for (int row = 0; row < board.getRows(); ++row) {
			for (int col = 0; col < board.getCols(); ++col) {
				if (board.getSeed(row, col) == Seed.EMPTY) {
					return false; // an empty cell found, not draw, exit
				}
			}
		}
		return true; // no empty cell, it's a draw
	}

	public void start() {
		// Play the game once
		int i = 0;
		GameStatus currentState = GameStatus.PLAYING;
		do {
			if( i == players.size()){
				i = 0;
			}
			Player currentPlayer = players.get(i);
			int[] moveResult = currentPlayer.move(board.getBoard(),in); // update currentRow and currentCol
			currentState = this.updateGame(currentPlayer.getSeed(), moveResult[0], moveResult[1]);// update
																// currentState
			board.print();
			// Print message if game-over
			if (currentState == GameStatus.WON) {
				System.out.println(currentPlayer.getSeed()+ " "+ GameStatus.WON+"! Bye!");
			} else if (currentState == GameStatus.DRAW) {
				System.out.println("It's a Draw! Bye!");
			}
			// Switch player
			i++;
		} while (currentState == GameStatus.PLAYING); // repeat if not game-over
	}

}
