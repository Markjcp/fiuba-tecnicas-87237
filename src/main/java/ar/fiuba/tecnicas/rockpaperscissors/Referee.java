package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.List;

public class Referee {

	public static Move decideWinner(Move move, Move challenger,
			List<Move> winners) {
		return winners.contains(challenger) ? challenger : move;
	}

}
