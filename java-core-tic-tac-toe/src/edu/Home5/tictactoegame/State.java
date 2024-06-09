package edu.Home5.tictactoegame;

public enum State {
	NONE,
	O,
	X;

	public static State byGamer(Gamer gamer) {
		return gamer.equals(Gamer.O) ? O : X;
	}
}
