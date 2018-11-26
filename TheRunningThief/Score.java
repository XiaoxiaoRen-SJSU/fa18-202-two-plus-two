import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Score extends Actor {
	public Score(String text) {
		GreenfootImage score = new GreenfootImage(60, 40);
		score.setColor(Color.WHITE);
		score.setFont(score.getFont().deriveFont(30));

		String newText = new String(text);

		if (text.length() == 1) {
			newText = (" 0").concat(newText);
		} else if (text.length() == 2) {
			newText = ("0").concat(newText);
		}
		score.drawString(newText, 0, 35);
		setImage(score);
	}

	/**
	 * Act - do whatever the Score wants to do. This method is called whenever the
	 * 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void setText(String text) {
		GreenfootImage score = getImage();
		score.clear();

		String newText = new String(text);

		if (text.length() == 1) {
			newText = (" 0").concat(newText);
		} else if (text.length() == 2) {
			newText = ("0").concat(newText);
		}
		score.drawString(newText, 0, 35);
	}
}
