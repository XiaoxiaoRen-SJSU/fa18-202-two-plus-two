import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2R1 here.
 * 
 * @author (Wenyan He) 
 * @version (version 1)
 */
public class Level2R1 extends GamePage
{

    /**
     * Constructor for objects of class Level2R1.
     * 
     */
    public Level2R1()
    {
        super();
    }

    public void prepare() {
        addObject(thief,136,630);
        addObject(score,819,79);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel,817,28);
        
        // only stationary landmonsters in this stage
        LandMonster landMonster1 = new LandMonster(0, 0, 1200);
        LandMonster landMonster2 = new LandMonster(0, 0, 1200);
        LandMonster landMonster3 = new LandMonster(0, 0, 1200);
        LandMonster landMonster4 = new LandMonster(0, 0, 1200);

        addObject(landMonster1, 350, 670);
        // addObject(landMonster2, 440, 670);
        addObject(landMonster3, 700, 670);
        addObject(landMonster4, 950, 670);

        BombDown bombDown1 = new BombDown(false, 1, 0, 1200);
        BombDown bombDown2 = new BombDown(false, 1, 0, 1200);
        BombDown bombDown3 = new BombDown(false, 1, 0, 1200);
        BombDown bombDown4 = new BombDown(false, 1, 0, 1200);
        
        addObject(bombDown1, 300, 100);
        addObject(bombDown2, 500, 100);
        addObject(bombDown3, 820, 180);
        addObject(bombDown4, 1000, 250);

        Diamond diamond1 = new Diamond();
        Diamond diamond2 = new Diamond();
        Diamond diamond3 = new Diamond();
        Diamond diamond4 = new Diamond();
        Diamond diamond5 = new Diamond();
        
        addObject(diamond1, 250, 500);
        addObject(diamond2, 350, 500);
        addObject(diamond3, 600, 630);
        addObject(diamond4, 820, 700);
        addObject(diamond5, 1050, 400);

        setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class,
            BombDown.class, LandMonster.class);
    }
}
