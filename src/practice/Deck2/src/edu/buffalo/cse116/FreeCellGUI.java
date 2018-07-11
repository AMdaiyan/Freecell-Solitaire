package edu.buffalo.cse116;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.OverlayLayout;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class FreeCellGUI extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; /** serial version id as given by extending jLabl */
	private static Freecell FCgame; /** an instance of the freecell class which has access to the tableau and homecell piles */
	private static JFrame Freecellframe; /** the jframe where you play the game */
	private static final Border select = BorderFactory.createMatteBorder(5, 5, 5, 5, Color.GREEN); /** the green border that appear around the card when you click on it to select it*/
	private static ArrayList<ArrayList<cards>> multiList; /** A multiList which can help access tableau piles for the free cell game */

	private static JPanel homecellClubs = new JPanel(); /**The homecell pile that holds all the clubs */
    private static JPanel homecellDiamonds = new JPanel();  /**The homecell pile that holds all the diamonds */
    private static JPanel homecellHearts = new JPanel();  /**The homecell pile that holds all the hearts */
    private static JPanel homecellSpades = new JPanel();  /**The homecell pile that holds all the spades */
    private static JPanel freecell1 = new JPanel(); /** the first freecell pile where you can store one card */
    private static JPanel freecell2 = new JPanel(); /** the second freecell pile where you can store one card */
    private static JPanel freecell3 = new JPanel(); /** the third freecell pile where you can store one card */
    private static JPanel freecell4 = new JPanel(); /** the fourth freecell pile where you can store one card */
    private static JPanel tableau1 = new JPanel();  /** the jpanel which holds 7 cards in tableau pile 1 */
    private static JPanel tableau2 = new JPanel();  /** the jpanel which holds 7 cards in tableau pile 2 */
    private static JPanel tableau3 = new JPanel();  /** the jpanel which holds 7 cards in tableau pile 3 */
    private static JPanel tableau4 = new JPanel();  /** the jpanel which holds 7 cards in tableau pile 4 */
    private static JPanel tableau5 = new JPanel();  /** the jpanel which holds 6 cards in tableau pile 5 */
    private static JPanel tableau6 = new JPanel();  /** the jpanel which holds 6 cards in tableau pile 6 */
    private static JPanel tableau7 = new JPanel();  /** the jpanel which holds 6 cards in tableau pile 7 */
    private static JPanel tableau8 = new JPanel();  /** the jpanel which holds 6 cards in tableau pile 8 */
    
    private static cards card1; /** the card at the very back of the tableau pile 1 when the game starts */
    private static cards card2; /** the card at the very back of the tableau pile 2 when the game starts */
    
    private static cards card4; /** the card at the very back of the tableau pile 4 when the game starts */
    private static cards card5; /** the card at the very back of the tableau pile 5 when the game starts */
    private static cards card6; /** the card at the very back of the tableau pile 6 when the game starts */
    private static cards card7; /** the card at the very back of the tableau pile 7 when the game starts */
    private static cards card8; /** the card at the very back of the tableau pile 8 when the game starts */
    private static cards card3;
    
    private static cards aceClubs; /** the ace of clubs, which is the first card in homecellClubs */
    private static cards aceDiamonds; /** the ace of diamonds, which is the first card in homecellDiamonds */
    private static cards aceHearts; /** the ace of hearts, which is the first card in homecellHearts */
    private static cards aceSpades; /** the ace of spades, which is the first card in homecellSpades */
    
    private static cards[] cardsArray =  new cards[8];  /** an array of cards that holds card1 to card 13 */
    
    private static cards removedCard; /** the card that will be removed from a pile to be added to another */
	
    /** constructor of the freecell game gui, which takes in a new jframe and an instance of the freecell game*/
	public FreeCellGUI(Freecell game, JFrame frame) {
		FCgame = game;
		Freecellframe = frame;
	}
	
	/** the method that runs the GUI */
	public static void runGUI() {
		Freecellframe = new JFrame("Free Cell Game");
		Freecellframe.setSize(1180, 1000);
		Freecellframe.setLayout(new GridLayout(2, 8));

		freecell1.add(new JLabel("Freecell 1"));
		freecell2.add(new JLabel("Freecell 2"));
		freecell3.add(new JLabel("Freecell 3"));
		freecell4.add(new JLabel("Freecell 4"));

		homecellClubs.add(new JLabel("Homecell Clubs"));
	    homecellDiamonds.add(new JLabel("Homecell Diamonds"));
	    homecellHearts.add(new JLabel("Homecell Hearts"));
	    homecellSpades.add(new JLabel("Homecell Spades"));
	    
	    tableau1.add(new JLabel("Tableau 1"));
	    card1 = FCgame.getTpile1().getTableauArrayList().get(0);
	    cardsArray[0] = card1;
	    card1.add(FCgame.getTpile1().getTableauArrayList().get(1));
	    card1.add(FCgame.getTpile1().getTableauArrayList().get(2));
	    card1.add(FCgame.getTpile1().getTableauArrayList().get(3));
	    card1.add(FCgame.getTpile1().getTableauArrayList().get(4));
	    card1.add(FCgame.getTpile1().getTableauArrayList().get(5));
	    card1.add(FCgame.getTpile1().getTableauArrayList().get(6));
	    tableau1.add(card1);
	    
	    tableau2.add(new JLabel("Tableau 2"));
	    card2 = FCgame.getTpile2().getTableauArrayList().get(0);
	    cardsArray[1] = card2;
	    card2.add(FCgame.getTpile2().getTableauArrayList().get(1));
	    card2.add(FCgame.getTpile2().getTableauArrayList().get(2));
	    card2.add(FCgame.getTpile2().getTableauArrayList().get(3));
	    card2.add(FCgame.getTpile2().getTableauArrayList().get(4));
	    card2.add(FCgame.getTpile2().getTableauArrayList().get(5));
	    card2.add(FCgame.getTpile2().getTableauArrayList().get(6));
	    tableau2.add(card2);
	    
	    
	    tableau3.add(new JLabel("Tableau 3"));
	    card3 = FCgame.getTpile3().getTableauArrayList().get(0);
	    cardsArray[2] = card3;
	    card3.add(FCgame.getTpile3().getTableauArrayList().get(1));
	    card3.add(FCgame.getTpile3().getTableauArrayList().get(2));
	    card3.add(FCgame.getTpile3().getTableauArrayList().get(3));
	    card3.add(FCgame.getTpile3().getTableauArrayList().get(4));
	    card3.add(FCgame.getTpile3().getTableauArrayList().get(5));
	    card3.add(FCgame.getTpile3().getTableauArrayList().get(6));
	    tableau3.add(card3);
	    
	    tableau4.add(new JLabel("Tableau 4"));
	    card4 = FCgame.getTpile4().getTableauArrayList().get(0);
	    cardsArray[3] = card4;
	    card4.add(FCgame.getTpile4().getTableauArrayList().get(1));
	    card4.add(FCgame.getTpile4().getTableauArrayList().get(2));
	    card4.add(FCgame.getTpile4().getTableauArrayList().get(3));
	    card4.add(FCgame.getTpile4().getTableauArrayList().get(4));
	    card4.add(FCgame.getTpile4().getTableauArrayList().get(5));
	    card4.add(FCgame.getTpile4().getTableauArrayList().get(6));
	    tableau4.add(card4);
	    
	    tableau5.add(new JLabel("Tableau 5"));
	    card5 = FCgame.getTpile5().getTableauArrayList().get(0);
	    cardsArray[4] = card5;
	    card5.add(FCgame.getTpile5().getTableauArrayList().get(1));
	    card5.add(FCgame.getTpile5().getTableauArrayList().get(2));
	    card5.add(FCgame.getTpile5().getTableauArrayList().get(3));
	    card5.add(FCgame.getTpile5().getTableauArrayList().get(4));
	    card5.add(FCgame.getTpile5().getTableauArrayList().get(5));
	    tableau5.add(card5);
	    
	    tableau6.add(new JLabel("Tableau 6"));
	    card6 = FCgame.getTpile6().getTableauArrayList().get(0);
	    cardsArray[5] = card6;
	    card6.add(FCgame.getTpile6().getTableauArrayList().get(1));
	    card6.add(FCgame.getTpile6().getTableauArrayList().get(2));
	    card6.add(FCgame.getTpile6().getTableauArrayList().get(3));
	    card6.add(FCgame.getTpile6().getTableauArrayList().get(4));
	    card6.add(FCgame.getTpile6().getTableauArrayList().get(5));
	    tableau6.add(card6);
	    
	    tableau7.add(new JLabel("Tableau 7"));
	    card7 = FCgame.getTpile7().getTableauArrayList().get(0);
	    cardsArray[6] = card7;
	    card7.add(FCgame.getTpile7().getTableauArrayList().get(1));
	    card7.add(FCgame.getTpile7().getTableauArrayList().get(2));
	    card7.add(FCgame.getTpile7().getTableauArrayList().get(3));
	    card7.add(FCgame.getTpile7().getTableauArrayList().get(4));
	    card7.add(FCgame.getTpile7().getTableauArrayList().get(5));
	    tableau7.add(card7);
	    
	    tableau8.add(new JLabel("Tableau 8"));
	    card8 = FCgame.getTpile8().getTableauArrayList().get(0);
	    cardsArray[7] = card8;
	    card8.add(FCgame.getTpile8().getTableauArrayList().get(1));
	    card8.add(FCgame.getTpile8().getTableauArrayList().get(2));
	    card8.add(FCgame.getTpile8().getTableauArrayList().get(3));
	    card8.add(FCgame.getTpile8().getTableauArrayList().get(4));
	    card8.add(FCgame.getTpile8().getTableauArrayList().get(5));
	    tableau8.add(card8);
	    
	    homecellClubs.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=0){
	    			JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    		}
	    		else{
	    			if(homecellClubs.getComponentCount() == 1 && removedCard.getSuit() == 0 && removedCard.getRank() == 0 ){
	    				aceClubs = removedCard;
	    				homecellClubs.add(aceClubs);
	    				homecellClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 2 && removedCard.getSuit() == 0 && removedCard.getRank() == 1){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 3 && removedCard.getSuit() == 0 && removedCard.getRank() == 2){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 4 && removedCard.getSuit() == 0 && removedCard.getRank() == 3){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 5 && removedCard.getSuit() == 0 && removedCard.getRank() == 4){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 6 && removedCard.getSuit() == 0 && removedCard.getRank() == 5){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 7 && removedCard.getSuit() == 0 && removedCard.getRank() == 6){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 8 && removedCard.getSuit() == 0 && removedCard.getRank() == 7){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 9 && removedCard.getSuit() == 0 && removedCard.getRank() == 8){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 10 && removedCard.getSuit() == 0 && removedCard.getRank() == 9){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 11 && removedCard.getSuit() == 0 && removedCard.getRank() == 10){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 12 && removedCard.getSuit() == 0 && removedCard.getRank() == 11){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else if(homecellClubs.getComponentCount() == 13 && removedCard.getSuit() == 0 && removedCard.getRank() == 12){
	    				aceClubs.add(removedCard);
	    				aceClubs.repaint();
	    			}
	    			else{
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    homecellDiamonds.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=1){
	    			JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    		}
	    		else{
	    			if(homecellDiamonds.getComponentCount() == 1 && removedCard.getSuit() == 1 && removedCard.getRank() == 0 ){
	    				aceDiamonds = removedCard;
	    				homecellDiamonds.add(aceDiamonds);
	    				homecellDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 2 && removedCard.getSuit() == 1 && removedCard.getRank() == 1){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 3 && removedCard.getSuit() == 1 && removedCard.getRank() == 2){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 4 && removedCard.getSuit() == 1 && removedCard.getRank() == 3){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 5 && removedCard.getSuit() == 1 && removedCard.getRank() == 4){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 6 && removedCard.getSuit() == 1 && removedCard.getRank() == 5){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 7 && removedCard.getSuit() == 1 && removedCard.getRank() == 6){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 8 && removedCard.getSuit() == 1 && removedCard.getRank() == 7){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 9 && removedCard.getSuit() == 1 && removedCard.getRank() == 8){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 10 && removedCard.getSuit() == 1 && removedCard.getRank() == 9){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 11 && removedCard.getSuit() == 1 && removedCard.getRank() == 10){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 12 && removedCard.getSuit() == 1 && removedCard.getRank() == 11){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else if(homecellDiamonds.getComponentCount() == 13 && removedCard.getSuit() == 1 && removedCard.getRank() == 12){
	    				aceDiamonds.add(removedCard);
	    				aceDiamonds.repaint();
	    			}
	    			else{
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    homecellHearts.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=2){
	    			JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    		}
	    		else{
	    			if(homecellHearts.getComponentCount() == 1 && removedCard.getSuit() == 2 && removedCard.getRank() == 0 ){
	    				aceHearts = removedCard;
	    				homecellHearts.add(aceHearts);
	    				homecellHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 2 && removedCard.getSuit() == 2 && removedCard.getRank() == 1){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 3 && removedCard.getSuit() == 2 && removedCard.getRank() == 2){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 4 && removedCard.getSuit() == 2 && removedCard.getRank() == 3){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 5 && removedCard.getSuit() == 2 && removedCard.getRank() == 4){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 6 && removedCard.getSuit() == 2 && removedCard.getRank() == 5){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 7 && removedCard.getSuit() == 2 && removedCard.getRank() == 6){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 8 && removedCard.getSuit() == 2 && removedCard.getRank() == 7){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 9 && removedCard.getSuit() == 2 && removedCard.getRank() == 8){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 10 && removedCard.getSuit() == 2 && removedCard.getRank() == 9){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 11 && removedCard.getSuit() == 2 && removedCard.getRank() == 10){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 12 && removedCard.getSuit() == 2 && removedCard.getRank() == 11){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else if(homecellHearts.getComponentCount() == 13 && removedCard.getSuit() == 2 && removedCard.getRank() == 12){
	    				aceHearts.add(removedCard);
	    				aceHearts.repaint();
	    			}
	    			else{
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    homecellSpades.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=3){
	    			JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    		}
	    		else{
	    			if(homecellSpades.getComponentCount() == 1 && removedCard.getSuit() == 3 && removedCard.getRank() == 0 ){
	    				aceSpades = removedCard;
	    				homecellSpades.add(aceSpades);
	    				homecellSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 2 && removedCard.getSuit() == 3 && removedCard.getRank() == 1){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 3 && removedCard.getSuit() == 3 && removedCard.getRank() == 2){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 4 && removedCard.getSuit() == 3 && removedCard.getRank() == 3){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 5 && removedCard.getSuit() == 3 && removedCard.getRank() == 4){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 6 && removedCard.getSuit() == 3 && removedCard.getRank() == 5){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 7 && removedCard.getSuit() == 3 && removedCard.getRank() == 6){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 8 && removedCard.getSuit() == 3 && removedCard.getRank() == 7){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 9 && removedCard.getSuit() == 3 && removedCard.getRank() == 8){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 10 && removedCard.getSuit() == 3 && removedCard.getRank() == 9){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 11 && removedCard.getSuit() == 3 && removedCard.getRank() == 10){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 12 && removedCard.getSuit() == 3 && removedCard.getRank() == 11){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else if(homecellSpades.getComponentCount() == 13 && removedCard.getSuit() == 3 && removedCard.getRank() == 12){
	    				aceSpades.add(removedCard);
	    				aceSpades.repaint();
	    			}
	    			else{
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    tableau1.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card1.getBorder() == null){
	    			if(card1.getComponentCount() == 0){
		    			removedCard = card1;
		    			tableau1.remove(card1);
		    		} else {
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card1.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card1.add(removedCard, 0);
	    					card1.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card1.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card1.add(removedCard, 0);
	    					card1.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card1.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card1.add(removedCard, 0);
	    					card1.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card1.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card1.add(removedCard, 0);
	    					card1.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null){
	    				card1.setBorder(select); card1.repaint();
	    				removedCard = (cards) card1.getComponent(0);
	    			}}
	    		} else{
	    			card1.setBorder(null); card1.repaint();
	    		}
	    	}	
	   });
	    
	    tableau2.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card2.getBorder() == null){
	    			if(card2.getComponentCount() == 0){
		    			removedCard = card2;
		    			tableau2.remove(card2);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card2.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card2.add(removedCard, 0);
	    					card2.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card2.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card2.add(removedCard, 0);
	    					card2.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card2.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card2.add(removedCard, 0);
	    					card2.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card2.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card2.add(removedCard, 0);
	    					card2.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null){
	    				card2.setBorder(select); card2.repaint();
	    				removedCard = (cards) card2.getComponent(0);
	    			}}
	    		} else{
	    			card2.setBorder(null); card2.repaint();
	    		}
	    	}	
	   });
	    
	    tableau3.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card3.getBorder() == null){
	    			if(card3.getComponentCount() == 0){
		    			removedCard = card3;
		    			tableau3.remove(card3);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == select){
	    				removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card3.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card3.add(removedCard, 0);
	    					card3.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card3.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card3.add(removedCard, 0);
	    					card3.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card3.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card3.add(removedCard, 0);
	    					card3.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card3.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card3.add(removedCard, 0);
	    					card3.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card2.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null){
	    				card3.setBorder(select); card3.repaint();
	    				removedCard = (cards) card3.getComponent(0);
	    			}}
	    		} else{
	    			card3.setBorder(null); card3.repaint();
	    		}
	    	}	
	   });
	    tableau4.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card4.getBorder() == null){
	    			if(card4.getComponentCount() == 0){
		    			removedCard = card4;
		    			tableau4.remove(card4);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == select){
	    				removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card4.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card4.add(removedCard, 0);
	    					card4.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card4.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card4.add(removedCard, 0);
	    					card4.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card4.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card4.add(removedCard, 0);
	    					card4.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card4.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card4.add(removedCard, 0);
	    					card4.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card2.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null){
	    				card4.setBorder(select); card4.repaint();
	    				removedCard = (cards) card4.getComponent(0);
	    			}}
	    		} else{
	    			card4.setBorder(null); card4.repaint();
	    		}
	    	}	
	   });
	    
	    tableau5.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card5.getBorder() == null){
	    			if(card5.getComponentCount() == 0){
		    			removedCard = card5;
		    			tableau5.remove(card5);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == select){
	    				removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card5.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card5.add(removedCard, 0);
	    					card5.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card5.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card5.add(removedCard, 0);
	    					card5.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card5.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card5.add(removedCard, 0);
	    					card5.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card5.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card5.add(removedCard, 0);
	    					card5.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card2.getBorder() == null && card4.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null){
	    				card5.setBorder(select); card5.repaint();
	    				removedCard = (cards) card5.getComponent(0);
	    			}}
	    		} else{
	    			card5.setBorder(null); card5.repaint();
	    		}
	    	}	
	   });
	    
	    tableau6.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card6.getBorder() == null){
	    			if(card6.getComponentCount() == 0){
		    			removedCard = card6;
		    			tableau6.remove(card6);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == select){
	    				removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card6.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card6.add(removedCard, 0);
	    					card6.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card6.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card6.add(removedCard, 0);
	    					card6.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card6.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card6.add(removedCard, 0);
	    					card6.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card6.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card6.add(removedCard, 0);
	    					card6.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card2.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null){
	    				card6.setBorder(select); card6.repaint();
	    				removedCard = (cards) card6.getComponent(0);
	    			}}
	    		} else{
	    			card6.setBorder(null); card6.repaint();
	    		}
	    	}	
	   });
	    
	    tableau7.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card7.getBorder() == null){
	    			if(card7.getComponentCount() == 0){
		    			removedCard = card7;
		    			tableau7.remove(card7);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == select){
	    				removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card7.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card7.add(removedCard, 0);
	    					card7.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card7.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card7.add(removedCard, 0);
	    					card7.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card7.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card7.add(removedCard, 0);
	    					card7.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card7.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card7.add(removedCard, 0);
	    					card7.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card2.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card8.getBorder() == null){
	    				card7.setBorder(select); card7.repaint();
	    				removedCard = (cards) card7.getComponent(0);
	    			}}
	    		} else{
	    			card7.setBorder(null); card7.repaint();
	    		}
	    	}	
	   });
	    
	    tableau8.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card8.getBorder() == null){
	    			if(card8.getComponentCount() == 0){
		    			removedCard = card8;
		    			tableau8.remove(card8);
		    		} else {
	    			if(card1.getBorder() == select){
		    			removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank() && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card2.getBorder() == select){
	    				removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.getColor()!=topCard.getColor() || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell1.getBorder()== select){
	    				removedCard = (cards) freecell1.getComponent(1);
	    				cards topCard = (cards) card8.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell1.setBorder(null); freecell1.repaint();
	    					freecell1.remove(removedCard); freecell1.repaint();
	    					card8.add(removedCard, 0);
	    					card8.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell2.getBorder()== select){
	    				removedCard = (cards) freecell2.getComponent(1);
	    				cards topCard = (cards) card8.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell2.setBorder(null); freecell2.repaint();
	    					freecell2.remove(removedCard); freecell2.repaint();
	    					card8.add(removedCard, 0);
	    					card8.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell3.getBorder()== select){
	    				removedCard = (cards) freecell3.getComponent(1);
	    				cards topCard = (cards) card8.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell3.setBorder(null); freecell3.repaint();
	    					freecell3.remove(removedCard); freecell3.repaint();
	    					card8.add(removedCard, 0);
	    					card8.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(freecell4.getBorder()== select){
	    				removedCard = (cards) freecell4.getComponent(1);
	    				cards topCard = (cards) card8.getComponent(0);
	    				if(removedCard.getRank()+1 == topCard.getRank()  && removedCard.toString().contains("Red") == topCard.toString().contains("Black") || removedCard.getRank()+1 == topCard.getRank() && removedCard.toString().contains("Black") == topCard.toString().contains("Red")){
	    					freecell4.setBorder(null); freecell4.repaint();
	    					freecell4.remove(removedCard); freecell4.repaint();
	    					card8.add(removedCard, 0);
	    					card8.repaint();
	    				} else{
		    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card2.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null){
	    				card8.setBorder(select); card8.repaint();
	    				removedCard = (cards) card8.getComponent(0);
	    			}}
	    		} else{
	    			card8.setBorder(null); card8.repaint();
	    		}
	    	}	
	   });
	    
	    freecell1.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(freecell1.getBorder() == select){
	    			freecell1.setBorder(null);
	    		} 
	    		else{
	    			if(freecell1.getComponentCount() == 1 ){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					freecell1.add(removedCard);
	    					freecell1.repaint();
	    					card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    			}
	    			else if(freecell1.getComponentCount() == 2){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    				freecell1.repaint();
		    				card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    				else{
	    				freecell1.setBorder(select); freecell1.repaint();
	    				removedCard = (cards) freecell1.getComponent(1);
	    				}
	    			}
	    			else if(freecell1.getComponentCount() > 2){
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    				freecell1.repaint();
	    			}
	    		}
	    	}
	    });
	    
	    freecell2.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(freecell2.getBorder() == select){
	    			freecell2.setBorder(null);
	    		} 
	    		else{
	    			if(freecell2.getComponentCount() == 1 ){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					freecell2.add(removedCard);
	    					freecell2.repaint();
	    					card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    			}
	    			else if(freecell2.getComponentCount() == 2){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    				freecell2.repaint();
		    				card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				} else{
	    				freecell2.setBorder(select); freecell2.repaint();
	    				removedCard = (cards) freecell2.getComponent(1);
	    				}
	    			}
	    			else if(freecell2.getComponentCount() > 2){
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    				freecell2.repaint();
	    			}
	    		}
	    	}
	    });
	    
	    freecell3.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(freecell3.getBorder() == select){
	    			freecell3.setBorder(null);
	    		} 
	    		else{
	    			if(freecell3.getComponentCount() == 1 ){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					freecell3.add(removedCard);
	    					freecell3.repaint();
	    					card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    			}
	    			else if(freecell3.getComponentCount() == 2){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    				freecell3.repaint();
		    				card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    				else{
	    				freecell3.setBorder(select); freecell3.repaint();
	    				removedCard = (cards) freecell3.getComponent(1);
	    				}
	    			}
	    			else if(freecell3.getComponentCount() > 2){
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    				freecell3.repaint();
	    			}
	    		}
	    	}
	    });
	    
	    freecell4.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(freecell4.getBorder() == select){
	    			freecell4.setBorder(null);
	    		} 
	    		else{
	    			if(freecell4.getComponentCount() == 1 ){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					freecell4.add(removedCard);
	    					freecell4.repaint();
	    					card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    			}
	    			else if(freecell4.getComponentCount() == 2){
	    				if(card1.getBorder() == select || card2.getBorder() == select || card3.getBorder() == select || card4.getBorder() == select || card5.getBorder() == select || card6.getBorder() == select || card7.getBorder() == select || card8.getBorder() == select){
	    					JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
		    				freecell1.repaint();
		    				card1.setBorder(null); card1.repaint(); 
	    					card2.setBorder(null); card2.repaint(); 
	    					card3.setBorder(null); card3.repaint(); 
	    					card4.setBorder(null); card4.repaint(); 
	    					card5.setBorder(null); card5.repaint(); 
	    					card6.setBorder(null); card6.repaint(); 
	    					card7.setBorder(null); card7.repaint(); 
	    					card8.setBorder(null); card8.repaint();
	    				}
	    				else{
	    				freecell4.setBorder(select); freecell4.repaint();
	    				removedCard = (cards) freecell4.getComponent(1);
	    				}
	    			}
	    			else if(freecell4.getComponentCount() > 2){
	    				JOptionPane.showMessageDialog(Freecellframe, "Error: this is not a legal move!");
	    				freecell4.repaint();
	    			}
	    		}
	    	}
	    });

		Freecellframe.add(freecell1);
		Freecellframe.add(freecell2);
		Freecellframe.add(freecell3);
		Freecellframe.add(freecell4);
		Freecellframe.add(homecellClubs);
		Freecellframe.add(homecellDiamonds);
		Freecellframe.add(homecellHearts);
		Freecellframe.add(homecellSpades);
		Freecellframe.add(tableau1);
		Freecellframe.add(tableau2);
		Freecellframe.add(tableau3);
		Freecellframe.add(tableau4);
		Freecellframe.add(tableau5);
		Freecellframe.add(tableau6);
		Freecellframe.add(tableau7);
		Freecellframe.add(tableau8);

		Freecellframe.setVisible(true); // must be the last thing
		Freecellframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/** the main method which can run and show the free cell game GUI */
	public static void main(String[] args) {
		DeckOfCards deckFC = new DeckOfCards(); // make deck for bakers dozen game
		TableauPileFC TpileFC1 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC2 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC3 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC4 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC5 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC6 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC7 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());
		TableauPileFC TpileFC8 = new TableauPileFC(deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard(), deckFC.getACard());

		HomecellPile HpileFC1 = new HomecellPile();
		HomecellPile HpileFC2 = new HomecellPile();
		HomecellPile HpileFC3 = new HomecellPile();
		HomecellPile HpileFC4 = new HomecellPile();
		
		FreecellPile FCpile1 = new FreecellPile();
		FreecellPile FCpile2 = new FreecellPile();
		FreecellPile FCpile3 = new FreecellPile();
		FreecellPile FCpile4 = new FreecellPile();
		
		Freecell FreecellGame = new Freecell(TpileFC1, TpileFC2, TpileFC3, TpileFC4, TpileFC5, TpileFC6, TpileFC7, TpileFC8, HpileFC1, HpileFC2, HpileFC3, HpileFC4, FCpile1, FCpile2, FCpile3, FCpile4);
		JFrame frame = new JFrame();
		
		FreeCellGUI game = new FreeCellGUI(FreecellGame, frame);
		game.runGUI();

	}

	/** A method to get the multilist with the added tableau piles inside it*/
	public ArrayList<ArrayList<cards>> getAllPiles() {
		multiList = new ArrayList<ArrayList<cards>>();

		multiList.add(FCgame.getTpile1().getTableauArrayList());
		multiList.add(FCgame.getTpile2().getTableauArrayList());
		multiList.add(FCgame.getTpile3().getTableauArrayList());
		multiList.add(FCgame.getTpile4().getTableauArrayList());
		multiList.add(FCgame.getTpile5().getTableauArrayList());
		multiList.add(FCgame.getTpile6().getTableauArrayList());
		multiList.add(FCgame.getTpile7().getTableauArrayList());
		multiList.add(FCgame.getTpile8().getTableauArrayList());
		return multiList;

	}
}
