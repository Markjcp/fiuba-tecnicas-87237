package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.List;

public class Rock implements Move {

	private List<Move> winners;

	public Move vs(Move move) {
		return Referee.decideWinner(this, move, winners);
	}

	@Override
	public boolean equals(Object object) {
		return object instanceof Rock;
	}

	public void setWinners(List<Move> winners) {
		this.winners = winners;
	}	

}
