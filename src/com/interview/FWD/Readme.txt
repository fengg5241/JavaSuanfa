What I have changed in my assignment:
1 Make application object-oriented, create Board, Game, Player as module class.
2 Create Enum class:GameStatus and Seed instead of static variable.
3 Make the application easy to extend:
1) Support multiple seed, not only cross and nought. 
	EMPTY(" "),
	CROSS("X"),
	NOUGHT("O"),
	SPADE("\u2660"),
    HEART("\u2665"),
    CLUB("\u2663"),
    DIAMOND("\u2666");
    
2) Support multiple players.

	  Game game = new Game(rule, board);
      Player player1 = new Player(Seed.CROSS);
      Player player2 = new Player(Seed.NOUGHT);
      ...
      Player playern = new Player(Seed.XX); 
      game.addPlayer(player1).add(player2).....add(playern);
      
3) Easy to change game rule to win.
	Create a new rule class to extend AbstractRule.java and override hasWon method.
	For my assignment, I create NormalTTTRule and override hasWon method with example logic.
	The rule should be field of game.
	
	
	NormalTTTRule rule = new NormalTTTRule();
	Board board = new Board(3, 3);
	  
    Game game = new Game(rule, board);
    
4) Easy to change size of game board.
	Board board = new Board(3, 3); //3*3 board

4 Run main method of TTTConsoleOO2P.java can test application.
Note: Please check source code are in correct package before running, if not, please correct them.