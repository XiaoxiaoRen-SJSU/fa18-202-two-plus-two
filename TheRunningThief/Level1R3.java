import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1R3 here.
 * 
 * @author (Min Lu)
 * @version (11/12/2018)
 */
public class Level1R3 extends GamePage {

	/**
	 * Constructor for objects of class Level1R3.
	 * 
	 */
	public Level1R3() {
		super();
	}

	public void prepare() {
		addObject(thief, 136, 630);
		addObject(score, 819, 79);

		DiamondLabel diamondLabel = new DiamondLabel();
		addObject(diamondLabel, 817, 28);

		BombUp bombUp1 = new BombUp(true, 1, 575, 685);

		addObject(bombUp1, 500, 680);

		IStrategy s = GameModeSingleton.getInstance().getStrategy();
		int downSpeed = s.getSpeed();

		SwordDown swordDown1 = new SwordDown(false, 1, 0, 1200, downSpeed);
		SwordDown swordDown2 = new SwordDown(false, 1, 0, 1200, downSpeed);

		addObject(swordDown1, 300, 770);
		addObject(swordDown2, 900, 770);

		swordDown1.buttonEvent();
		swordDown2.buttonEvent();

		Diamond diamond1 = new Diamond();
		Diamond diamond2 = new Diamond();
		Diamond diamond3 = new Diamond();
		Diamond diamond4 = new Diamond();
		Diamond diamond5 = new Diamond();
		Diamond diamond6 = new Diamond();
		Diamond diamond7 = new Diamond();
		Diamond diamond8 = new Diamond();

		addObject(diamond1, 250, 500);
		addObject(diamond2, 300, 500);
		addObject(diamond3, 650, 630);
		addObject(diamond4, 700, 630);
		addObject(diamond5, 675, 600);
		addObject(diamond6, 1050, 400);
		addObject(diamond7, 1050, 500);
		addObject(diamond8, 1050, 600);

		setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, SwordUp.class, BombUp.class);
	}

}
