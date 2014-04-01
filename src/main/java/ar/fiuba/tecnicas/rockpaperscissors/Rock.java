package ar.fiuba.tecnicas.rockpaperscissors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Rock implements Move{
	
	@Autowired
	private Paper paper;
	
	private List<Move> winners=new ArrayList<Move>();
	
	private void loadWinners(){
		this.winners.add(new Paper());
	}

	public Move vs(Move move) {
		loadWinners();
		return Referee.decideWinner(this, move, winners);
	}
	
	@Override
	public boolean equals(Object object){
		return object instanceof Rock;
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		Rock rock= (Rock) context.getBean("rock");
		rock.vs(rock);
	}

}
