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
	public void testScoreBonus() {
		Frame f = new Frame(3,5);
		f.addBonus(5);
		assertEquals(13, f.scoreWithBonus());
		
	}
	
	@Test
	public void testScoreOnGame() {
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(3,5);
		Frame f2 = new Frame(1,2);
		game.addFrame(f1);
		game.addFrame(f2);
		assertEquals(11, game.score());
		
	}
	
	@Test
	public void testScoreOnGameWithSpare() {
		BowlingGame game = new BowlingGame();
		Frame f1 = new Frame(5,5);
		Frame f2 = new Frame(2,2);
		game.addFrame(f1);
		game.addFrame(f2);
		game.dodajBonuseFrejmovima();
		assertEquals(16, game.scoreWithBonus());
		
	}

	
	
}
