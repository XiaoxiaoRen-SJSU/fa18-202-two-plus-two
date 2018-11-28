import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrow extends Actor {
    
    GreenfootSound playGameMusic = new GreenfootSound("easyhardmodebutton.mp3");
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever the
     * 'Act' or 'Run' button gets pressed in the environment.
     */
    private World wld;

    public void act() {
        // Add your action code here.
        wld = this.getWorld();
        if (Greenfoot.mouseClicked(wld.getObjects(EasyModeButton.class).get(0))) {
            playGameMusic.play();
            this.setLocation(309, 745);
        }
        if (Greenfoot.mouseClicked(wld.getObjects(HardModeButton.class).get(0))) {
            playGameMusic.play();
            this.setLocation(509, 745);
        }
    }
}
