package edu.buffalo.cse116;

import java.util.ArrayList;

public class TableauPileFC{
	
	private cards _card1; /** the first card added to a tableau pile to be used in the freecell game, goes in index 0 of the arraylist */
	private cards _card2; /** the second card added to a tableau pile to be used in the freecell game, goes in index 1 of the arraylist */
	private cards _card3; /** the third card added to a tableau pile to be used in the freecell game, goes in index 2 of the arraylist */
	private cards _card4; /** the fourth card added to a tableau pile to be used in the freecell game, goes in index 3 of the arraylist */
	private cards _card5; /** the fifth card added to a tableau pile to be used in the freecell game, goes in index 4 of the arraylist */
	private cards _card6; /** the sixth card added to a tableau pile to be used in the freecell game, goes in index 5 of the arraylist */
	private cards _card7; /** the seventh card to possibly be added to 4 of the tableau piles used in the freecell game, goes in index 6 of the arraylist */
	
	/** An arraylist that holds cards, and functions as where all the cards in the freecell tableau pile go*/
	private ArrayList<cards> tableauPile = new ArrayList<cards>();

	/** This first constructor is here because four of the tableau piles in a freecell game hold seven cards*/
	public TableauPileFC(cards card1, cards card2, cards card3, cards card4,cards card5,cards card6,cards card7){
		
		this._card1 = card1;
        tableauPile.add(_card1);
        
        this._card2 = card2;
        tableauPile.add(_card2);
        
        this._card3 = card3;
        tableauPile.add(_card3);
        
        this._card4 = card4;
        tableauPile.add(_card4);
        
        this._card5 = card5;
        tableauPile.add(_card5);
        
        this._card6 = card6;
        tableauPile.add(_card6);
        
        this._card7 = card7;
        tableauPile.add(_card7);
	}
	
	/** This second constructor is here because the other four of the tableau piles in a freecell game hold six cards*/
	public TableauPileFC(cards card1, cards card2, cards card3, cards card4,cards card5,cards card6){
		
		this._card1 = card1;
		tableauPile.add(_card1);
    
		this._card2 = card2;
		tableauPile.add(_card2);
    
		this._card3 = card3;
		tableauPile.add(_card3);
    
		this._card4 = card4;
		tableauPile.add(_card4);
        
		this._card5 = card5;
		tableauPile.add(_card5);
    
		this._card6 = card6;
		tableauPile.add(_card6);
	}

	/** here you can get the arraylist and access it to get its elements or determine its size for future code 
	 * @return tableauPile, an arraylist of all the cards in the pile*/
	public ArrayList<cards> getTableauArrayList(){
		return tableauPile;
	}

	/** You can add any card to an empty tableau pile in a free cell game. If there are already cards in the freecell
	 * tableau pile you can only add a card on top if the card you are adding is one less in rank to the card already on top and has
	 * a different color. If its the same color, or not one less in rank, or both you cannot add it.
	 * @param addCard is the card you're adding
	 * @return true or false*/
	public boolean addCard(cards addCard){
		if(tableauPile.isEmpty()){
			tableauPile.add(addCard);
			return true;
		}
		else if(tableauPile.get(tableauPile.size()-1).getRank() == addCard.getRank()+1 && tableauPile.get(tableauPile.size()-1).getColor()!=addCard.getColor()){
			tableauPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}

	/** if the tableau pile is empty you cannot remove a card. If there is a card in the tableau pile you can
	 * only remove the top card
	 * @return true or false */
	public boolean removingTopCard(){
		if(tableauPile.isEmpty()){
			return false;
		}
		else{
			tableauPile.remove(tableauPile.size()-1);
			return true;
		}
	}	
}