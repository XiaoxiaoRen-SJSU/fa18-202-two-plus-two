import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonsterLeftState here.
 * 
 * @author (Wenyan He) 
 * @version (version 1)
 */
public class MonsterLeftState implements IMonsterState {
    public void toggleState(LandMonster monster) {
        monster.reverseDirection();
        monster.setImage("flippedLandMonster.png");
        monster.setState( new MonsterRightState() ) ;
    }
}
