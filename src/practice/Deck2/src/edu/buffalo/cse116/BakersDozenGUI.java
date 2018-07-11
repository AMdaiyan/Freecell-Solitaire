package edu.buffalo.cse116;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class BakersDozenGUI extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; /** serial version id as given by extending jLable */
	private static BakersDozen BDgame; /** an instance of the bakersdozen class which has access to the tableau and homecell piles */
	private static JFrame BakersDozenFrame;  /** the jframe where you play the game*/
    private static final Border select = BorderFactory.createMatteBorder(5, 5, 5, 5,
                                                                                Color.GREEN); /** the green border that appear around the card when you click on it to select it*/
    private static JPanel homecellClubs = new JPanel(); /**The homecell pile that holds all the clubs */
    private static JPanel homecellDiamonds = new JPanel();  /**The homecell pile that holds all the diamonds */
    private static JPanel homecellHearts = new JPanel();  /**The homecell pile that holds all the hearts */
    private static JPanel homecellSpades = new JPanel();  /**The homecell pile that holds all the spades */
    private static JPanel tableau1 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 1 */
    private static JPanel tableau2 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 2 */
    private static JPanel tableau3 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 3 */
    private static JPanel tableau4 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 4 */
    private static JPanel tableau5 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 5 */
    private static JPanel tableau6 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 6 */
    private static JPanel tableau7 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 7 */
    private static JPanel tableau8 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 8 */
    private static JPanel tableau9 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 9 */
    private static JPanel tableau10 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 10 */
    private static JPanel tableau11 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 11 */
    private static JPanel tableau12 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 12 */
    private static JPanel tableau13 = new JPanel();  /** the jpanel which holds all the cards in tableau pile 13 */
    
    private static cards card1; /** the card at the very back of the tableau pile 1 when the game starts */
    private static cards card2; /** the card at the very back of the tableau pile 2 when the game starts */
    private static cards card3; /** the card at the very back of the tableau pile 3 when the game starts */
    private static cards card4; /** the card at the very back of the tableau pile 4 when the game starts */
    private static cards card5; /** the card at the very back of the tableau pile 5 when the game starts */
    private static cards card6; /** the card at the very back of the tableau pile 6 when the game starts */
    private static cards card7; /** the card at the very back of the tableau pile 7 when the game starts */
    private static cards card8; /** the card at the very back of the tableau pile 8 when the game starts */
    private static cards card9; /** the card at the very back of the tableau pile 9 when the game starts */
    private static cards card10; /** the card at the very back of the tableau pile 10 when the game starts */
    private static cards card11; /** the card at the very back of the tableau pile 11 when the game starts */
    private static cards card12; /** the card at the very back of the tableau pile 12 when the game starts */
    private static cards card13; /** the card at the very back of the tableau pile 13 when the game starts */
    
    private static cards aceClubs; /** the ace of clubs, which is the first card in homecellClubs */
    private static cards aceDiamonds; /** the ace of diamonds, which is the first card in homecellDiamonds */
    private static cards aceHearts; /** the ace of hearts, which is the first card in homecellHearts */
    private static cards aceSpades; /** the ace of spades, which is the first card in homecellSpades */
    
    private static cards[] cardsArray =  new cards[13];  /** an array of cards that holds card1 to card 13 */
    
    private static cards removedCard; /** the card that will be removed from a pile to be added to another */

    /** constructor of the bakers dozen game gui, which takes in a new jframe and an instance of the bakersdozen game*/
	public BakersDozenGUI(BakersDozen game, JFrame frame){
		BDgame = game;
		BakersDozenFrame = frame;
	}
		
	/** the method that runs the GUI */
	public static void runGUI(){
		BakersDozenFrame = new JFrame("Bakers Dozen Game");
		BakersDozenFrame.setSize(1300,1000);
		BakersDozenFrame.setLayout(new GridLayout(2,9));
		
	    homecellClubs.add(new JLabel("Homecell Clubs"));
	    
	    homecellDiamonds.add(new JLabel("Homecell Diamonds"));
	    
	    homecellHearts.add(new JLabel("Homecell Hearts"));
	    
	    homecellSpades.add(new JLabel("Homecell Spades")); 
	    
	    tableau1.add(new JLabel("Tableau 1"));
	    card1 = BDgame.getTpile1().getTableauArrayList().get(0);
	    cardsArray[0] = card1;
	    card1.add(BDgame.getTpile1().getTableauArrayList().get(1));
	    card1.add(BDgame.getTpile1().getTableauArrayList().get(2));
	    card1.add(BDgame.getTpile1().getTableauArrayList().get(3));
	    tableau1.add(card1);
	    
	    tableau2.add(new JLabel("Tableau 2"));
	    card2 = BDgame.getTpile2().getTableauArrayList().get(0);
	    cardsArray[1] = card2;
	    card2.add(BDgame.getTpile2().getTableauArrayList().get(1));
	    card2.add(BDgame.getTpile2().getTableauArrayList().get(2));
	    card2.add(BDgame.getTpile2().getTableauArrayList().get(3));
	    tableau2.add(card2);
	    
	    tableau3.add(new JLabel("Tableau 3"));
	    card3 = BDgame.getTpile3().getTableauArrayList().get(0);
	    cardsArray[2] = card3;
	    card3.add(BDgame.getTpile3().getTableauArrayList().get(1));
	    card3.add(BDgame.getTpile3().getTableauArrayList().get(2));
	    card3.add(BDgame.getTpile3().getTableauArrayList().get(3));
	    tableau3.add(card3);
	    
	    tableau4.add(new JLabel("Tableau 4"));
	    card4 = BDgame.getTpile4().getTableauArrayList().get(0);
	    cardsArray[3] = card4;
	    card4.add(BDgame.getTpile4().getTableauArrayList().get(1));
	    card4.add(BDgame.getTpile4().getTableauArrayList().get(2));
	    card4.add(BDgame.getTpile4().getTableauArrayList().get(3));
	    tableau4.add(card4);
	    
	    tableau5.add(new JLabel("Tableau 5"));
	    card5 = BDgame.getTpile5().getTableauArrayList().get(0);
	    cardsArray[4] = card5;
	    card5.add(BDgame.getTpile5().getTableauArrayList().get(1));
	    card5.add(BDgame.getTpile5().getTableauArrayList().get(2));
	    card5.add(BDgame.getTpile5().getTableauArrayList().get(3));
	    tableau5.add(card5);
	    
	    tableau6.add(new JLabel("Tableau 6"));
	    card6 = BDgame.getTpile6().getTableauArrayList().get(0);
	    cardsArray[5] = card6;
	    card6.add(BDgame.getTpile6().getTableauArrayList().get(1));
	    card6.add(BDgame.getTpile6().getTableauArrayList().get(2));
	    card6.add(BDgame.getTpile6().getTableauArrayList().get(3));
	    tableau6.add(card6);
	    
	    tableau7.add(new JLabel("Tableau 7"));
	    card7 = BDgame.getTpile7().getTableauArrayList().get(0);
	    cardsArray[6] = card7;
	    card7.add(BDgame.getTpile7().getTableauArrayList().get(1));
	    card7.add(BDgame.getTpile7().getTableauArrayList().get(2));
	    card7.add(BDgame.getTpile7().getTableauArrayList().get(3));
	    tableau7.add(card7);
	    
	    tableau8.add(new JLabel("Tableau 8"));
	    card8 = BDgame.getTpile8().getTableauArrayList().get(0);
	    cardsArray[7] = card8;
	    card8.add(BDgame.getTpile8().getTableauArrayList().get(1));
	    card8.add(BDgame.getTpile8().getTableauArrayList().get(2));
	    card8.add(BDgame.getTpile8().getTableauArrayList().get(3));
	    tableau8.add(card8);
	    
	    tableau9.add(new JLabel("Tableau 9"));
	    card9 = BDgame.getTpile9().getTableauArrayList().get(0);
	    cardsArray[8] = card9;
	    card9.add(BDgame.getTpile9().getTableauArrayList().get(1));
	    card9.add(BDgame.getTpile9().getTableauArrayList().get(2));
	    card9.add(BDgame.getTpile9().getTableauArrayList().get(3));
	    tableau9.add(card9);
	    
	    tableau10.add(new JLabel("Tableau 10"));
	    card10 = BDgame.getTpile10().getTableauArrayList().get(0);
	    cardsArray[9] = card10;
	    card10.add(BDgame.getTpile10().getTableauArrayList().get(1));
	    card10.add(BDgame.getTpile10().getTableauArrayList().get(2));
	    card10.add(BDgame.getTpile10().getTableauArrayList().get(3));
	    tableau10.add(card10);
	    
	    tableau11.add(new JLabel("Tableau 11"));
	    card11 = BDgame.getTpile11().getTableauArrayList().get(0);
	    cardsArray[10] = card11;
	    card11.add(BDgame.getTpile11().getTableauArrayList().get(1));
	    card11.add(BDgame.getTpile11().getTableauArrayList().get(2));
	    card11.add(BDgame.getTpile11().getTableauArrayList().get(3));
	    tableau11.add(card11);
	    
	    tableau12.add(new JLabel("Tableau 12"));
	    card12 = BDgame.getTpile12().getTableauArrayList().get(0);
	    cardsArray[11] = card12;
	    card12.add(BDgame.getTpile12().getTableauArrayList().get(1));
	    card12.add(BDgame.getTpile12().getTableauArrayList().get(2));
	    card12.add(BDgame.getTpile12().getTableauArrayList().get(3));
	    tableau12.add(card12);
	    
	    tableau13.add(new JLabel("Tableau 13"));
	    card13 = BDgame.getTpile13().getTableauArrayList().get(0);
	    cardsArray[12] = card13;
	    card13.add(BDgame.getTpile13().getTableauArrayList().get(1));
	    card13.add(BDgame.getTpile13().getTableauArrayList().get(2));
	    card13.add(BDgame.getTpile13().getTableauArrayList().get(3));
	    tableau13.add(card13);
	    
	    homecellClubs.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=0){
	    			JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
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
	    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    homecellDiamonds.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=1){
	    			JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
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
	    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    homecellHearts.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=2){
	    			JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
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
	    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
	    			}
	    		}
	    	}
	    });
	    
	    homecellSpades.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(removedCard.getSuit()!=3){
	    			JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
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
	    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
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
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card2.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card2.add(removedCard, 0);
		    				card2.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card1.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card1.add(removedCard, 0);
		    				card1.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card3.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card3.add(removedCard, 0);
		    				card3.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card4.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card4.add(removedCard, 0);
		    				card4.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card5.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card5.add(removedCard, 0);
		    				card5.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card6.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card6.add(removedCard, 0);
		    				card6.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card7.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card7.add(removedCard, 0);
		    				card7.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
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
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card8.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card8.add(removedCard, 0);
		    				card8.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
	    				card8.setBorder(select); card8.repaint();
	    				removedCard = (cards) card8.getComponent(0);
	    			}}
	    		} else{
	    			card8.setBorder(null); card8.repaint();
	    		}
	    	}	
	   });
	    
	    tableau9.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card9.getBorder() == null){
	    			if(card9.getComponentCount() == 0){
		    			removedCard = card9;
		    			tableau9.remove(card9);
		    		} else {
	    			if(card2.getBorder() == select){
	    				
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card9.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card9.add(removedCard, 0);
		    				card9.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
	    				card9.setBorder(select); card9.repaint();
	    				removedCard = (cards) card9.getComponent(0);
	    			}}
	    		} else{
	    			card9.setBorder(null); card9.repaint();
	    		}
	    	}	
	   });
	    
	    tableau10.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card10.getBorder() == null){
	    			if(card10.getComponentCount() == 0){
		    			removedCard = card10;
		    			tableau10.remove(card10);
		    		} else {
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card10.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card10.add(removedCard, 0);
		    				card10.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
	    				card10.setBorder(select); card10.repaint();
	    				removedCard = (cards) card10.getComponent(0);
	    			}}
	    		} else{
	    			card10.setBorder(null); card10.repaint();
	    		}
	    	}	
	   });
	    
	    tableau11.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card11.getBorder() == null){
	    			if(card11.getComponentCount() == 0){
		    			removedCard = card11;
		    			tableau11.remove(card11);
		    		} else {
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card11.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card11.add(removedCard, 0);
		    				card11.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card12.getBorder() == null && card13.getBorder() == null){
	    				card11.setBorder(select); card11.repaint();
	    				removedCard = (cards) card11.getComponent(0);
	    			}}
	    		} else{
	    			card11.setBorder(null); card11.repaint();
	    		}
	    	}	
	   });
	    
	    tableau12.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card12.getBorder() == null){
	    			if(card12.getComponentCount() == 0){
		    			removedCard = card12;
		    			tableau12.remove(card12);
		    		} else {
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card13.getBorder() == select){
	    				removedCard = (cards) card13.getComponent(0); 
		    			cards topCard = (cards) card12.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card13.setBorder(null); card13.repaint();
		    				card13.remove(0); card13.repaint();
		    				card12.add(removedCard, 0);
		    				card12.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card13.getBorder() == null){
	    				card12.setBorder(select); card12.repaint();
	    				removedCard = (cards) card12.getComponent(0);
	    			}}
	    		} else{
	    			card12.setBorder(null); card12.repaint();
	    		}
	    	}	
	   });
	    
	    tableau13.addMouseListener(new MouseAdapter(){
	    	@Override
	    	public void mouseClicked(MouseEvent e){
	    		if(card13.getBorder() == null){
	    			if(card13.getComponentCount() == 0){
		    			removedCard = card13;
		    			tableau13.remove(card13);
		    		} else {
	    			if(card2.getBorder() == select){
		    			removedCard = (cards) card2.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card2.setBorder(null); card2.repaint();
		    				card2.remove(0); card2.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card1.getBorder() == select){
	    				removedCard = (cards) card1.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card1.setBorder(null); card1.repaint();
		    				card1.remove(0); card1.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card3.getBorder() == select){
	    				removedCard = (cards) card3.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card3.setBorder(null); card3.repaint();
		    				card3.remove(0); card3.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card4.getBorder() == select){
	    				removedCard = (cards) card4.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card4.setBorder(null); card4.repaint();
		    				card4.remove(0); card4.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card5.getBorder() == select){
	    				removedCard = (cards) card5.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card5.setBorder(null); card5.repaint();
		    				card5.remove(0); card5.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card6.getBorder() == select){
	    				removedCard = (cards) card6.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card6.setBorder(null); card6.repaint();
		    				card6.remove(0); card6.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card7.getBorder() == select){
	    				removedCard = (cards) card7.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card7.setBorder(null); card7.repaint();
		    				card7.remove(0); card7.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card8.getBorder() == select){
	    				removedCard = (cards) card8.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card8.setBorder(null); card8.repaint();
		    				card8.remove(0); card8.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card9.getBorder() == select){
	    				removedCard = (cards) card9.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card9.setBorder(null); card9.repaint();
		    				card9.remove(0); card9.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card10.getBorder() == select){
	    				removedCard = (cards) card10.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card10.setBorder(null); card10.repaint();
		    				card10.remove(0); card10.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card11.getBorder() == select){
	    				removedCard = (cards) card11.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card11.setBorder(null); card11.repaint();
		    				card11.remove(0); card11.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			}
	    			}
	    			else if(card12.getBorder() == select){
	    				removedCard = (cards) card12.getComponent(0); 
		    			cards topCard = (cards) card13.getComponent(0);
		    			if(removedCard.getRank()+1 == topCard.getRank()){
		    				card12.setBorder(null); card12.repaint();
		    				card12.remove(0); card12.repaint();
		    				card13.add(removedCard, 0);
		    				card13.repaint();
		    			} else{
		    				JOptionPane.showMessageDialog(BakersDozenFrame, "Error: this is not a legal move!");
		    			};
	    			}
	    			else if(card2.getBorder() == null && card1.getBorder() == null && card3.getBorder() == null && card4.getBorder() == null && card5.getBorder() == null && card6.getBorder() == null && card7.getBorder() == null && card8.getBorder() == null && card9.getBorder() == null && card10.getBorder() == null && card11.getBorder() == null && card12.getBorder() == null){
	    				card13.setBorder(select); card13.repaint();
	    				removedCard = (cards) card13.getComponent(0);
	    			}}
	    		} else{
	    			card13.setBorder(null); card13.repaint();
	    		}
	    	}	
	   });
	    

		BakersDozenFrame.add(homecellClubs);
		BakersDozenFrame.add(homecellDiamonds);
		BakersDozenFrame.add(homecellHearts);
		BakersDozenFrame.add(homecellSpades);
		BakersDozenFrame.add(tableau1);
		BakersDozenFrame.add(tableau2);
		BakersDozenFrame.add(tableau3);
		BakersDozenFrame.add(tableau4);
		BakersDozenFrame.add(tableau5);
		BakersDozenFrame.add(tableau6);
		BakersDozenFrame.add(tableau7);
		BakersDozenFrame.add(tableau8);
		BakersDozenFrame.add(tableau9);
		BakersDozenFrame.add(tableau10);
		BakersDozenFrame.add(tableau11);
		BakersDozenFrame.add(tableau12);
		BakersDozenFrame.add(tableau13);

		BakersDozenFrame.setVisible(true); //must be the last thing
		BakersDozenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/** the main method where the gui is run */ 
	public static void main(String[] args){
		DeckOfCards deckBD = new DeckOfCards(); //make deck for bakers dozen game
		TableauPileBD TpileBD1 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD2 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD3 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD4 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD5 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD6 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD7 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD8 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD9 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD10 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD11 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD12 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard());
		TableauPileBD TpileBD13 = new TableauPileBD(deckBD.getACard(), deckBD.getACard(), deckBD.getACard(), deckBD.getACard()); //make 13 tableau piles for bakers dozen game
		HomecellPile HpileBD1 = new HomecellPile();
		HomecellPile HpileBD2 = new HomecellPile();
		HomecellPile HpileBD3 = new HomecellPile();
		HomecellPile HpileBD4 = new HomecellPile(); //make 4 home cell piles for bakers dozen game
		BakersDozen BakersDozenGame =  new BakersDozen(TpileBD1, TpileBD2, TpileBD3, TpileBD4, TpileBD5, TpileBD6, TpileBD7, TpileBD8, TpileBD9, TpileBD10, TpileBD11, TpileBD12, TpileBD13, HpileBD1, HpileBD2, HpileBD3, HpileBD4);
		JFrame frame = new JFrame();
		
		BakersDozenGUI game = new BakersDozenGUI(BakersDozenGame, frame);
		game.runGUI();
		
	}



}
