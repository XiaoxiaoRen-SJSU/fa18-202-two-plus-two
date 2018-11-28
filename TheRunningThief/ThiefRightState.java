import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefRightState here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class ThiefRightState implements IThiefState {
    public void nextState(Thief thief) {
        if (Greenfoot.isKeyDown("left")) {
            thief.reverseDirection();
            thief.setImage("left.png");
            thief.setState(new ThiefLeftState());
        }
    }
}
