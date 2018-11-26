import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefLeftState here.
 * 
 * @author (Wenyan He) 
 * @version (version 1)
 */
public class ThiefLeftState implements IThiefState {
    public void toggleState(Thief thief) {
        thief.reverseDirection();
        thief.setImage("right.png");
        thief.setState( new ThiefRightState() ) ;
    }
}
