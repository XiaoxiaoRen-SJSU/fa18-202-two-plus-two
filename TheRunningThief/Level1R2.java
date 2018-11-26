import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1R2 here.
 * 
 * @author (Min Lu)
 * @version (11/12/2018)
 */
public class Level1R2 extends GamePage {

	/**
	 * Constructor for objects of class Level1R2.
	 * 
	 */
	public Level1R2() {
		super();
	}

	public void prepare() {
		IStrategy s = GameModeSingleton.getInstance().getStrategy();
		int speed = 3 * s.diffDegree();

		addObject(thief, 136, 630);
		addObject(score, 819, 79);

		DiamondLabel diamondLabel = new DiamondLabel();
		addObject(diamondLabel, 817, 28);

		
		SwordUp swordUp1 = new SwordUp(false, 1, 0, 1200, speed);
		SwordUp swordUp2 = new SwordUp(false, 1, 0, 1200, speed);

		addObject(swordUp1, 400, 770);
		addObject(swordUp2, 800, 770);

		swordUp1.buttonEvent();
		swordUp2.buttonEvent();

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
		addObject(diamond3, 550, 630);
		addObject(diamond4, 600, 630);
		addObject(diamond5, 575, 600);
		addObject(diamond6, 1050, 400);
		addObject(diamond7, 1050, 500);
		addObject(diamond8, 1050, 600);

		setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, SwordUp.class);
	}

}
