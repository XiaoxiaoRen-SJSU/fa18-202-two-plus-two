import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor implements IButtonEventObserver {
    int keySpeed;
    int leftBoundary;
    int rightBoundary;
    boolean shouldFall;
    
    public Key(int speed, int leftBoundary, int rightBoundary) {
        this.keySpeed = speed;
        this.leftBoundary = leftBoundary;
        this.rightBoundary = rightBoundary;
        this.shouldFall = false;
    }
    
    public void buttonEvent() {
        shouldFall = true;
    }
    
    /**
     * Act - do whatever the Bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (shouldFall == true) {
            if (getY() < 690) {
                setLocation(getX(), getY() + 8);
            }
        } else {
            move(keySpeed);
        
            if (getX() < leftBoundary || getX() > rightBoundary) {
                keySpeed = -keySpeed;
            } 
        }
    }    
}

