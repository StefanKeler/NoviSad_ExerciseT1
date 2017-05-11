import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testStrike() {
		Frame f = new Frame(10,0);
		assertTrue(f.isStrike());
		
	}
	
	@Test
	public void testSpare() {
		Frame f = new Frame(5,5);
		assertTrue(f.isSpare());
		
	}
	
	@Test
	public void testScore() {
		Frame f = new Frame(3,5);
		assertEquals(8, f.score());
		
	}
	
	@Test
	public void testScoreOnGame() {
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(3,5);
		Frame f2 = new Frame(1,2);
		assertEquals(11, game.score());
		
	}

}
