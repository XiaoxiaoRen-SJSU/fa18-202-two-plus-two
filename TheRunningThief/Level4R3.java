import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4R3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public class Level4R3 extends GamePage {
    /**
     * Constructor for objects of class Level4R3.
     * 
     */
    public Level4R3() {
        super();
    }
       
    public void prepare() {
        addObject(thief,136,630);
        addObject(score,819,79);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel, 817, 28);
        
        RedButton redButton1 = new RedButton();

        SwordDown swordDown1 = new SwordDown(true, -2, 200, 400);
        SwordDown swordDown2 = new SwordDown(true, -2, 250, 450);
        SwordDown swordDown3 = new SwordDown(true, -2, 300, 500);
        SwordDown swordDown4 = new SwordDown(true, 2, 400, 600);
        SwordDown swordDown5 = new SwordDown(true, 2, 450, 650);
        SwordDown swordDown6 = new SwordDown(true, 2, 500, 700);
        
        redButton1.attach(swordDown1);
        redButton1.attach(swordDown2);
        redButton1.attach(swordDown3);
        redButton1.attach(swordDown4);
        redButton1.attach(swordDown5);
        redButton1.attach(swordDown6);

        addObject(redButton1,400,700);
        addObject(swordDown1,300,10);
        addObject(swordDown2,350,10);
        addObject(swordDown3,400,10);
        addObject(swordDown4,500,10);
        addObject(swordDown5,550,10);
        addObject(swordDown6,600,10);
        
        Key key = new Key(1, 400, 500);
        redButton1.attach(key);
        addObject(key,450,10);
        
        Door door = new Door();
        addObject(door,699,576);
        thief.setDoor(door);

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
        
        addObject(diamond1,100,690);
        addObject(diamond2,200,500);
        addObject(diamond3,300,690);
        addObject(diamond4,400,500);
        addObject(diamond5,500,550);
        addObject(diamond6,600,690);
        addObject(diamond7,700,550);
        addObject(diamond8,900,450);
        addObject(diamond9,1000,550);
        addObject(diamond10,1100,500);
        
        setPaintOrder(Thief.class, Key.class, Diamond.class, SwordDown.class, RedButton.class, Door.class);
    }
    
}
