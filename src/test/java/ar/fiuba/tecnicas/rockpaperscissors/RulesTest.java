package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RulesTest {

    private Move rock = new Rock();
    private Move paper = new Paper();
    private Move scissors = new Scissors();
    private Move fire = new Fire();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }

    @Test
    public void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }

    @Test
    public void rockTieWithRock() {
        assertEquals(rock, rock.vs(rock));
    }

    @Test
    public void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
    }

    @Test
    public void paperLostWithScissors() {
        assertEquals(scissors, paper.vs(scissors));
    }

    @Test
    public void paperTieWithPaper() {
        assertEquals(paper, paper.vs(paper));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
    }

    @Test
    public void scissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
    }

    @Test
    public void scissorsTieWithScissors() {
        assertEquals(scissors, scissors.vs(scissors));
    }
    
    @Test
    public void fireBeatsPaper(){
    	assertEquals(fire, fire.vs(paper));
    }
    
    @Test
    public void fireBeatsScissors(){
    	assertEquals(fire, fire.vs(scissors));
    }
    
    @Test 
    public void fireTieWithFire(){
    	assertEquals(fire, fire.vs(fire));
    }
    
    @Test
    public void rockBeatsFire(){
    	assertEquals(rock, fire.vs(rock));
    }   
    
}
