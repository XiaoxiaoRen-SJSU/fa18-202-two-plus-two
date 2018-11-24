import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGameButton extends Actor
{
    /**
     * Act - do whatever the PlayGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    IScreenInvoker gameStart = new ScreenInvoker();
    GreenfootSound playGameMusic = new GreenfootSound("playGameButton.wav");
    
    public void setScreenItem(IScreenCommand c) {
        gameStart.setCommand(c);
    }
    
    public void act() 
    {
        if(Greenfoot.mousePressed(this)) {
            GreenfootImage img = getImage();
            img.scale(300, 110);
        }
        if(Greenfoot.mouseClicked(this)) {
            playGameMusic.play();
            gameStart.invoke();
        }
    }    
}
