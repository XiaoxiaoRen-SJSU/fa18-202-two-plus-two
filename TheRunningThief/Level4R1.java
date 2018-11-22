import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4R1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public class Level4R1 extends GamePage {

    /**
     * Constructor for objects of class Level4R1.
     * 
     */
    public Level4R1() {
        super();
    }
    
    public void prepare() {        
        addObject(thief,136,630);
        addObject(score,819,79);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel, 817, 28);
        
        RedButton redButton1 = new RedButton();
        RedButton redButton2 = new RedButton();
        RedButton redButton3 = new RedButton();

        SwordDown swordDown1 = new SwordDown(false, 0, 0, 1200);
        SwordDown swordDown2 = new SwordDown(false, 0, 0, 1200);
        SwordDown swordDown3 = new SwordDown(false, 0, 0, 1200);
        
        redButton1.attach(swordDown1);
        redButton2.attach(swordDown2);
        redButton3.attach(swordDown3);
        
        addObject(redButton1,300,700);
        addObject(redButton2,600,700);
        addObject(redButton3,900,700);
        addObject(swordDown1,300,10);
        addObject(swordDown2,600,10);
        addObject(swordDown3,900,10);
        
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
        Diamond diamond13 = new Diamond();
        Diamond diamond14 = new Diamond();
        Diamond diamond15 = new Diamond();
        
        addObject(diamond1,300,690);
        addObject(diamond2,600,690);
        addObject(diamond3,900,690);
        
        addObject(diamond4,385,590);
        addObject(diamond5,450,590);
        addObject(diamond6,516,590);
        addObject(diamond7,416,540);
        addObject(diamond8,486,540);
        addObject(diamond9,449,491);
        
        addObject(diamond10,685,590);
        addObject(diamond11,750,590);
        addObject(diamond12,816,590);
        addObject(diamond13,716,540);
        addObject(diamond14,786,540);
        addObject(diamond15,749,491);

        setPaintOrder(Thief.class, Diamond.class, DiamondLabel.class, SwordDown.class, RedButton.class);
    }
    
    
}
