package ar.fiuba.tecnicas.rockpaperscissors;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class RulesTest {
		
	@Autowired
	@Qualifier("rock")
	private Move rock;

	@Autowired
	@Qualifier("paper")
    private Move paper;
	
	@Autowired
	@Qualifier("scissors")
    private Move scissors;
	
	@Autowired
	@Qualifier("fire")
    private Move fire;

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
