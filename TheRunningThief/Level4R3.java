import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4R3 here.
 * 
 * @author Yimu Yang
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public class Level4R3 extends GamePage {
	/**
	 * Constructor for objects of class Level4R3.
	 * 
	 */
	public Level4R3() {
		super();
	}

	public void prepare() {
		IStrategy s = GameModeSingleton.getInstance().getStrategy();
        int speed = 3 * s.diffDegree();

		addObject(thief, 136, 630);
		addObject(score, 819, 79);

		DiamondLabel diamondLabel = new DiamondLabel();
		addObject(diamondLabel, 817, 28);

		RedButton redButton1 = new RedButton();

		SwordDown swordDown1 = new SwordDown(true, -2, 400, 600, speed);
		SwordDown swordDown2 = new SwordDown(true, -2, 450, 650, speed);
		SwordDown swordDown3 = new SwordDown(true, -2, 500, 700, speed);
		SwordDown swordDown4 = new SwordDown(true, 2, 600, 800, speed);
		SwordDown swordDown5 = new SwordDown(true, 2, 650, 850, speed);
		SwordDown swordDown6 = new SwordDown(true, 2, 700, 900, speed);

		redButton1.attach(swordDown1);
		redButton1.attach(swordDown2);
		redButton1.attach(swordDown3);
		redButton1.attach(swordDown4);
		redButton1.attach(swordDown5);
		redButton1.attach(swordDown6);

		addObject(redButton1, 600, 700);
		addObject(swordDown1, 500, 10);
		addObject(swordDown2, 550, 10);
		addObject(swordDown3, 600, 10);
		addObject(swordDown4, 700, 10);
		addObject(swordDown5, 750, 10);
		addObject(swordDown6, 800, 10);

		Key key = new Key(1, 600, 700);
		redButton1.attach(key);
		addObject(key, 650, 10);

		Door door = new Door(899, 576);
		addObject(door, 899, 576);
		thief.setDoor(door);

		Diamond diamond1 = new Diamond();
		Diamond diamond2 = new Diamond();
		Diamond diamond3 = new Diamond();
		Diamond diamond4 = new Diamond();
		Diamond diamond5 = new Diamond();
		Diamond diamond6 = new Diamond();
		Diamond diamond7 = new Diamond();
		Diamond diamond8 = new Diamond();
		Diamond diamond9 = new Diamond();
		Diamond diamond10 = new Diamond();
		Diamond diamond11 = new Diamond();
		Diamond diamond12 = new Diamond();

		addObject(diamond1, 600, 630);

		addObject(diamond2, 985, 690);
		addObject(diamond3, 1050, 690);
		addObject(diamond4, 1116, 690);
		addObject(diamond5, 1016, 640);
		addObject(diamond6, 1086, 640);
		addObject(diamond7, 1049, 590);

		addObject(diamond8, 899, 450);
		addObject(diamond9, 899, 550);
		addObject(diamond10, 899, 650);

		addObject(diamond11, 300, 500);
		addObject(diamond12, 400, 500);

		setPaintOrder(Thief.class, Key.class, Diamond.class, DiamondLabel.class, SwordDown.class, RedButton.class, Door.class);
	}

}
