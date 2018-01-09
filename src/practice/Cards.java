package practice;

public class Cards {
	
	private int suit;
	private int rank;
	
	public static void main(String[] args){
		
	}
	int deck[] = new int[52];
	String suits[] = {"Heart", "Diamond", "Spade", "Clover"};
	String ranks[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
	public Cards(int suit, int rank){
		
		this.suit = suit;
		this.rank = rank;
		
		for(int i = 0; i < deck.length; i ++){
			deck[i] = i; // fills the array with numbers 0-51
			}
		
	}
	
	public Object AssigningCard(){
	    return ranks[rank] + " of " + suits[suit];
    }
	
	public int getRank(){
		return rank;
	}
	
    public int getSuit(){
    	return suit;
    }
}
