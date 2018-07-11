package edu.buffalo.cse116;

import java.util.ArrayList;

import javax.swing.JPanel;

/** There is only one homecell pile class because the homecell piles in the bakersdozen game and the freecell
 * game function the same.*/
public class HomecellPile extends JPanel {
	
	/** An arraylist that holds cards, and functions as where all the cards in the homecell pile go*/
	private ArrayList<cards> homecellPile = new ArrayList<cards>();
	
	/** at the beginning of a either game the homecell pile is empty */
	public HomecellPile(){
		homecellPile.isEmpty();
	}
	
	/** here you can get the arraylist and access it to get its elements or determine its size for future code 
	 * @return homecellPile, an arraylist that includes all the cards in the pile*/
	public ArrayList<cards> getHomecellArrayList(){
		return homecellPile;
	}
	
	/** This is how you add a card to a homecell pile, you need to pass in the card you
	 * are going to add as a parameter. Only an ace can be added to an empty homecell pile, and the homecell
	 * piles are ordered by suit, and an increasing rank of one. This means that once you start with the ace in 
	 * a homecell pile the next card you can add is a 2 of the same suit, and then a 3 of the same suit and 
	 * so on.
	 * @param addCard is the card you are adding
	 * @return true or false*/
	public boolean addCard(cards addCard){
		if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 0){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 1){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 2){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() && addCard.getRank() == 0 && addCard.getSuit() == 3){
			homecellPile.add(addCard);
			return true;
		}
		else if(homecellPile.isEmpty() != true && addCard.getRank() != 0 && addCard.getSuit() == homecellPile.get(homecellPile.size()-1).getSuit() && addCard.getRank() == homecellPile.get(homecellPile.size()-1).getRank()+1){
			homecellPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}
	
	/** you can never remove a card from a homecell pile once it has been added to it 
	 * return false, always*/
	public boolean removeingTopCard(){
		return false;
	}
}
