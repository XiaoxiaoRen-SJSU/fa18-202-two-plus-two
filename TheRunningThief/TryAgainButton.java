import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TryAgainButton here.
 * 
 * @author Yimu Yang
 * @version (a version number or a date)
 */
public class TryAgainButton extends Actor {
	IScreenInvoker reStart = new ScreenInvoker();
	GreenfootSound playGameMusic = new GreenfootSound("playGameButton.wav");

	public void setCommand(IScreenCommand c) {
		reStart.setCommand(c);
	}

	public void act() {

		if (Greenfoot.mousePressed(this)) {
			GreenfootImage img = getImage();
			img.scale(300, 110);
		}

		if (Greenfoot.mouseClicked(this)) {
		    playGameMusic.play();
		    reStart.invoke();
		}
	}

}
