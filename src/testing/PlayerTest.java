package testing;

import static org.junit.Assert.*;
import org.junit.Test;
import robkruzel.Player;

public class PlayerTest {

	@Test
	public void constructorTest() {
		Player player = new Player("Rob");
		String name = player.getName();
		Integer currentTile = player.getCurrentTile();
		assertEquals("Rob", name);
		assertEquals("0", currentTile.toString());
	}

}
