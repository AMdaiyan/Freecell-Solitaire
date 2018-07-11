package edu.buffalo.cse116;

import java.util.ArrayList;

import javax.swing.JComponent;

public class TableauPileBD extends JComponent {

	private cards _card1; /** the first card added to a tableau pile to be used in the bakers dozen game, goes in index 0 of the arraylist */
	private cards _card2; /** the second card added to a tableau pile to be used in the bakers dozen game, goes in index 1 of the arraylist  */
	private cards _card3; /** the third card added to a tableau pile to be used in the bakers dozen game, goes in index 2 of the arraylist */
	private cards _card4; /** the fourth card added to a tableau pile to be used in the bakers dozen game, goes in index 3 of the arraylist */
	//one in front is card4, one in the back is card1
	
	/** An arraylist that holds cards, and functions as where all the cards in the bakers dozen tableau pile go*/
	private ArrayList<cards> tableauPile = new ArrayList<cards>();
	
	/** variable that holds the removed card from the pile */
	private cards removedCard;
	
	/** each tableau pile thats used in bakers dozen initially holds four cards in indexes 0-3 of the
	 * arraylist */
	public TableauPileBD(cards card1, cards card2, cards card3, cards card4){
        this._card1 = card1;
        tableauPile.add(_card1);
        
        this._card2 = card2;
        tableauPile.add(_card2);
        
        this._card3 = card3;
        tableauPile.add(_card3);
        
        this._card4 = card4;
        tableauPile.add(_card4);
        
        
        for(int j = 0; j < 10; j++){
        for(int i = 0; i < 4; i++){
        	if(tableauPile.get(i).getRank() == 12){
        		tableauPile.add(0, tableauPile.remove(i));
        	}
        }
        }
	}
	
	public cards getRemovedCard(){
		return removedCard;
	}

	/** here you can get the arraylist and access it to get its elements or determine its size for future code 
	 * @return tableauPile, an arraylist of all the cards in the pile*/
	public ArrayList<cards> getTableauArrayList(){
		return tableauPile;
	}
	
	/** In the bakers dozen game you can only add a card to a tableau pile if the rank of the card you're adding
	 *  is one less than the top card of the tableau pile. In bakers dozen you can never add a card to an empty
	 *  tableau pile or when the rank of the card your adding is not one less than the top card. Suit doesn't matter
	 *  for adding. 
	 * @param addCard the card you're adding
	 * @return true or false 
	 */
	public boolean addCard(cards addCard){
		if(tableauPile.isEmpty()){
			return false;
		}
		else if(tableauPile.get(tableauPile.size()-1).getRank() == addCard.getRank()+1){
			tableauPile.add(addCard);
			return true;
		}
		else{
			return false;
		}
	}
	
	/** You can never remove a card from an empty tableau pile. The only card you can remove is the top card of the 
	 * tableau pile. 
	 * @return true or false
	 */
	public boolean removingTopCard(){
		if(tableauPile.isEmpty()){
			return false;
		}
		else{
			removedCard = tableauPile.remove(tableauPile.size()-1);
			return true;
		}
	}	
}