import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{   
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // Added by Min Lu
    private int turnSpeed = 1;
    public void act() 
    {
        turn(turnSpeed);
        if(getRotation() >= 5) {
            turnSpeed = -turnSpeed;
        }
    }    
}
