import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OneDirectionLandMonster here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class OneDirectionLandMonster extends Actor {
	private int monsterSpeed;

	public OneDirectionLandMonster(int monsterSpeed) {
		this.monsterSpeed = monsterSpeed;
	}

	/**
	 * Act - do whatever the OneDirectionLandMonster wants to do. This method is
	 * called whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		move(monsterSpeed);

		if (isAtEdge()) {
			setLocation(1180, getY());
			// this.monsterSpeed -= 1;
			/*
			 * World world = getWorld(); world.removeObject(this); return;
			 */
		}

		// a moving landmonster can swallow a diamond in its path
		/*
		 * Actor diamond = getOneObjectAtOffset(0, 0, Diamond.class); if (diamond !=
		 * null) { World world = getWorld(); world.removeObject(diamond); }
		 */
	}
}
