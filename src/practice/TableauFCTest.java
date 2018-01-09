package practice;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TableauFCTest {

	@Test
	public void Initially6or7CardsTest() {
		
		
		Cards card1 = new Cards(0, 0);
		Cards card2 = new Cards(0, 5);
		Cards card3 = new Cards(1, 2);
		Cards card4 = new Cards(3, 0);
		Cards card5 = new Cards(3, 10);
		Cards card6 = new Cards(2, 8);
		Cards card7 = new Cards(2, 12);
		
		//If there are 7 cards
	    TableauFC tp1 = new TableauFC(card1, card2, card3, card4, card5, card6, card7);
		ArrayList<Cards> list = tp1.getTableauFC();
		assertNotNull(list.get(0));
		assertNotNull(list.get(1));
		assertNotNull(list.get(2));
		assertNotNull(list.get(3));
		assertNotNull(list.get(4));
		assertNotNull(list.get(5));
		assertNotNull(list.get(6));
		
		//If there are 6 cards
		TableauFC tp2 = new TableauFC(card1, card2, card3, card4, card5, card6);
		ArrayList<Cards> list1 = tp2.getTableauFC();
		assertNotNull(list1.get(0));
		assertNotNull(list1.get(1));
		assertNotNull(list1.get(2));
		assertNotNull(list1.get(3));
		assertNotNull(list1.get(4));
		assertNotNull(list1.get(5));
		}
	
	@Test
	public void AddingCardIllegalOrLegalTest(){
		
		Cards card1 = new Cards(0, 3);
		Cards card2 = new Cards(0, 5);
		Cards card3 = new Cards(1, 2);
		Cards card4 = new Cards(3, 0);
		Cards card5 = new Cards(3, 10);
		Cards card6 = new Cards(2, 8);
		Cards card7 = new Cards(2, 12);
		
		Cards addcard1 = new Cards(1, 2);
		Cards addcard2 = new Cards(2, 2);
		Cards addcard3 = new Cards(3, 4);
		Cards addcard4 = new Cards(4, 4);
		
		TableauFC tp1 = new TableauFC(card1, card2, card3, card4, card5, card6, card7);
		ArrayList<Cards> list = tp1.getTableauFC();
		
		assertTrue("Rank is lower and color is different",list.addcard(addcard1));
		assertFalse("Rank is lower but color is same",list.addcard(addcard2));
		assertFalse("Rank is higher and color is different",list.addcard(addcard3));
		assertFalse("Rank is higher and color is same",list.addcard(addcard4));	
		
		TableauFC tp2 = new TableauFC(card1, card2, card3, card4, card5, card6, card7);
		ArrayList<Cards> list = tp2.getTableauFC();
		
		list.removeTopCard();
		list.removeTopCard();
		list.removeTopCard();
		list.removeTopCard();
		list.removeTopCard();
		list.removeTopCard();
		list.removeTopCard();
		
		assertTrue(list.addcard(addcard1));
		assertTrue(list.addcard(addcard2));
		assertTrue(list.addcard(addcard3));
		assertTrue(list.addcard(addcard4));
		
	}
	
	@Test
	public void RemovingCardIllegalOrNot(){
		
		Cards card1 = new Cards(0, 3);
		Cards card2 = new Cards(0, 5);
		Cards card3 = new Cards(1, 2);
		Cards card4 = new Cards(3, 0);
		Cards card5 = new Cards(3, 10);
		Cards card6 = new Cards(2, 8);
		Cards card7 = new Cards(2, 12);
		
		TableauFC tp1 = new TableauFC(card1, card2, card3, card4, card5, card6, card7);
		ArrayList<Cards> list = tp1.getTableauFC();
		
		assertTrue(list.removeTopCard());
		assertFalse("can't remove if there are no cards", list.isEmpty());
		
	}
	
	@Test
	public void AddedCardIsOnTopTest(){
		
		Cards card1 = new Cards(0, 3);
		Cards card2 = new Cards(0, 5);
		Cards card3 = new Cards(1, 2);
		Cards card4 = new Cards(3, 0);
		Cards card5 = new Cards(3, 10);
		Cards card6 = new Cards(2, 8);
		Cards card7 = new Cards(2, 12);
		
		Cards addcard1 = new Cards(1, 2);
		Cards addcard2 = new Cards(2, 2);
		Cards addcard3 = new Cards(3, 4);
		Cards addcard4 = new Cards(4, 4);

		TableauFC tp1 = new TableauFC(card1, card2, card3, card4, card5, card6, card7);
		ArrayList<Cards> list = tp1.getTableauFC();
		
		list.addcard(addcard1);
		list.addcard(addcard2);
		list.addcard(addcard3);
		list.addcard(addcard4);
		assertEquals("tableau pile increased by four and new cards on top", 11, list.size());
		assertSame("card4 is the top card", addcard4, list.get(list.size()-1));
		
		}

	@Test
	public void CardUnderRemovedCardisTopCardTest(){
		
		Cards card1 = new Cards(0, 3);
		Cards card2 = new Cards(0, 5);
		Cards card3 = new Cards(1, 2);
		Cards card4 = new Cards(3, 0);
		Cards card5 = new Cards(3, 10);
		Cards card6 = new Cards(2, 8);
		Cards card7 = new Cards(2, 12);
		
		TableauFC tp1 = new TableauFC(card1, card2, card3, card4, card5, card6, card7);
		ArrayList<Cards> list = tp1.getTableauFC();
		
		list.removeTopCard();
		
		assertEquals("tableau pile decreased by one and card under removed card is top card", 6, list.size());
		assertSame("card4 is the top card", card6, list.get(list.size()-1));
	}

}
