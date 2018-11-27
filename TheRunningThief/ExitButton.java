import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitButton extends Actor
{
    IScreenInvoker exitIvk;
    GreenfootSound playGameMusic;
    
    public ExitButton() {
        GreenfootImage img = this.getImage();
        img.scale(180, 70);
        this.setImage(img);
        exitIvk = new ScreenInvoker();
        playGameMusic = new GreenfootSound("continueexitbutton.mp3");
    }

    public void setScreenItem(IScreenCommand c) {
        exitIvk.setCommand(c);
    }

    /**
     * Act - do whatever the ExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this)) {
            GreenfootImage img = getImage();
            img.scale(150, 50);
        }
        if (Greenfoot.mouseClicked(this)) {
            exitIvk.invoke();
            playGameMusic.play();
        }
    }    
}
