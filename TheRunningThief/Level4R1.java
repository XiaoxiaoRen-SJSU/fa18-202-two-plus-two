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
        thief.lives = 3;
        
        addObject(thief,136,630);
        addObject(score,819,79);
        
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
        
        addObject(diamond1,300,700);
        addObject(diamond2,450,500);
        addObject(diamond3,550,300);
        addObject(diamond4,600,300);
        addObject(diamond5,750,500);
        addObject(diamond6,900,700);
        addObject(diamond7,950,500);
        addObject(diamond8,1000,400);
        addObject(diamond9,1050,300);
        addObject(diamond10,1050,200);

    }
    
    
}
