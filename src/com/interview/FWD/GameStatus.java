package com.interview.FWD;

public enum GameStatus {
	WON("won"), DRAW("draw"), PLAYING("playing");

	private final String symbol;

	private GameStatus(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}
}
