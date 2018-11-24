import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1R1 here.
 * 
 * @author (Min Lu) 
 * @version (11/12/2018)
 */
public class Level1R1 extends GamePage {
    
    /**
     * Constructor for objects of class Level1R1.
     * 
     */
    public Level1R1() {
        super();
    }
    
    public void prepare() {        
        addObject(thief,136,630);
        addObject(score,819,79);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel,817,28);
        
        BombDown bombDown1 = new BombDown(false, 1, 0, 1200);
        BombDown bombDown2 = new BombDown(false, 1, 0, 1200);
        BombDown bombDown3 = new BombDown(false, 1, 0, 1200);
        BombDown bombDown4 = new BombDown(false, 1, 0, 1200);
        
        addObject(bombDown1,300,10);
        addObject(bombDown2,500,10);
        addObject(bombDown3,800,10);
        addObject(bombDown4,1000,10);

        bombDown1.buttonEvent();
        bombDown2.buttonEvent();
        bombDown3.buttonEvent();
        bombDown4.buttonEvent();
        
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
        
        addObject(diamond1,250,550);
        addObject(diamond2,300,500);
        addObject(diamond3,350,550);

        addObject(diamond4,450,450);
        addObject(diamond5,500,400);
        addObject(diamond6,550,450);
        
        addObject(diamond7,700,450);
        addObject(diamond8,750,400);
        addObject(diamond9,800,450);

        addObject(diamond10,900,550);
        addObject(diamond11,950,500);
        addObject(diamond12,1000,550);

        setPaintOrder(ThiefRight.class, ThiefLeft.class, Diamond.class,
            DiamondLabel.class, BombDown.class);
    }
    
    
}
