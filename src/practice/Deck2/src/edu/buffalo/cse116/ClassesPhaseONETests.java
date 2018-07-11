package edu.buffalo.cse116;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;


import org.junit.Test;

// NOTE: "FC" refers to the FreeCell game, "BD" refers to the BakersDozen game
	public class ClassesPhaseONETests {
		
		@Test 
		public void FreecellGameInstanceTest(){
			TableauPileFC tp1 = new TableauPileFC(null, null, null, null,null,null,null);
			TableauPileFC tp2 = new TableauPileFC(null, null, null, null,null,null,null);
			TableauPileFC tp3 = new TableauPileFC(null, null, null, null,null,null,null);
			TableauPileFC tp4 = new TableauPileFC(null, null, null, null,null,null,null);
			TableauPileFC tp5 = new TableauPileFC(null, null, null, null,null,null);
			TableauPileFC tp6 = new TableauPileFC(null, null, null, null,null,null);
			TableauPileFC tp7 = new TableauPileFC(null, null, null, null,null,null);
			TableauPileFC tp8 = new TableauPileFC(null, null, null, null,null,null);

			HomecellPile hc1 = new HomecellPile();
			HomecellPile hc2 = new HomecellPile();
			HomecellPile hc3 = new HomecellPile();
			HomecellPile hc4 = new HomecellPile();
			
			FreecellPile fc1 = new FreecellPile();
			FreecellPile fc2 = new FreecellPile();
			FreecellPile fc3 = new FreecellPile();
			FreecellPile fc4 = new FreecellPile();
			
			Freecell game  = new Freecell(tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, hc1, hc2, hc3, hc4, fc1, fc2, fc3, fc4);
			
			assertEquals(tp1, game.getTpile1());
			assertEquals(tp2, game.getTpile2());
			assertEquals(tp3, game.getTpile3());
			assertEquals(tp4, game.getTpile4());
			assertEquals(tp5, game.getTpile5());
			assertEquals(tp6, game.getTpile6());
			assertEquals(tp7, game.getTpile7());
			assertEquals(tp8, game.getTpile8());
			
			assertEquals(hc1, game.getHpile1());
			assertEquals(hc2, game.getHpile2());
			assertEquals(hc3, game.getHpile3());
			assertEquals(hc4, game.getHpile4());
			
			assertEquals(fc1, game.getFpile1());
			assertEquals(fc2, game.getFpile2());
			assertEquals(fc3, game.getFpile3());
			assertEquals(fc4, game.getFpile4());
		}
		
		@Test
		public void Initial7or6CardsInTableauPileFCTest(){
			cards card1 = new cards(0, 1, "Black");
			cards card2 = new cards(1, 2, "Red");
			cards card3 = new cards(2, 3, "Red");
			cards card4 = new cards(3, 4, "Black");
			cards card5 = new cards(1, 5, "Red");
			cards card6 = new cards(2, 7, "Red");
			cards card7 = new cards(3, 9, "Black");
			
			TableauPileFC tp1 = new TableauPileFC(card1, card2, card3, card4, card5,card6,card7);
			ArrayList<cards> list = tp1.getTableauArrayList();
			assertNotNull(list.get(0));
			assertNotNull(list.get(1));
			assertNotNull(list.get(2));
			assertNotNull(list.get(3));
			assertNotNull(list.get(4));
			assertNotNull(list.get(5));
			assertNotNull(list.get(6));
			assertEquals(7, list.size());
			
			TableauPileFC tp2 = new TableauPileFC(card1, card2, card3, card4, card5,card6);
			ArrayList<cards> list2 = tp2.getTableauArrayList();
			assertNotNull(list2.get(0));
			assertNotNull(list2.get(1));
			assertNotNull(list2.get(2));
			assertNotNull(list2.get(3));
			assertNotNull(list2.get(4));
			assertNotNull(list2.get(5));
			assertEquals(6, list2.size());
		}
		
		@Test
		public void TableauPileFCAddCardIsIllegalOrLegalTest(){
			cards card8 = new cards(2, 5,"Red");
			cards card9 = new cards(2, 6,"Red");
			cards card10 = new cards(3, 2, "Black");
			cards card11 = new cards(2, 10, "Red");
			cards card12 = new cards(0, 8, "Black");
			cards card13 = new cards(1, 4, "Red");
			
			cards addCard = new cards(1,3, "Black");  
			cards addCard1 = new cards(1, 3, "Red");
			cards addCard2 = new cards(1, 7, "Red");
			cards addCard3 = new cards(1, 7, "Black");
			
			TableauPileFC tp2 = new TableauPileFC(card8,card9,card10, card11, card12, card13);
			assertTrue("card should be added",tp2.addCard(addCard));
			assertFalse("The color of the card added should be different than the current card.",tp2.addCard(addCard1));
			assertFalse("Card should not be added because rank is to high, and color is same.", tp2.addCard(addCard2));
			assertFalse("Card should not be added because rank is to high, even though color is different.", tp2.addCard(addCard3));
			
			TableauPileFC tp3 = new TableauPileFC(card8,card9,card10, card11, card12, card13);
			tp3.removingTopCard();
			tp3.removingTopCard();
			tp3.removingTopCard();
			tp3.removingTopCard();
			tp3.removingTopCard();
			tp3.removingTopCard();
			
			assertTrue(tp3.addCard(addCard2));
		}
		
		@Test
		public void TableauPileFCAddCardIncreasesSizeTest(){
			cards card14 = new cards(2, 5,"Red");
			cards card15 = new cards(2, 6,"Red");
			cards card16 =  new cards(0, 10, "Black");
			cards card17 =  new cards(0, 9, "Black");
			cards card18 =  new cards(0, 7, "Black");
			cards card19 =  new cards(0, 1, "Black");
			cards addCard3 = new cards(1, 2, "Red");
			
			TableauPileFC tp4 = new TableauPileFC(card14, card15, card16, card17, card18,card19);
			assertEquals(6, tp4.getTableauArrayList().size());
			if(tp4.addCard(addCard3)){
			assertEquals(7, tp4.getTableauArrayList().size());
			assertEquals("now the new top card is addCard3", addCard3, tp4.getTableauArrayList().get(tp4.getTableauArrayList().size()-1));
			}
		}
		
		@Test
		public void FCTableauPileRemovingTopCardIsIllegalOrLegalTest(){
			cards card20 = new cards(2, 5,"Red");
			cards card21 = new cards(2, 6,"Red");
			cards card22 = new cards(0,11,"Black");
			cards card23 = new cards(3, 9, "Black");
			cards card24 = new cards(2, 3, "Red");
			cards card25 = new cards(1, 2, "Red");
			
			TableauPileFC tp5 = new TableauPileFC(card20, card21, card22, card23, card24,card25);
			assertTrue(tp5.removingTopCard());
			
			TableauPileFC tp6 = new TableauPileFC(card20, card21, card22, card23, card24,card25);
			tp6.removingTopCard();
			tp6.removingTopCard();
			tp6.removingTopCard();
			tp6.removingTopCard();
			tp6.removingTopCard();
			tp6.removingTopCard();
			
			assertFalse(tp6.removingTopCard());
		}
		
		@Test
		public void FCTableauPileRemovingTopCardDecreasesSizeTest(){
			cards card13 = new cards(0,11,"Black");
			cards card14 = new cards(3, 9, "Black");
			cards card15 = new cards(2, 3, "Red");
			cards card16 = new cards(1, 2, "Red");
			cards card17 = new cards(2, 5,"Red");
			cards card18 = new cards(2, 6,"Red");
			cards card19 = new cards(0,11,"Black");
			
			TableauPileFC tp5 = new TableauPileFC(card13, card14, card15, card16, card17, card18, card19);
			assertEquals(7, tp5.getTableauArrayList().size());
			if(tp5.removingTopCard()){
				assertEquals(6,tp5.getTableauArrayList().size());
				assertEquals("card18 is the new top card", card18, tp5.getTableauArrayList().get(tp5.getTableauArrayList().size()-1));
			}
		}
		
		@Test
		public void Initial0CardsInFCHomeCellPileTest(){
			HomecellPile hc1 = new HomecellPile();
			assertEquals(0,hc1.getHomecellArrayList().size());
		}
		
		@Test
		public void FCHomeCellPileAddCardIsIllegalOrLegalTest(){
			cards AceClubs = new cards(0, 0, "Black");
			cards AceDiamonds = new cards(1, 0, "Red");
			cards AceHeart = new cards(2, 0, "Red");
			cards AceSpades = new cards(3, 0, "Black");
			
			cards twoClubs = new cards(0, 1, "Black");
			cards twoDiamonds = new cards(1, 1, "Red");
			cards twoHeart = new cards(2, 1, "Red");
			cards twoSpades = new cards(3, 1, "Black");
			
			cards fiveHeart = new cards(2, 4, "Red");
			
			HomecellPile hc2 = new HomecellPile();
			assertTrue(hc2.addCard(AceClubs));
			assertEquals(AceClubs, hc2.getHomecellArrayList().get(0));
			assertFalse(hc2.addCard(AceDiamonds));
			assertFalse(hc2.addCard(twoHeart));
			assertTrue(hc2.addCard(twoClubs));
			
			HomecellPile hc3 = new HomecellPile();
			assertTrue(hc3.addCard(AceDiamonds));
			assertEquals(AceDiamonds, hc3.getHomecellArrayList().get(0));
			assertFalse(hc3.addCard(AceClubs));
			assertFalse(hc3.addCard(twoClubs));
			assertTrue(hc3.addCard(twoDiamonds));
			
			HomecellPile hc4 = new HomecellPile();
			assertTrue(hc4.addCard(AceHeart));
			assertEquals(AceHeart, hc4.getHomecellArrayList().get(0));
			assertFalse(hc4.addCard(AceHeart));
			assertFalse(hc4.addCard(fiveHeart));
			assertTrue(hc4.addCard(twoHeart));
			
			HomecellPile hc5 = new HomecellPile();
			assertTrue(hc5.addCard(AceSpades));
			assertEquals(AceSpades, hc5.getHomecellArrayList().get(0));
			assertFalse(hc5.addCard(AceSpades));
			assertFalse(hc5.addCard(twoHeart));
			assertTrue(hc5.addCard(twoSpades));
			
			HomecellPile hc6 = new HomecellPile();
			assertFalse(hc6.addCard(fiveHeart));
		}
		
		@Test
		public void FCHomeCellPileAddCardIncreasesSizeTest(){
			cards AceClubs = new cards(0, 0, "Black");
			cards twoClubs = new cards(0, 1, "Black");
			
			HomecellPile hc7 = new HomecellPile();
			assertEquals(0, hc7.getHomecellArrayList().size());
			hc7.addCard(AceClubs);
			assertEquals(1, hc7.getHomecellArrayList().size());
			hc7.addCard(twoClubs);
			assertEquals(2, hc7.getHomecellArrayList().size());
		}
		
		@Test
		public void FCHomeCellPileRemovingTopCardIsIllegalOrLegalTest(){
			cards AceClubs = new cards(0, 0, "Black");
			cards twoClubs = new cards(0, 1, "Black");
			
			HomecellPile hc8 = new HomecellPile();
			assertFalse(hc8.removeingTopCard());
			
			HomecellPile hc9 = new HomecellPile();
			hc8.addCard(AceClubs);
			hc8.addCard(twoClubs);
			assertFalse(hc9.removeingTopCard());
		}
		
		@Test
		public void FreeCellPileInitiallyHolds0Cards(){
			FreecellPile fc1 = new FreecellPile();
			assertEquals("Freecell pile should be empty at the beginning of a game", 0, fc1.getArrayList().size());
		}
		
		@Test
		public void FreeCellPileAddCardIsIllegalOrLegalTest(){
			cards card1 = new cards(0,5,"Black");
			cards addCard = new cards (0, 1, "Black");
			FreecellPile fc1 = new FreecellPile();
			assertTrue(fc1.addCard(card1));
			
			cards card2 = new cards(0,2,"Black");
			FreecellPile fc2 = new FreecellPile();
			fc2.addCard(card2);
			assertFalse("freecell pile can only contain one card", fc2.addCard(addCard));
		}
		
		@Test
		public void FreeCellPileAddCardIncreasesSizeTest(){
			cards card1 = new cards(0,5,"Black");
			FreecellPile fc1 = new FreecellPile();
			assertEquals(0, fc1.getArrayList().size());
			assertTrue(fc1.addCard(card1));
			assertEquals(1, fc1.getArrayList().size());
			assertEquals("card1 is the new top card", card1, fc1.getArrayList().get(fc1.getArrayList().size()-1));
		}
		
		@Test
		public void FreeCellPileRemoveTopCardIsIllegalOrLegalTest(){
			FreecellPile fc1 = new FreecellPile();
			assertFalse(fc1.removeTopCard());
			
			FreecellPile fc2 = new FreecellPile();
			cards card1 = new cards(0,5,"Black");
			fc2.addCard(card1);
			assertTrue(fc2.removeTopCard());
		}
		
		
		@Test 
		public void BakersDozenGameInstanceTest(){
			TableauPileBD tp1 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp2 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp3 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp4 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp5 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp6 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp7 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp8 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp9 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp10 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp11 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp12 = new TableauPileBD(null, null, null, null);
			TableauPileBD tp13 = new TableauPileBD(null, null, null, null);
			
			HomecellPile hc1 = new HomecellPile();
			HomecellPile hc2 = new HomecellPile();
			HomecellPile hc3 = new HomecellPile();
			HomecellPile hc4 = new HomecellPile();
			BakersDozen game  = new BakersDozen(tp1, tp2, tp3, tp4, tp5, tp6, tp7, tp8, tp9, tp10, tp11, tp12, tp13, hc1, hc2, hc3, hc4);
			
			assertEquals(tp1, game.getTpile1());
			assertEquals(tp2, game.getTpile2());
			assertEquals(tp3, game.getTpile3());
			assertEquals(tp4, game.getTpile4());
			assertEquals(tp5, game.getTpile5());
			assertEquals(tp6, game.getTpile6());
			assertEquals(tp7, game.getTpile7());
			assertEquals(tp8, game.getTpile8());
			assertEquals(tp9, game.getTpile9());
			assertEquals(tp10, game.getTpile10());
			assertEquals(tp11, game.getTpile11());
			assertEquals(tp12, game.getTpile12());
			assertEquals(tp13, game.getTpile13());
			
			assertEquals(hc1, game.getHpile1());
			assertEquals(hc2, game.getHpile2());
			assertEquals(hc3, game.getHpile3());
			assertEquals(hc4, game.getHpile4());
		}
		
		@Test
		public void Initial4CardsInTableauPileBDTest(){
			cards card1 = new cards(0, 1, "Black");
			cards card2 = new cards(1, 2, "Red");
			cards card3 = new cards(2, 3, "Red");
			cards card4 = new cards(3, 4, "Black");
			
			TableauPileBD tp1 = new TableauPileBD(card1, card2, card3, card4);
			ArrayList<cards> list = tp1.getTableauArrayList();
			assertNotNull(list.get(0));
			assertNotNull(list.get(1));
			assertNotNull(list.get(2));
			assertNotNull(list.get(3));
			assertEquals(4, list.size());
		}
		
		@Test
		public void BDTableauPileAddCardIsIllegalOrLegalTest(){
			cards card5 = new cards(3, 2, "Black");
			cards card6 = new cards(2, 10, "Red");
			cards card7 = new cards(0, 8, "Black");
			cards card8 = new cards(1, 4, "Red");
			cards addCard = new cards(1,3, "Red");
			cards addCard1 = new cards(0, 8, "Black");
			cards addCard2 = new cards(1, 7, "Red");
			
			TableauPileBD tp2 = new TableauPileBD(card5, card6, card7, card8);
			assertTrue(tp2.addCard(addCard));
			assertFalse(tp2.addCard(addCard1));
			
			TableauPileBD tp3 = new TableauPileBD(card5, card6, card7, card8);
			tp3.removingTopCard();
			tp3.removingTopCard();
			tp3.removingTopCard();
			tp3.removingTopCard();
			
			assertFalse(tp3.addCard(addCard2));
		}
		
		@Test
		public void BDTableauPileAddCardIncreasesSizeTest(){
			cards card9 =  new cards(0, 10, "Black");
			cards card10 =  new cards(0, 9, "Black");
			cards card11 =  new cards(0, 7, "Black");
			cards card12 =  new cards(0, 1, "Black");
			cards addCard3 = new cards(1, 2, "Red");
			
			TableauPileBD tp4 = new TableauPileBD(card9, card10, card11, card12);
			assertEquals(4, tp4.getTableauArrayList().size());
			if(tp4.addCard(addCard3)){;
			assertEquals(5, tp4.getTableauArrayList().size());
			assertEquals("addCard3 is the new top card", addCard3, tp4.getTableauArrayList().get(tp4.getTableauArrayList().size()-1));
			}
		}
		
		@Test
		public void BDTableauPileRemovingTopCardIsIllegalOrLegalTest(){
			cards card13 = new cards(0,11,"Black");
			cards card14 = new cards(3, 9, "Black");
			cards card15 = new cards(2, 3, "Red");
			cards card16 = new cards(1, 2, "Red");
			
			TableauPileBD tp5 = new TableauPileBD(card13, card14, card15, card16);
			assertTrue(tp5.removingTopCard());
			
			TableauPileBD tp6 = new TableauPileBD(card13, card14, card15, card16);
			tp6.removingTopCard();
			tp6.removingTopCard();
			tp6.removingTopCard();
			tp6.removingTopCard();
			
			assertFalse(tp6.removingTopCard());
		}
		
		@Test
		public void BDTableauPileRemovingTopCardDecreasesSizeTest(){
			cards card13 = new cards(0,11,"Black");
			cards card14 = new cards(3, 9, "Black");
			cards card15 = new cards(2, 3, "Red");
			cards card16 = new cards(1, 2, "Red");
			
			TableauPileBD tp5 = new TableauPileBD(card13, card14, card15, card16);
			assertEquals(4, tp5.getTableauArrayList().size());
			if(tp5.removingTopCard()){
				assertEquals(3,tp5.getTableauArrayList().size());
				assertEquals("card15 is the new top card", card15, tp5.getTableauArrayList().get(tp5.getTableauArrayList().size()-1));
			}
		}
		
		@Test
		public void Initial0CardsInHomeCellPileBDTest(){
			HomecellPile hc1 = new HomecellPile();
			assertEquals(0,hc1.getHomecellArrayList().size());
		}
		
		@Test
		public void HomeCellPileBDAddCardIsIllegalOrLegalTest(){
			cards AceClubs = new cards(0, 0, "Black");
			cards AceDiamonds = new cards(1, 0, "Red");
			cards AceHeart = new cards(2, 0, "Red");
			cards AceSpades = new cards(3, 0, "Black");
			
			cards twoClubs = new cards(0, 1, "Black");
			cards twoDiamonds = new cards(1, 1, "Red");
			cards twoHeart = new cards(2, 1, "Red");
			cards twoSpades = new cards(3, 1, "Black");
			
			cards fiveHeart = new cards(2, 4, "Red");
			
			HomecellPile hc2 = new HomecellPile();
			assertTrue(hc2.addCard(AceClubs));
			assertEquals(AceClubs, hc2.getHomecellArrayList().get(0));
			assertFalse(hc2.addCard(AceDiamonds));
			assertFalse(hc2.addCard(twoHeart));
			assertTrue(hc2.addCard(twoClubs));
			
			HomecellPile hc3 = new HomecellPile();
			assertTrue(hc3.addCard(AceDiamonds));
			assertEquals(AceDiamonds, hc3.getHomecellArrayList().get(0));
			assertFalse(hc3.addCard(AceClubs));
			assertFalse(hc3.addCard(twoClubs));
			assertTrue(hc3.addCard(twoDiamonds));
			
			HomecellPile hc4 = new HomecellPile();
			assertTrue(hc4.addCard(AceHeart));
			assertEquals(AceHeart, hc4.getHomecellArrayList().get(0));
			assertFalse(hc4.addCard(AceHeart));
			assertFalse(hc4.addCard(fiveHeart));
			assertTrue(hc4.addCard(twoHeart));
			
			HomecellPile hc5 = new HomecellPile();
			assertTrue(hc5.addCard(AceSpades));
			assertEquals(AceSpades, hc5.getHomecellArrayList().get(0));
			assertFalse(hc5.addCard(AceSpades));
			assertFalse(hc5.addCard(twoHeart));
			assertTrue(hc5.addCard(twoSpades));
			
			HomecellPile hc6 = new HomecellPile();
			assertFalse(hc6.addCard(fiveHeart));
		}
		
		@Test
		public void BDHomeCellPileAddCardIncreasesSizeTest(){
			cards AceClubs = new cards(0, 0, "Black");
			cards twoClubs = new cards(0, 1, "Black");
			
			HomecellPile hc7 = new HomecellPile();
			assertEquals(0, hc7.getHomecellArrayList().size());
			hc7.addCard(AceClubs);
			assertEquals(1, hc7.getHomecellArrayList().size());
			hc7.addCard(twoClubs);
			assertEquals(2, hc7.getHomecellArrayList().size());
		}
		
		@Test
		public void BDHomeCellPileRemovingTopCardIsIllegalOrLegalTest(){
			cards AceClubs = new cards(0, 0, "Black");
			cards twoClubs = new cards(0, 1, "Black");
			
			HomecellPile hc8 = new HomecellPile();
			assertFalse(hc8.removeingTopCard());
			
			HomecellPile hc9 = new HomecellPile();
			hc8.addCard(AceClubs);
			hc8.addCard(twoClubs);
			assertFalse(hc9.removeingTopCard());
		}
	
	@Test
	public void testDeckSize() {
		DeckOfCards deck = new DeckOfCards();
		assertEquals(52, deck.getTotalCards());
	}

	@Test
	public void testSuit() {
		DeckOfCards deck = new DeckOfCards();
		ArrayList<String> testDiamond = new ArrayList<String>();
		ArrayList<String> testHearts = new ArrayList<String>();
		ArrayList<String> testClubs = new ArrayList<String>();
		ArrayList<String> testSpades = new ArrayList<String>();
		for (int i = 0; i < 52; i++) {
			String suit = Integer.toString(deck.getACard().getSuit());
			if (suit.equals("Diamond")) {
				testDiamond.add(suit);
				assertEquals(13, testDiamond.size());
			} else if (suit.equals("Hearts")) {
				testHearts.add(suit);
				assertEquals(13, testHearts.size());
			} else if (suit.equals("Clubs")) {
				testClubs.add(suit);
				assertEquals(13, testClubs.size());
			} else if (suit.equals("Spades")) {
				testSpades.add(suit);
				assertEquals(13, testSpades.size());
			}
		}
	}

	@Test
	public void testRank() {
		DeckOfCards deck = new DeckOfCards();
		for (int i = 0; i < 52; i++) {
			String suit = deck.toString();
			if(suit.contains("Ace")){
				assertEquals(4, suit.length());
			}
			for(int j=2; j<11;j++){
				if(suit.contains(Integer.toString(j))){
					assertEquals(39,suit.length());
				}
			}
			if(suit.contains("Jack")){
				assertEquals(4, suit.length());
			}
			if(suit.contains("Queen")){
				assertEquals(4, suit.length());
			}
			if(suit.contains("King")){
				assertEquals(4, suit.length());
			}
		
		}
	}
	
	
}
