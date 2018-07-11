package edu.buffalo.cse116;

/** THIS IS THE MAIN CLASS YOU NEED TO RUN TO PLAY THE GUI
 * PLEASE RUN THIS CLASS
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.*;

public class Menu {
	/** THE MAIN METHOD WHICH RUNS THE GAME PLEASE RUN THIS CLASS TO PLAY THE GUI */
	public static void main(String[] args) {
		JFrame f= new JFrame("Phase 2 New Game");
		Container c = f.getContentPane();
		c.setBackground(Color.blue);
		JButton b = new JButton("New Game");
		//JButton freecell
		b.setBounds(200, 175, 100, 50);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				JFrame s = new JFrame("Phase 2 Select Game");
				Container d = s.getContentPane();
				d.setBackground(Color.pink);
				
				JButton EE = new JButton("Ready for a fun time ?");
					EE.setBounds(100, 400, 300, 50);
					EE.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							s.dispose();
							try {
								Desktop.getDesktop().browse(new URL("https://www.youtube.com/watch?v=eh7lp9umG2I").toURI());
							} catch (MalformedURLException d){
								d.printStackTrace();
							} catch (IOException r) {
								r.printStackTrace();
							} catch (URISyntaxException g) {
								g.printStackTrace();
							}
						}
					});
				
				JButton FC = new JButton("FreeCell");
					FC.setBounds(150, 100, 100, 50);
					FC.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							s.dispose();
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
					});
					
				JButton BD = new JButton("Bakers Dozen");
					BD.setBounds(250, 100, 100, 50);
					BD.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							s.dispose();
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
					});
					
				JButton EX = new JButton("Exit");
					EX.setBounds(200, 150, 100, 50);
					EX.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e){
							s.dispose();
							
							/**
							 * By clicking this button the program will exit by disposing of its Jframe and all of its content..
							 */
						}
					});
					
					s.add(FC);
					s.add(BD);
					s.add(EX);
					s.add(EE);
					s.setSize(500, 500);
					s.setLayout(null);
					s.setVisible(true);
			}
		});
		f.add(b);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
}