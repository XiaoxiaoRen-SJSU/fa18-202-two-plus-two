import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2R3 here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class Level2R3 extends GamePage {

	/**
	 * Constructor for objects of class Level2R3.
	 * 
	 */
	public Level2R3() {
		super();
	}

	public void prepare() {
		IStrategy s = GameModeSingleton.getInstance().getStrategy();
		int speed = s.getSpeed()/3;

		addObject(thief, 136, 630);
		addObject(score, 819, 79);

		DiamondLabel diamondLabel = new DiamondLabel();
		addObject(diamondLabel, 817, 28);

		Bat bat1 = new Bat(speed, 30, 1170);
		Bat bat2 = new Bat(-speed, 30, 1170);

		addObject(bat1, 30, 100);
		addObject(bat2, 1170, 250);

		// LandMonster landMonster1 = new LandMonster(0, 0, 1200);
		LandMonster landMonster2 = new LandMonster(speed/3, 300, 450);
		LandMonster landMonster3 = new LandMonster(-speed/3, 700, 850);
		LandMonster landMonster4 = new LandMonster(speed/3, 950, 1100);

		// addObject(landMonster1, 250, 670);
		addObject(landMonster2, 400, 670);
		addObject(landMonster3, 850, 670);
		addObject(landMonster4, 950, 670);

		Diamond diamond1 = new Diamond();
		Diamond diamond2 = new Diamond();
		Diamond diamond3 = new Diamond();
		Diamond diamond4 = new Diamond();
		Diamond diamond5 = new Diamond();
		Diamond diamond6 = new Diamond();
		Diamond diamond7 = new Diamond();
		Diamond diamond8 = new Diamond();
		Diamond diamond9 = new Diamond();

		addObject(diamond1, 250, 500);
		addObject(diamond2, 350, 500);
		addObject(diamond3, 600, 630);
		addObject(diamond4, 600, 700);
		addObject(diamond5, 1050, 400);
		addObject(diamond6, 300, 550);
		addObject(diamond7, 1000, 450);
		addObject(diamond8, 1100, 450);
		addObject(diamond9, 1050, 500);

		setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, Bat.class, LandMonster.class);
	}
}
