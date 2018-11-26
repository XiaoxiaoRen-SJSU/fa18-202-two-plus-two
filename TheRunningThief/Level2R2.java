import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2R2 here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class Level2R2 extends GamePage {

	/**
	 * Constructor for objects of class Level2R2.
	 * 
	 */
	public Level2R2() {
		super();
	}

	public void prepare() {
		IStrategy s = GameModeSingleton.getInstance().getStrategy();
		int speed = s.getSpeed();

		addObject(thief, 136, 630);
		addObject(score, 819, 79);

		DiamondLabel diamondLabel = new DiamondLabel();
		addObject(diamondLabel, 817, 28);

		OneDirectionLandMonster landMonster1 = new OneDirectionLandMonster(-speed/3);
		OneDirectionLandMonster landMonster2 = new OneDirectionLandMonster(-speed/3);

		addObject(landMonster1, 1180, 670);
		addObject(landMonster2, 580, 670);

		OneDirectionBat bat1 = new OneDirectionBat(speed);
		OneDirectionBat bat2 = new OneDirectionBat(speed);
		OneDirectionBat bat3 = new OneDirectionBat(speed);

		addObject(bat1, 20, 250);
		addObject(bat2, 420, 250);
		addObject(bat3, 820, 250);

		Diamond diamond1 = new Diamond();
		Diamond diamond2 = new Diamond();
		Diamond diamond3 = new Diamond();
		Diamond diamond4 = new Diamond();
		Diamond diamond5 = new Diamond();
		Diamond diamond6 = new Diamond();
		Diamond diamond7 = new Diamond();
		Diamond diamond8 = new Diamond();

		addObject(diamond1, 250, 630);
		addObject(diamond2, 350, 630);
		addObject(diamond3, 600, 500);
		addObject(diamond4, 600, 670);
		addObject(diamond5, 1000, 600);
		addObject(diamond6, 1050, 600);
		addObject(diamond7, 1000, 650);
		addObject(diamond8, 1050, 650);

		setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, OneDirectionBat.class,
				OneDirectionLandMonster.class);
	}
}
