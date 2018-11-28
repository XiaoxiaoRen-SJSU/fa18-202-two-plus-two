import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class RedButton here.
 * 
 * @author Yimu Yang
 * @version (a version number or a date)
 */
public class RedButton extends Actor implements IButtonEventSubject {
	boolean isDown;
	private ArrayList<IButtonEventObserver> observers;

	public RedButton() {
		observers = new ArrayList<IButtonEventObserver>();
		isDown = false;
	}

	public void turnDown() {
		isDown = true;
		notifyObservers();
	}

	public void attach(IButtonEventObserver obj) {
		observers.add(obj);
	}

	public void removeObserver(IButtonEventObserver obj) {
		int i = observers.indexOf(obj);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			IButtonEventObserver observer = observers.get(i);
			observer.buttonEvent();
		}
	}

	// Trick Overriding, Pay Attention. In this way, the RedButton does not have
	// function to move
	@Override
	public void move(int distance) {
		turnDown();
	}

	// Trick Overriding, Pay Attention. In this way, the RedButton does not have
	// function to be tested if it is at edge
	@Override
	public boolean isAtEdge() {
	    return isDown;
	}
	
	/**
	 * Act - do whatever the RedButton wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() {

	}
}
