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

}
