import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3R2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3R2 extends GamePage
{

    /**
     * Constructor for objects of class Level3R2.
     * 
     */
    public Level3R2()
    {
        super();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        addObject(thief,136,630);
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel, 817, 28);
        //Diamond diamond = new Diamond();
        //addObject(diamond,817,28);
        addObject(score,819,79);
        Bat bat = new Bat(2, 207, 209);
        addObject(bat,207,441);
        Bat bat2 = new Bat(2, 274, 276);
        addObject(bat2,274,441);
        Bat bat3 = new Bat(2, 513, 515);
        addObject(bat3,513,441);
        Bat bat4 = new Bat(5, 580, 582);
        addObject(bat4,580,441);
        Key key = new Key(1, 394, 396);
        addObject(key,394,441);
        Diamond diamond2 = new Diamond();
        addObject(diamond2,354,680);
        Diamond diamond3 = new Diamond();
        addObject(diamond3,287,706);
        Diamond diamond4 = new Diamond();
        addObject(diamond4,420,706);
        Diamond diamond5 = new Diamond();
        addObject(diamond5,487,680);
        Diamond diamond6 = new Diamond();
        addObject(diamond6,827,698);
        Diamond diamond7 = new Diamond();
        addObject(diamond7,892,698);
        Diamond diamond8 = new Diamond();
        addObject(diamond8,957,698);
        Diamond diamond9 = new Diamond();
        addObject(diamond9,858,648);
        Diamond diamond10 = new Diamond();
        addObject(diamond10,928,648);
        Diamond diamond11 = new Diamond();
        addObject(diamond11,891,599);
        Door door = new Door();
        addObject(door,699,576);
        thief.setDoor(door);
        
        setPaintOrder(Thief.class, Door.class);
    }
}
