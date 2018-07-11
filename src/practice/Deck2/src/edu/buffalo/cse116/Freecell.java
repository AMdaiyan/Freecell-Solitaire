package edu.buffalo.cse116;

public class Freecell{
	
	private TableauPileFC Tpile1; /** The first tableau pile in the freecell game that holds seven cards */
	private TableauPileFC Tpile2; /** The second tableau pile in the freecell game that holds seven cards */
	private TableauPileFC Tpile3; /** The third tableau pile in the freecell game that holds seven cards */
	private TableauPileFC Tpile4; /** The fourth tableau pile in the freecell game that holds seven cards */
	private TableauPileFC Tpile5; /** The fifth tableau pile in the freecell game that holds six cards */
	private TableauPileFC Tpile6; /** The sixth tableau pile in the freecell game that holds six cards */
	private TableauPileFC Tpile7; /** The seventh tableau pile in the freecell game that holds six cards */
	private TableauPileFC Tpile8; /** The eighth tableau pile in the freecell game that holds six cards */
	
	private HomecellPile Hpile1; /** The first homecell pile in the freecell game that holds zero cards */
	private HomecellPile Hpile2; /** The second homecell pile in the freecell game that holds zero cards */
	private HomecellPile Hpile3; /** The third homecell pile in the freecell game that holds zero cards */
	private HomecellPile Hpile4; /** The fourth homecell pile in the freecell game that holds zero cards */
	
	private FreecellPile Fpile1; /** The first freecell pile in the freecell game that holds zero cards */
	private FreecellPile Fpile2; /** The second freecell pile in the freecell game that holds zero cards */
	private FreecellPile Fpile3; /** The third freecell pile in the freecell game that holds zero cards */
	private FreecellPile Fpile4; /** The fourth freecell pile in the freecell game that holds zero cards */

	/** Each game of free cell uses 8 tableau piles, 4 homecell piles, and four freecell piles */
	public Freecell(TableauPileFC Tpile1, TableauPileFC Tpile2, TableauPileFC Tpile3, TableauPileFC Tpile4, 
			TableauPileFC Tpile5,TableauPileFC Tpile6, TableauPileFC Tpile7, TableauPileFC Tpile8,  HomecellPile Hpile1, HomecellPile Hpile2, HomecellPile Hpile3,
			HomecellPile Hpile4,FreecellPile Fpile1,FreecellPile Fpile2,FreecellPile Fpile3,FreecellPile Fpile4){
		
		this.Tpile1 = Tpile1;
		this.Tpile2 = Tpile2;
		this.Tpile3 = Tpile3;
		this.Tpile4 = Tpile4;
		this.Tpile5 = Tpile5;
		this.Tpile6 = Tpile6;
		this.Tpile7 = Tpile7;
		this.Tpile8 = Tpile8;
		
		this.Hpile1 = Hpile1;
		this.Hpile2 = Hpile2;
		this.Hpile3 = Hpile3;
		this.Hpile4 = Hpile4;
		
		this.Fpile1 = Fpile1;
		this.Fpile2 = Fpile2;
		this.Fpile3 = Fpile3;
		this.Fpile4 = Fpile4;
		
	}

	/** get the first tableau pile */
	public TableauPileFC getTpile1() {
		return Tpile1;
	}
	
	/** set the first tableau pile */
	public void setTpile1(TableauPileFC tpile1) {
		Tpile1 = tpile1;
	}

	/** get the second tableau pile */
	public TableauPileFC getTpile2() {
		return Tpile2;
	}

	/** set the second tableau pile */
	public void setTpile2(TableauPileFC tpile2) {
		Tpile2 = tpile2;
	}

	/** get the third tableau pile */
	public TableauPileFC getTpile3() {
		return Tpile3;
	}

	/** set the third tableau pile */
	public void setTpile3(TableauPileFC tpile3) {
		Tpile3 = tpile3;
	}

	/** get the fourth tableau pile */
	public TableauPileFC getTpile4() {
		return Tpile4;
	}

	/** set the fourth tableau pile */
	public void setTpile4(TableauPileFC tpile4) {
		Tpile4 = tpile4;
	}

	/** get the fifth tableau pile */
	public TableauPileFC getTpile5() {
		return Tpile5;
	}

	/** set the fifth tableau pile */
	public void setTpile5(TableauPileFC tpile5) {
		Tpile5 = tpile5;
	}

	/** get the sixth tableau pile */
	public TableauPileFC getTpile6() {
		return Tpile6;
	}

	/** set the sixth tableau pile */
	public void setTpile6(TableauPileFC tpile6) {
		Tpile6 = tpile6;
	}

	/** get the seventh tableau pile */
	public TableauPileFC getTpile7() {
		return Tpile7;
	}

	/** set the seventh tableau pile */
	public void setTpile7(TableauPileFC tpile7) {
		Tpile7 = tpile7;
	}

	/** get the eighth tableau pile */
	public TableauPileFC getTpile8() {
		return Tpile8;
	}

	/** set the eighth tableau pile */
	public void setTpile8(TableauPileFC tpile8) {
		Tpile8 = tpile8;
	}

	/** get the first homecell pile */
	public HomecellPile getHpile1() {
		return Hpile1;
	}

	/** set the first homecell pile */
	public void setHpile1(HomecellPile hpile1) {
		Hpile1 = hpile1;
	}

	/** get the second homecell pile */
	public HomecellPile getHpile2() {
		return Hpile2;
	}

	/** set the second homecell pile */
	public void setHpile2(HomecellPile hpile2) {
		Hpile2 = hpile2;
	}

	/** get the third homecell pile */
	public HomecellPile getHpile3() {
		return Hpile3;
	}

	/** set the third homecell pile */
	public void setHpile3(HomecellPile hpile3) {
		Hpile3 = hpile3;
	}

	/** get the fourth homecell pile */
	public HomecellPile getHpile4() {
		return Hpile4;
	}

	/** set the fourth homecell pile */
	public void setHpile4(HomecellPile hpile4) {
		Hpile4 = hpile4;
	}

	/** get the first freecell pile */
	public FreecellPile getFpile1() {
		return Fpile1;
	}

	/** set the first freecell pile */
	public void setFpile1(FreecellPile fpile1) {
		Fpile1 = fpile1;
	}

	/** get the second freecell pile */
	public FreecellPile getFpile2() {
		return Fpile2;
	}

	/** set the second freecell pile */
	public void setFpile2(FreecellPile fpile2) {
		Fpile2 = fpile2;
	}

	/** get the third freecell pile */
	public FreecellPile getFpile3() {
		return Fpile3;
	}

	/** set the third freecell pile */
	public void setFpile3(FreecellPile fpile3) {
		Fpile3 = fpile3;
	}

	/** get the fourth freecell pile */
	public FreecellPile getFpile4() {
		return Fpile4;
	}

	/** set the fourth freecell pile */
	public void setFpile4(FreecellPile fpile4) {
		Fpile4 = fpile4;
	}
	
}

