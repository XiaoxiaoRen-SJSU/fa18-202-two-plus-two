import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3R1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3R1 extends GamePage {
    /**
     * Constructor for objects of class Level3R1.
     * 
     */
    public Level3R1() {
        super();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare() {
        addObject(thief,136,630);
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel, 817, 28);
        //Diamond diamond = new Diamond();
        //addObject(diamond,817,28);
        addObject(score,819,79);
        LandMonster landMonster = new LandMonster(1, 420, 460);
        addObject(landMonster,440,670);
        LandMonster landMonster2 = new LandMonster(1, 750, 770);
        addObject(landMonster2,760,670);
        LandMonster landMonster3 = new LandMonster(1, 837, 857);
        addObject(landMonster3,847,670);
        Diamond diamond2 = new Diamond();
        addObject(diamond2,244,688);
        Diamond diamond3 = new Diamond();
        addObject(diamond3,300,688);
        Diamond diamond4 = new Diamond();
        addObject(diamond4,391,512);
        Diamond diamond5 = new Diamond();
        addObject(diamond5,436,478);
        Diamond diamond6 = new Diamond();
        addObject(diamond6,478,513);
        Diamond diamond7 = new Diamond();
        addObject(diamond7,564,688);
        Diamond diamond8 = new Diamond();
        addObject(diamond8,620,688);
        Diamond diamond9 = new Diamond();
        addObject(diamond9,733,492);
        Diamond diamond10 = new Diamond();
        addObject(diamond10,788,461);
        Diamond diamond11 = new Diamond();
        addObject(diamond11,847,459);
        Diamond diamond12 = new Diamond();
        addObject(diamond12,901,489);
        Diamond diamond13 = new Diamond();
        addObject(diamond13,971,688);
        Diamond diamond14 = new Diamond();
        addObject(diamond14,1027,688);
        Diamond diamond15 = new Diamond();
        addObject(diamond15,1083,688);
        Bat bat = new Bat(5, 245, 1100);
        addObject(bat,245,461);
        
        setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class);
    }
    
}
