package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.List;

public class Paper implements Move {

	private List<Move> winners;

	public Move vs(Move move) {
		return Referee.decideWinner(this, move, winners);
	}

	public void setWinners(List<Move> winners) {
		this.winners = winners;
	}

	@Override
	public boolean equals(Object object) {
		return object instanceof Paper;
	}

}
