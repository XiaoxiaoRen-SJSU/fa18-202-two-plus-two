import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1R1 here.
 * 
 * @author (Min Lu)
 * @version (11/12/2018)
 */
public class Level1R1 extends GamePage {

	/**
	 * Constructor for objects of class Level1R1.
	 * 
	 */
	private IStrategy strategy;
	public Level1R1() {
		super();
	}

	public void prepare() {
		addObject(thief, 136, 630);
		addObject(score, 819, 79);

		DiamondLabel diamondLabel = new DiamondLabel();
		addObject(diamondLabel, 817, 28);

		IStrategy s = GameModeSingleton.getInstance().getStrategy();
		int downSpeed = s.getSpeed();

		BombDown bombDown1 = new BombDown(false, 1, 0, 1200, downSpeed);
		BombDown bombDown2 = new BombDown(false, 1, 0, 1200, downSpeed);

		addObject(bombDown1, 400, 10);
		addObject(bombDown2, 800, 10);

		bombDown1.buttonEvent();
		bombDown2.buttonEvent();

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

		setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, BombDown.class);
	}

}
