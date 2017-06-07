package com.interview.FWD;

/**
 * Tic-Tac-Toe: Two-player console, non-graphics, OO version.
 */
public class TTTConsoleOO2P {
 
   /** The entry main method (the program starts here) */
   public static void main(String[] args) {
      // Initialize the game-board and current status
	  NormalTTTRule rule = new NormalTTTRule();
	  Board board = new Board(3, 3);
	  
      Game game = new Game(rule, board);
      Player player1 = new Player(Seed.CROSS);
      Player player2 = new Player(Seed.NOUGHT);
      game.addPlayer(player1).add(player2);
      game.start();
   }
 
}