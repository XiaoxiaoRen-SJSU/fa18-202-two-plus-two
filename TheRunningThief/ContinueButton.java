import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ContinueButton here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContinueButton extends Actor {
	IScreenInvoker continueIvk;
	GreenfootSound playGameMusic;

	public ContinueButton() {
		GreenfootImage img = this.getImage();
		img.scale(200, 70);
		this.setImage(img);
		continueIvk = new ScreenInvoker();
		playGameMusic = new GreenfootSound("continueexitbutton.mp3");
	}

	public void setScreenItem(IScreenCommand c) {
		continueIvk.setCommand(c);
	}

	/**
	 * Act - do whatever the ContinueButton wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {
		if (Greenfoot.mousePressed(this)) {
			GreenfootImage img = getImage();
			img.scale(170, 50);
		}
		if (Greenfoot.mouseClicked(this)) {
			continueIvk.invoke();
			playGameMusic.play();
		}
	}
}
