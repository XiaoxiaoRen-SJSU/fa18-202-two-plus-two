import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EasyModeButton here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class EasyModeButton extends Actor{
	/**
	 * Act - do whatever the EasyModeButton wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	
	public void act() {
		if (Greenfoot.mousePressed(this)) {
			GreenfootImage img = getImage();
			img.scale(190, 52);
		}

		if (Greenfoot.mouseClicked(this)) {
			GameModeSingleton.getInstance().setStrategy(new EasyStrategy());
		}
	}
}
