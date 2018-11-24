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
        
        LandMonster landMonster1 = new LandMonster(1, 300, 400);
        LandMonster landMonster2 = new LandMonster(2, 700, 950);
        // LandMonster landMonster3 = new LandMonster(2, 800, 950);

        addObject(landMonster1, 350, 670);
        addObject(landMonster2, 700, 670);
        // addObject(landMonster3, 800, 670);

        RotatingBomb bomb1 = new RotatingBomb(2);
        RotatingBomb bomb2 = new RotatingBomb(2);
        RotatingBomb bomb3 = new RotatingBomb(2);
        RotatingBomb bomb4 = new RotatingBomb(2);
        RotatingBomb bomb5 = new RotatingBomb(2);
        RotatingBomb bomb6 = new RotatingBomb(2);
        
        addObject(bomb1, 100, 100);
        addObject(bomb2, 300, 100);
        addObject(bomb3, 500, 100);
        addObject(bomb4, 700, 100);
        addObject(bomb5, 900, 100);
        addObject(bomb6, 1100, 100);

        Diamond diamond1 = new Diamond();
        Diamond diamond2 = new Diamond();
        Diamond diamond3 = new Diamond();
        Diamond diamond4 = new Diamond();
        Diamond diamond5 = new Diamond();
        Diamond diamond6 = new Diamond();
        Diamond diamond7 = new Diamond();
        Diamond diamond8 = new Diamond();
        
        addObject(diamond1, 250, 500);
        addObject(diamond2, 300, 500);
        addObject(diamond3, 550, 630);
        addObject(diamond4, 600, 630);
        addObject(diamond5, 575, 600);
        addObject(diamond6, 1050, 400);
        addObject(diamond7, 1050, 500);
        addObject(diamond8, 1050, 600);

        setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class,
            BombDown.class, LandMonster.class);
    }
}
