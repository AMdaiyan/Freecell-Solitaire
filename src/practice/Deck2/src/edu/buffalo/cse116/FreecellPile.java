package edu.buffalo.cse116;

import java.util.ArrayList;

public class FreecellPile {
	/** An arraylist that holds cards, and functions as where all the cards in the freecell pile go */
	private ArrayList<cards> freecellPile = new ArrayList<cards>();
	
	/** at the begginning of a game a freecell pile is empty */
	public FreecellPile(){
		freecellPile.isEmpty();
	}
	
	/** here you can get the arraylist and access it to get its elements or determine its size for future code 
	 * return freecellPile, an arraylist of cards that includes every card currently in the pile*/
	public ArrayList<cards> getArrayList(){
		return freecellPile;
	}

	/** This is how you add a card to a freecell pile, you need to pass in the card you
	 * are going to add as a parameter.
	 * You can only add a card to a freecell pile if it is empty because it can only ever
	 * be empty or hold exactly one card.
	 * The card you add is stored at index 0 in the arraylist of cards. 
	 * @param addCard is the card you are adding 
	 * @return true or false*/
	public boolean addCard(cards addCard) {
		if(freecellPile.isEmpty()){
			freecellPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}

	/** This is how you remove the only card that can be in the freecell pile. If the 
	 * freecell pile is empty you cannot remove a card from it. When it is not empty, when it 
	 * only has one card in it, the method removes the one card. 
	 * return true or false*/
	public boolean removeTopCard() {
		if(freecellPile.isEmpty() == true){
			return false;
		}
		else if(freecellPile.isEmpty() != true){
			freecellPile.remove(0);
			return true;
		}
		else{
			return false;
		}
	}
}


