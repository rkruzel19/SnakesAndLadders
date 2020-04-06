package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import robkruzel.SnakesAndLadders;

public class SnakesAndLaddersTest {

//	@Test
//	public void constructorTest() {
//		
//	}
//	
//	@Test
//	public void startGameTest() {
//		//SnakesAndLadders sal = new SnakesAndLadders();
//	}

	@Test
	public void rolledDoublesTest() {
		SnakesAndLadders sal = new SnakesAndLadders();
		boolean actual = sal.rolledDoubles(2, 2);
		assertEquals(true, actual);
		actual = sal.rolledDoubles(4, 2);
		assertEquals(false, actual);
	}
}
