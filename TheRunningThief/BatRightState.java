import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BatRightState here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class BatRightState implements IBatState {
	public void toggleState(Bat bat) {
		bat.reverseDirection();
		bat.setImage("flippedBat.png");
		bat.setState(new BatLeftState());
	}
}
