package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.List;

public interface Move {

	/**
	 * Defines a winner from a given game
	 * @param move challenger move
	 * @return winning move
	 */
	Move vs(Move move);
	
	/**
	 * Load which moves are winner against this Move
	 * @param winners winner moves
	 */
	void setWinners(List<Move> winners);

}
