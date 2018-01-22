package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class FreeCellPileTest {

	@Test
	public void InitiallyZeroCardsTest() {
	   FreeCellPile hphearts = new FreeCellPile();
		assertTrue(hphearts.isEmpty());
	}
}
