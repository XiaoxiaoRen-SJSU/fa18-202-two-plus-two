import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwordDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public class SwordDown extends Actor implements IButtonEventObserver {
    
    boolean shouldFall;
    boolean shouldMove;
    int speed;
    int leftBound;
    int rightBound;
    
    public SwordDown(boolean _shouldMove, int _speed, 
        int _leftBound, int _rightBound) {
        shouldFall = false;
        shouldMove = _shouldMove;
        speed = _speed;
        leftBound = _leftBound;
        rightBound = _rightBound;
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
            setLocation(getX(), getY() + 4);
        } else {
            if (shouldMove) {
                if (getX() == leftBound || getX() == rightBound) {
                    speed = -speed;
                }
                setLocation(getX() + speed, getY());
            }
        }
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
}
