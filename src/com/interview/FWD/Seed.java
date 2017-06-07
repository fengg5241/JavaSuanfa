package com.interview.FWD;

public enum Seed {
	EMPTY(" "),
	CROSS("X"),
	NOUGHT("O"),
	SPADE("\u2660"),
    HEART("\u2665"),
    CLUB("\u2663"),
    DIAMOND("\u2666");
	
    private final String symbol;

    private Seed(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
