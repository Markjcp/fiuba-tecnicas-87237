package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;

public class Paper implements Move{
	
	private List<Move> winners=new ArrayList<Move>();
	
	private void loadWinners(){
		this.winners.add(new Scissors());
		this.winners.add(new Fire());
	}
	
	public Move vs(Move move) {
		loadWinners();
		return Referee.decideWinner(this, move, winners);
	}
	
	@Override
	public boolean equals(Object object){
		return object instanceof Paper;
	}

}
