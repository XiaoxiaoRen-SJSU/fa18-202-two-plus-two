import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HardModeButton here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class HardModeButton extends Actor{
    GreenfootSound playGameMusic = new GreenfootSound("easyhardmodebutton.mp3");    
    /**
     * Act - do whatever the HardModeButton wants to do. This method is called
     * whenever the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() {
        if (Greenfoot.mousePressed(this)) {
            GreenfootImage img = getImage();
            img.scale(200, 55);
        }

        if (Greenfoot.mouseClicked(this)) {
            GameModeSingleton.getInstance().setStrategy(new HardStrategy());
            playGameMusic.play();
        }
    }
}
