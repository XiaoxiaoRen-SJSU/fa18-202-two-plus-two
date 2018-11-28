import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonsterRightState here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class MonsterRightState implements IMonsterState {
	public void toggleState(LandMonster monster) {
		monster.reverseDirection();
		monster.setImage("LandMonster.png");
		monster.setState(new MonsterLeftState());
	}
}
