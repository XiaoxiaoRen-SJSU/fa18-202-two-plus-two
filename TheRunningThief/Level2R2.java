import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2R2 here.
 * 
 * @author (Wenyan He) 
 * @version (version 1)
 */
public class Level2R2 extends GamePage
{

    /**
     * Constructor for objects of class Level2R2.
     * 
     */
    public Level2R2()
    {
        super();
    }

    public void prepare() {
        addObject(thief,136,630);
        addObject(score,819,79);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel,817,28);
        
        // there are one-direction moving landmonsters in this stage
        OneDirectionLandMonster landMonster1 =
            new OneDirectionLandMonster(-2);
        /*
        LandMonster landMonster2 = new LandMonster(0, 0, 1200);
        LandMonster landMonster3 = new LandMonster(0, 0, 1200);
        LandMonster landMonster4 = new LandMonster(0, 0, 1200);
        */

        addObject(landMonster1, 1180, 670);
        /*
        addObject(landMonster2, 760, 670);
        addObject(landMonster3, 400, 670);
        addObject(landMonster4, 900, 670);
        */

        OneDirectionBat bat1 = new OneDirectionBat(4);
        addObject(bat1, 20, 300);
        
        
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

        setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, OneDirectionBat.class, OneDirectionLandMonster.class);
    }
}
