import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SwordUp here.
 * 
 * @author (Min Lu) 
 * @version (11/12/2018)
 */
public class SwordUp extends Actor implements IButtonEventObserver {
    
    boolean shouldFall;
    boolean shouldMove;
    int speed;
    int leftBound;
    int rightBound;
    
    public SwordUp(boolean _shouldMove, int _speed, 
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
     * Act - do whatever the SwordUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (shouldFall == true) {
            setLocation(getX(), getY() - 4);
        } else {
            if (shouldMove) {
                if (getX() == leftBound || getX() == rightBound) {
                    speed = -speed;
                }
                setLocation(getX() + speed, getY());
            }
        }
        
        if (isAtEdge()) {
            //getWorld().removeObject(this);
            setLocation(getX(), 770);
        }

    }
    
}
