import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BatLeftState here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class BatLeftState implements IBatState {
	public void toggleState(Bat bat) {
		bat.reverseDirection();
		bat.setImage("Bat.png");
		bat.setState(new BatRightState());
	}
}
