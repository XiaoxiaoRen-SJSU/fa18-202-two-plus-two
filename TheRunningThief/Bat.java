import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bat extends Actor {
	int batSpeed;
	int leftBoundary;
	int rightBoundary;

	public Bat(int speed, int leftBoundary, int rightBoundary) {
		this.batSpeed = speed;
		this.leftBoundary = leftBoundary;
		this.rightBoundary = rightBoundary;
	}

	/**
	 * Act - do whatever the Bat wants to do. This method is called whenever the
	 * 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		move(batSpeed);

		if (getX() < leftBoundary || getX() > rightBoundary) {
			batSpeed = -batSpeed;
		}
	}
}
