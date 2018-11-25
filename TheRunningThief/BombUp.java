import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombUp here.
 * 
 * @author (Min Lu)
 * @version (11/12/2018)
 */
public class BombUp extends Actor implements IButtonEventObserver {

	// boolean shouldJump;
	boolean shouldMove;
	int speed;
	int upBound;
	int bottomBound;
	int turnSpeed = 1;

	public BombUp(boolean _shouldMove, int _speed, int _upBound, int _bottomBound) {
		// shouldJump = false;
		shouldMove = _shouldMove;
		speed = _speed;
		upBound = _upBound;
		bottomBound = _bottomBound;
	}

	public void buttonEvent() {
		// shouldJump = true;
	}

	/**
	 * Act - do whatever the BombUp wants to do. This method is called whenever the
	 * 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		// if (shouldJump == true) {
		// setLocation(getX(), getY() - 4);
		// }
		// else {
		if (shouldMove) {
			turn(turnSpeed);
			if (getRotation() >= 10) {
				turnSpeed = -turnSpeed;
			}
			// setLocation(getX(), getY() - 4);
			// if (getY() == upBound || getY() == bottomBound) {
			// speed = -speed;
			// }
			// setLocation(getX() , getY()+ speed);
		}
		// }

		if (isAtEdge()) {
			// getWorld().removeObject(this);
			setLocation(getX(), 770);
		}

	}

}
