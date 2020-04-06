package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import robkruzel.Die;

public class DieTest {

	@Test
	public void constructorTest() {
		Die die = new Die();
		Integer value = die.getValue();
		assertEquals("0", value.toString());
	}

	@Test
	public void rollDieTest() {
		Die die = new Die();
		die.rollDie();
		assertEquals("4", die.getValue().toString());
	}
}
