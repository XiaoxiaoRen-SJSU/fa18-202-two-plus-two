import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bat extends Actor {
    int batSpeed;
    int leftBoundary;
    int rightBoundary;
    // created by Wenyan He to account for Bat's left/right state
    private IBatState batState;

    public Bat(int speed, int leftBoundary, int rightBoundary) {
        this.batSpeed = speed;
        this.leftBoundary = leftBoundary;
        this.rightBoundary = rightBoundary;
        // added by Wenyan He to account for state pattern implementation
        if (batSpeed > 0) {
            batState = new BatRightState();
            this.setImage("Bat.png");
        }
        else {
            batState = new BatLeftState();
            this.setImage("flippedBat.png");
        } 
    }

    /**
     * Act - do whatever the Bat wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(batSpeed);

        if (getX() < leftBoundary || getX() > rightBoundary) {
            // batSpeed = -batSpeed;  // original version before state pattern
            batState.toggleState(this);
        }
    }

    // following two methods were created by Wenyan He to account for state
    // pattern implementation
    public void reverseDirection() {
        batSpeed = -batSpeed;
    }

    public void setState(IBatState state) {
        batState = state;
    }
}
