package practice;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class HomeCellTest {

	@Test
	public void InitiallyZeroCardsTest() {
		HomeCellPile hphearts = new HomeCellPile();
		assertTrue(hphearts.isEmpty());
	}
	
	@Test
	public void AddingCardIllegalOrNotTest() {
		Cards card1 = new Cards(0, 0);
		Cards card2 = new Cards(0, 1);
		Cards card3 = new Cards(0, 2);
		Cards card4 = new Cards(0, 3);
		Cards card5 = new Cards(0, 4);
		
		Cards addcard1 = new Cards(0, 5);
		Cards addcard2 = new Cards(1, 6);
		
		HomeCellPile hphearts = new HomeCellPile(card1, card2, card3, card4, card5);
		ArrayList<Cards> list = hphearts.getHomeCellPile();
		
		assertTrue("Same suit and immediate rank",list.add(addcard1));
		assertFalse("Different suit but immediate rank",list.add(addcard2));
	}
	
	@Test
	public void RemovingTopCardTest(){
		HomeCellPile hphearts = new HomeCellPile();
		assertFalse(hphearts);
	}
	
	@Test
	public void AddedCardIsOnTopTest(){
		
		Cards card1 = new Cards(0, 0);
		Cards card2 = new Cards(0, 1);
		Cards card3 = new Cards(0, 2);
		Cards card4 = new Cards(0, 3);
		Cards card5 = new Cards(0, 4);
		
		Cards addcard1 = new Cards(0, 5);
		Cards addcard2 = new Cards(0, 6);
		
		HomeCellPile hphearts = new HomeCellPile(card1, card2, card3, card4, card5);
		ArrayList<Cards> list = hphearts.getHomeCellPile();
		
		list.addcard(addcard1);
		list.addcard(addcard2);
		
		assertEquals("tableau pile increased by four and new cards on top", 11, list.size());
		assertSame("card4 is the top card", addcard2, list.get(list.size()-1));
		
		}

}
