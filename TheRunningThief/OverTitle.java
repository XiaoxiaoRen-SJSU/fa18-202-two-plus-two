import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverTitle here.
 * 
 * @author Yimu Yang
 * @version (a version number or a date)
 */
public class OverTitle extends Actor {
	private int turnSpeed = 1;

	/**
	 * Act - do whatever the OverTitle wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		turn(turnSpeed);
		if (getRotation() >= 5) {
			turnSpeed = -turnSpeed;
		}
	}
}
