import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of interface IStrategy here.
 * 
 * @author (Min Lu)
 * @version (11/25/2018)
 */
public class EasyStrategy implements IStrategy{
	/**
	 * diffDegree can change actors' speed.
	 */
	public int diffDegree(){
		return 1;
	}
}
