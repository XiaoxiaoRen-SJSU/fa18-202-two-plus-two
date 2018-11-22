import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2R3 here.
 * 
 * @author (Wenyan He) 
 * @version (version 1)
 */
public class Level2R3 extends GamePage
{

    /**
     * Constructor for objects of class Level2R3.
     * 
     */
    public Level2R3()
    {
        super();
    }

    public void prepare() {
        addObject(thief,136,630);
        addObject(score,819,79);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel,817,28);
        
        Bat bat1 = new Bat(4, 30, 1170);
        Bat bat2 = new Bat(-4, 30, 1170);

        addObject(bat1, 30, 100);
        addObject(bat2, 1170, 200);
      
        LandMonster landMonster1 = new LandMonster(0, 0, 1200);
        LandMonster landMonster2 = new LandMonster(2, 400, 600);
        LandMonster landMonster3 = new LandMonster(-2, 700, 850);
        LandMonster landMonster4 = new LandMonster(2, 950, 1100);

        addObject(landMonster1, 250, 670);
        addObject(landMonster2, 400, 670);
        addObject(landMonster3, 850, 670);
        addObject(landMonster4, 950, 670);

        
        
        Diamond diamond1 = new Diamond();
        Diamond diamond2 = new Diamond();
        Diamond diamond3 = new Diamond();
        Diamond diamond4 = new Diamond();
        Diamond diamond5 = new Diamond();
        Diamond diamond6 = new Diamond();
        Diamond diamond7 = new Diamond();
        Diamond diamond8 = new Diamond();
        Diamond diamond9 = new Diamond();
        Diamond diamond10 = new Diamond();
        Diamond diamond11 = new Diamond();
        Diamond diamond12 = new Diamond();
        
        
        addObject(diamond1, 250, 500);
        addObject(diamond2, 350, 500);
        addObject(diamond3, 600, 630);
        addObject(diamond4, 820, 700);
        addObject(diamond5, 1050, 400);
        /*

        addObject(diamond6,550,450);
        
        addObject(diamond7,700,450);
        addObject(diamond8,750,400);
        addObject(diamond9,800,450);

        addObject(diamond10,900,550);
        addObject(diamond11,950,500);
        addObject(diamond12,1000,550);
        */

        setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, Bat.class,
            LandMonster.class);
    }
}
