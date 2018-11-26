import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwordDown here.
 * 
 * @author Yimu Yang
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public class SwordDown extends Actor implements IButtonEventObserver {

	boolean shouldFall;
	boolean shouldMove;
	int speed;
	int leftBound;
	int rightBound;
	int downSpeed;

	public SwordDown(boolean _shouldMove, int _speed, int _leftBound, int _rightBound, int _downSpeed) {
		shouldFall = false;
		shouldMove = _shouldMove;
		speed = _speed;
		leftBound = _leftBound;
		rightBound = _rightBound;
		downSpeed = _downSpeed;
	}

	public void buttonEvent() {
		shouldFall = true;
	}

	/**
	 * Act - do whatever the SwordDown wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		if (shouldFall == true) {
			setLocation(getX(), getY() + downSpeed);
		} else {
			if (shouldMove) {
				if (getX() == leftBound || getX() == rightBound) {
					speed = -speed;
				}
				setLocation(getX() + speed, getY());
			}
		}

		if (isAtEdge()) {
			// getWorld().removeObject(this);
			setLocation(getX(), 10);
		}

	}

}
