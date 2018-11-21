import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class GamePage extends World
{
    Thief thief = Thief.getThief();
    protected Score score = new Score(Integer.toString(thief.countOfDiamond));
    //GreenfootSound backgroundMusic = new GreenfootSound("background.wav");
    
    /**
     * Constructor for objects of class GamePage.
     * 
     */
    public GamePage()
    {    
        // Create a new world with 1200x7800 cells with a cell size of 1x1 pixels.
        super(1200, 780, 1); 
        //backgroundMusic.play();
    }
    
    public abstract void prepare();
        
    public void act() {
        score.setText(Integer.toString(thief.countOfDiamond));
        
        removeObjects(getObjects(Heart.class));
        int delta = 0;
        for(int i = 0; i < thief.lives; i++) {
            Heart heart = new Heart();
            addObject(heart,962 + delta,45);
            delta += 85;
        }
    }
}

    
