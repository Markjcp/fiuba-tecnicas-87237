package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;

public class Fire implements Move {
	
private List<Move> winners = new ArrayList<Move>();
	
	private void loadWinners(){
		this.winners.add(new Rock());
	}

	public Move vs(Move move) {
		loadWinners();
		return Referee.decideWinner(this, move, winners);
	}
	
	@Override
	public boolean equals(Object object){
		return object instanceof Fire;
	}

}
