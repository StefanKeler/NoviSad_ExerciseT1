import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testStrike() {
		Frame f = new Frame(10,0);
		assertTrue(f.isStrike());
		
	}

}
