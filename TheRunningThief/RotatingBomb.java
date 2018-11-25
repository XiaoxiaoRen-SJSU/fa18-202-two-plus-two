import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RotatingBomb here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class RotatingBomb extends Actor {

	private int turnSpeed;

	public RotatingBomb(int speed) {
		turnSpeed = speed;
	}

	/**
	 * Act - do whatever the RotatingBomb wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		turn(turnSpeed);
	}

}
