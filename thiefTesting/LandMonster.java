import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandMoster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandMonster extends Actor
{
    private int monsterSpeed;
    int leftBoundary;
    int rightBoundary;
    
    public LandMonster(int monsterSpeed, int leftBoundary, int rightBoundary) {
        this.monsterSpeed = monsterSpeed;
        this.leftBoundary = leftBoundary;
        this.rightBoundary = rightBoundary;
    }
    
    /**
     * Act - do whatever the LandMoster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         move(monsterSpeed);
        
        if (getX() < leftBoundary || getX() > rightBoundary) {
            monsterSpeed = -monsterSpeed;
        }
    }    
}

