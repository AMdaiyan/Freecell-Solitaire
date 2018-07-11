package edu.buffalo.cse116;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class cards extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Instance variables for color, suit, and rank
	 */
	private int suit;
	private int rank;
	private String color;
	
	/**
	 * Two array instances with all the suits and all the ranks.
	 */
	 private static String[] suits = { "Clubs","Diamonds","Hearts","Spades" };
	 private static String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	 private static String[] colors = {"Black", "Red"};
	 
	 
	 /**
	  * Card Constructor
	  * @param suit
	  * @param rank
	  * @param color
	  */
	 public cards(int suit, int rank, String color){
	         this.rank=rank;
	         this.suit=suit;
	         this.color=color;
	         
	         if(this.suit == 0 && this.rank == 0){
	    		 loadAndSetImage("ac.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 1){
	    		 loadAndSetImage("2c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 2){
	    		 loadAndSetImage("3c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 3){
	    		 loadAndSetImage("4c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 4){
	    		 loadAndSetImage("5c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 5){
	    		 loadAndSetImage("6c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 6){
	    		 loadAndSetImage("7c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 7){
	    		 loadAndSetImage("8c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 8){
	    		 loadAndSetImage("9c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 9){
	    		 loadAndSetImage("10c.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 10){
	    		 loadAndSetImage("jc.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 11){
	    		 loadAndSetImage("qc.gif");
	    	 }
	    	 else if(this.suit  == 0 && this.rank == 12){
	    		 loadAndSetImage("kc.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 0){
	    		 loadAndSetImage("ad.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 1){
	    		 loadAndSetImage("2d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 2){
	    		 loadAndSetImage("3d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 3){
	    		 loadAndSetImage("4d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 4){
	    		 loadAndSetImage("5d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 5){
	    		 loadAndSetImage("6d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 6){
	    		 loadAndSetImage("7d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 7){
	    		 loadAndSetImage("8d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 8){
	    		 loadAndSetImage("9d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 9){
	    		 loadAndSetImage("10d.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 10){
	    		 loadAndSetImage("jd.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 11){
	    		 loadAndSetImage("qd.gif");
	    	 }
	    	 else if(this.suit == 1 && this.rank == 12){
	    		 loadAndSetImage("kd.gif");
	    	 } //26
	    	 else if(this.suit == 2 && this.rank == 0){
	    		 loadAndSetImage("ah.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 1){
	    		 loadAndSetImage("2h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 2){
	    		 loadAndSetImage("3h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 3){
	    		 loadAndSetImage("4h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 4){
	    		 loadAndSetImage("5h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 5){
	    		 loadAndSetImage("6h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 6){
	    		 loadAndSetImage("7h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 7){
	    		 loadAndSetImage("8h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 8){
	    		 loadAndSetImage("9h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 9){
	    		 loadAndSetImage("10h.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 10){
	    		 loadAndSetImage("jh.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 11){
	    		 loadAndSetImage("qh.gif");
	    	 }
	    	 else if(this.suit == 2 && this.rank == 12){
	    		 loadAndSetImage("kh.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 0){
	    		 loadAndSetImage("as.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 1){
	    		 loadAndSetImage("2s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 2){
	    		 loadAndSetImage("3s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 3){
	    		 loadAndSetImage("4s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 4){
	    		 loadAndSetImage("5s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 5){
	    		 loadAndSetImage("6s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 6){
	    		 loadAndSetImage("7s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 7){
	    		 loadAndSetImage("8s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 8){
	    		 loadAndSetImage("9s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 9){
	    		 loadAndSetImage("10s.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 10){
	    		 loadAndSetImage("js.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 11){
	    		 loadAndSetImage("qs.gif");
	    	 }
	    	 else if(this.suit == 3 && this.rank == 12){
	    		 loadAndSetImage("ks.gif");
	    	 }
	 }
	/**
	* @return A string giving the color, rank, and suit
	*/
	public String toString(){
		if(suits[suit].equals("Diamonds") || suits[suit].equals("Hearts")){
			color = "Red";
	        return color+ ": " + ranks[rank] + " of " + suits[suit];
		} else {
			color = "Black";
			return color+ ": " + ranks[rank] + " of " + suits[suit];
		}
	}
	
	/**
	* @return the rank for the given card
	*/
	public int getRank() {
		return rank;
	}
	
	/**
	* @return the suit for the given card
	*/
	public int getSuit() {
		return suit;
	}
	
	/**
	* @return the color for the given card
	*/
	public String getColor(){
		return color;
	}
	     
	private void loadAndSetImage(String fileNameRelativeToClassFile) {
		ImageIcon cardImage;
	 	java.net.URL imgURL = this.getClass().getResource(fileNameRelativeToClassFile);
	 	if (imgURL != null) {
	 		cardImage = new ImageIcon(imgURL);
	 	} else {
	 		System.err.println("Couldn't find file: " + fileNameRelativeToClassFile);
	 	    cardImage = null;
	 	}
	 	
	 	setIcon(cardImage);
	 	Dimension d = new Dimension(cardImage.getIconWidth() + 10, cardImage.getIconHeight() + 10);
	 	setSize(d);
	 	setPreferredSize(d);
	 	setMaximumSize(d);
	 	setMinimumSize(d);
	}
	
	
}

