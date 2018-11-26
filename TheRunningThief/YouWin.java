import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class YouWin extends Actor {
	boolean big = false;

	/**
	 * Act - do whatever the YouWin wants to do. This method is called whenever the
	 * 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		GreenfootImage img = getImage();
		if (!big) {
			img.scale(550, 230);
			big = true;
		} else {
			img.scale(528, 221);
			big = false;
		}
	}
}
