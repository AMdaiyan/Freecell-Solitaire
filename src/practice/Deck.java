package practice;

import java.util.ArrayList;

public class Deck { 
	
	private static int decksize = 52;
	
	public static void main(String[] args){
		ArrayList<Integer> deck = new ArrayList<Integer>();
		for(int i = 0; i < decksize; i++){
			deck.add(i);
		}
		
		 ArrayList<Integer> shuffledDeck = new ArrayList<Integer>();
	       
	       int idx = (int)(Math.random() * decksize);
	       shuffledDeck.add(deck.remove(idx));
	}
	
    public Deck(){ 
     }
    
}
