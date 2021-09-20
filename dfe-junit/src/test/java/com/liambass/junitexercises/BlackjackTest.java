
package com.liambass.junitexercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BlackjackTest {

	@Test
	public void invalidDHandTest() {
		assertEquals(-1, Blackjack.play(1, 13));
	}

	@Test
	public void invalidPHandTest() {
		assertEquals(-1, Blackjack.play(25, 0));
	}

	@Test
	public void dBustTest() {
		assertEquals(12, Blackjack.play(25, 12));
	}

	@Test
	public void pBustTest() {
		assertEquals(21, Blackjack.play(21, 22));
	}

	@Test
	public void bothBustTest() {
		assertEquals(0, Blackjack.play(25, 22));
	}

	@Test
	public void dWinsTest() {
		assertEquals(20, Blackjack.play(20, 17));
	}

	@Test
	public void pWinsTest() {
		assertEquals(17, Blackjack.play(14, 17));
	}

	@Test
	public void classTest() {
		Blackjack bj = new Blackjack();
		assertTrue(bj instanceof Object);
	}
}
