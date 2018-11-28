import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandMoster here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class LandMonster extends Actor {
	private int monsterSpeed;
	int leftBoundary;
	int rightBoundary;
	// created by Wenyan He to account for state pattern implementation
	private IMonsterState monsterState;

	public LandMonster(int monsterSpeed, int leftBoundary, int rightBoundary) {
		this.monsterSpeed = monsterSpeed;
		this.leftBoundary = leftBoundary;
		this.rightBoundary = rightBoundary;
		// added by Wenyan He for state pattern implementation
		if (monsterSpeed > 0) {
			monsterState = new MonsterRightState();
			this.setImage("flippedLandMonster.png");
		} else {
			monsterState = new MonsterLeftState();
			this.setImage("LandMonster.png");
		}
	}

	/**
	 * Act - do whatever the LandMoster wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		move(monsterSpeed);

		if (getX() < leftBoundary || getX() > rightBoundary) {
			// monsterSpeed = -monsterSpeed;
			monsterState.toggleState(this);
		}
	}

	// following two method were created by Wenyan He for state pattern design
	public void reverseDirection() {
		monsterSpeed = -monsterSpeed;
	}

	public void setState(IMonsterState state) {
		monsterState = state;
	}
}
