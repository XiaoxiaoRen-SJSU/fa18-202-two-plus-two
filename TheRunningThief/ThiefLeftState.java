import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefLeftState here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class ThiefLeftState implements IThiefState {
    public void nextState(Thief thief) {
        if (Greenfoot.isKeyDown("right")) {
            thief.reverseDirection();
            thief.setImage("right.png");
            thief.setState(new ThiefRightState());
        }
    }
}
