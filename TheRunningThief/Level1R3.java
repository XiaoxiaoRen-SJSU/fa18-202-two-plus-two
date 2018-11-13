import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1R1 here.
 * 
 * @author (Min Lu) 
 * @version (11/12/2018)
 */
public class Level1R3 extends GamePage {

    /**
     * Constructor for objects of class Level1R1.
     * 
     */
    public Level1R3() {
        super();
    }
    
    public void prepare() {        
        addObject(thief,136,630);
        addObject(score,819,79);
        
        Points points = new Points();
        addObject(points,817,28);
        
        SwordDown swordDown1 = new SwordDown(false, 1, 0, 1200);
        SwordDown swordDown2 = new SwordDown(false, 1, 0, 1200);
        SwordDown swordDown3 = new SwordDown(false, 1, 0, 1200);
        SwordUp swordUp1 = new SwordUp(false, 1, 0, 1200);
        SwordUp swordUp2 = new SwordUp(false, 1, 0, 1200);
        
        addObject(swordDown1,200,10);
        addObject(swordDown2,600,10);
        addObject(swordDown3,1000,10);
        addObject(swordUp1,400,770);
        addObject(swordUp2,800,770);

        swordDown1.buttonEvent();
        swordDown2.buttonEvent();
        swordDown3.buttonEvent();
        swordUp1.buttonEvent();
        swordUp2.buttonEvent();
        
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
        
        addObject(diamond1,300,690);
        addObject(diamond2,450,500);
        addObject(diamond3,550,690);
        addObject(diamond4,600,500);
        addObject(diamond5,750,450);
        addObject(diamond6,900,690);
        addObject(diamond7,950,500);
        addObject(diamond8,1000,550);
        addObject(diamond9,1050,650);
        addObject(diamond10,1050,500);

        setPaintOrder(Thief.class, Diamond.class, RedButton.class);
    }
    
    
}
