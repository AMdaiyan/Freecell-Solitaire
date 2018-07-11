package edu.buffalo.cse116;

public class BakersDozen{
	
	
	private TableauPileBD Tpile1; /** The first tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile2; /** The second tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile3; /** The third tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile4; /** The fourth  tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile5; /** The fifth tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile6; /** The sixth tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile7; /** The seventh tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile8; /** The eighth tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile9; /** The ninth tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile10; /** The tenth tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile11; /** The eleventh tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile12; /** The twelfth tableau pile in the bakers dozen game that holds four cards */
	private TableauPileBD Tpile13; /** The thirteenth tableau pile in the bakers dozen game that holds four cards */
	
	private HomecellPile Hpile1; /** The first homecell pile in the bakers dozen game that holds zero cards */
	private HomecellPile Hpile2; /** The second homecell pile in the bakers dozen game that holds zero cards */
	private HomecellPile Hpile3; /** The third homecell pile in the bakers dozen game that holds zero cards */
	private HomecellPile Hpile4; /** The fourth homecell pile in the bakers dozen game that holds zero cards */
	
	/** Each game of bakers dozen uses 13 tableau piles and 4 homecell piles */
	public BakersDozen(TableauPileBD Tpile1, TableauPileBD Tpile2, TableauPileBD Tpile3, TableauPileBD Tpile4, 
			TableauPileBD Tpile5,TableauPileBD Tpile6, TableauPileBD Tpile7, TableauPileBD Tpile8, 
			TableauPileBD Tpile9, TableauPileBD Tpile10, TableauPileBD Tpile11, TableauPileBD Tpile12,
			TableauPileBD Tpile13, HomecellPile Hpile1, HomecellPile Hpile2, HomecellPile Hpile3,
			HomecellPile Hpile4){
		
		this.setTpile1(Tpile1); this.setTpile2(Tpile2); this.setTpile3(Tpile3); this.setTpile4(Tpile4);
		this.setTpile5(Tpile5); this.setTpile6(Tpile6); this.setTpile7(Tpile7); this.setTpile8(Tpile8);
		this.setTpile9(Tpile9); this.setTpile10(Tpile10); this.setTpile11(Tpile11); this.setTpile12(Tpile12);
		this.setTpile13(Tpile13);
		
		this.setHpile1(Hpile1); this.setHpile2(Hpile2); this.setHpile3(Hpile3); this.setHpile4(Hpile4);  
	}
	
	/** get the first tableau pile */
	public TableauPileBD getTpile1() {
		return Tpile1;
	}

	/** set the first tableau pile */
	public void setTpile1(TableauPileBD tpile1) {
		Tpile1 = tpile1;
	}

	/** get the second tableau pile */
	public TableauPileBD getTpile2() {
		return Tpile2;
	}

	/** set the second tableau pile */
	public void setTpile2(TableauPileBD tpile2) {
		Tpile2 = tpile2;
	}

	/** get the third tableau pile */
	public TableauPileBD getTpile3() {
		return Tpile3;
	}

	/** set the third tableau pile */
	public void setTpile3(TableauPileBD tpile3) {
		Tpile3 = tpile3;
	}

	/** get the fourth tableau pile */
	public TableauPileBD getTpile4() {
		return Tpile4;
	}

	/** set the fourth tableau pile */
	public void setTpile4(TableauPileBD tpile4) {
		Tpile4 = tpile4;
	}

	/** get the fifth tableau pile */
	public TableauPileBD getTpile5() {
		return Tpile5;
	}

	/** set the fifth tableau pile */
	public void setTpile5(TableauPileBD tpile5) {
		Tpile5 = tpile5;
	}

	/** get the sixth tableau pile */
	public TableauPileBD getTpile6() {
		return Tpile6;
	}

	/** set the sixth tableau pile */
	public void setTpile6(TableauPileBD tpile6) {
		Tpile6 = tpile6;
	}

	/** get the seventh tableau pile */
	public TableauPileBD getTpile7() {
		return Tpile7;
	}

	/** set the seventh tableau pile */
	public void setTpile7(TableauPileBD tpile7) {
		Tpile7 = tpile7;
	}

	/** get the eighth tableau pile */
	public TableauPileBD getTpile8() {
		return Tpile8;
	}

	/** set the eighth tableau pile */
	public void setTpile8(TableauPileBD tpile8) {
		Tpile8 = tpile8;
	}

	/** get the ninth tableau pile */
	public TableauPileBD getTpile9() {
		return Tpile9;
	}

	/** set the ninth tableau pile */
	public void setTpile9(TableauPileBD tpile9) {
		Tpile9 = tpile9;
	}

	/** get the tenth tableau pile */
	public TableauPileBD getTpile10() {
		return Tpile10;
	}

	/** set the tenth tableau pile */
	public void setTpile10(TableauPileBD tpile10) {
		Tpile10 = tpile10;
	}

	/** get the eleventh tableau pile */
	public TableauPileBD getTpile11() {
		return Tpile11;
	}

	/** set the eleventh tableau pile */
	public void setTpile11(TableauPileBD tpile11) {
		Tpile11 = tpile11;
	}

	/** get the twelfth tableau pile */
	public TableauPileBD getTpile12() {
		return Tpile12;
	}

	/** set the twelfth tableau pile */
	public void setTpile12(TableauPileBD tpile12) {
		Tpile12 = tpile12;
	}

	/** get the thirteenth tableau pile */
	public TableauPileBD getTpile13() {
		return Tpile13;
	}

	/** set the thirteenth tableau pile */
	public void setTpile13(TableauPileBD tpile13) {
		Tpile13 = tpile13;
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
	
}