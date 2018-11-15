import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3R3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3R3 extends GamePage
{

    /**
     * Constructor for objects of class Level3R3.
     * 
     */
    public Level3R3()
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
        Bat bat = new Bat(1, 157, 257);
        addObject(bat,207,400);
        Bat bat2 = new Bat(1, 224, 324);
        addObject(bat2,274,400);
        Bat bat3 = new Bat(1, 463, 563);
        addObject(bat3,513,400);
        Bat bat4 = new Bat(1, 530, 630);
        addObject(bat4,580,400);
        Key key = new Key(1, 344, 444);
        addObject(key,394,400);
        Diamond diamond2 = new Diamond();
        addObject(diamond2,354,680);
        Diamond diamond3 = new Diamond();
        addObject(diamond3,287,706);
        Diamond diamond4 = new Diamond();
        addObject(diamond4,420,706);
        Diamond diamond5 = new Diamond();
        addObject(diamond5,487,680);
        
        Door door = new Door();
        addObject(door,699,576);
        thief.setDoor(door);

        setPaintOrder(Thief.class, Door.class);

        LandMonster landMonster = new LandMonster(1, 800, 1030);
        addObject(landMonster,830,689);
        Diamond diamond6 = new Diamond();
        addObject(diamond6,901,578);
        Diamond diamond7 = new Diamond();
        addObject(diamond7,963,578);
        Diamond diamond8 = new Diamond();
        addObject(diamond8,1025,578);
        Diamond diamond9 = new Diamond();
        addObject(diamond9,919,530);
        diamond9.setLocation(932,533);
        Diamond diamond10 = new Diamond();
        addObject(diamond10,994,536);

    }
}
