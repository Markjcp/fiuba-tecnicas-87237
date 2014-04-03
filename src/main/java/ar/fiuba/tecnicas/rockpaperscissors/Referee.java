package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.List;

public class Referee {

	/**
	 * Decide a winner from two moves
	 * @param move the move
	 * @param challenger the challenger
	 * @param winners the moves who win against the first one
	 * @return the winner move
	 */
	public static Move decideWinner(Move move, Move challenger,
			List<Move> winners) {
		return winners.contains(challenger) ? challenger : move;
	}

}
