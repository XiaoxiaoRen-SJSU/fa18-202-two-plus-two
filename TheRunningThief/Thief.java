import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thief extends Actor {
    // Create by Xiaoxiao Ren. Implement Singleton Pattern.
    private static Thief thief;
    
    private Thief() {
        
    }
    
    public static Thief getThief() {
        if (thief == null) {
            thief = new Thief();
        }
        return thief;
    }
    // Singleton ends here
    
    WorldController worldCtrl;
    public int countOfDiamond = 0; 
    public int lives = 3; // You have 3 lives at beginning of the game.
    
    int HSpeed = 8;
    int VSpeed = 0;
    int acceleration = 1;
    int JumpStrength = 10;
    
    Door door;
    
    /**
     * Act - do whatever the ThiefRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Added By Yimu Yang
        isOver();
        checkDie();
        checkMove();
        checkDiamond();
        changePage();
        checkKey();
        // Added By Yimu Yang
        checkButton();
    }
    
    public void setDoor(Door d) {
        this.door = d;
    }
    
    public void setWorldController(WorldController w) {
        this.worldCtrl = w;
    }
    
    // Create by Xiaoxiao Ren. Actor will open the door after get the key.
    private void checkKey() {
        if (isTouching(Key.class)) {
            door.openDoor();
        }
        removeTouching(Key.class);
    }
    
    // Create by Yimu Yang. Red Button should be switched to White Button if touched by actor
    private void checkButton() {
        if (isTouching(RedButton.class)) {
            Actor actor = getOneIntersectingObject(RedButton.class);
            actor.setImage("whiteButton.png");
            actor.move(0);
        }
    }

    // Create by Xiaoxiao Ren. Change page function.
    private void changePage() {
        if (getX() >= getWorld().getWidth() - 20) {
            if (worldCtrl != null) {
                int index = (worldCtrl.getPageChain()).indexOf((GamePage)getWorld());
                if (index != worldCtrl.getPageChain().size() - 1){
                    GamePage nextWorld = worldCtrl.getPageChain().get(index + 1);
                    nextWorld.prepare();
                    Greenfoot.setWorld(nextWorld);
                }
            }
        }
    }
    
    // Create by Xiaoxiao Ren. Check if the thief get a diamond.
    private void checkDiamond() {
        if (isTouching(Diamond.class)) {
            countOfDiamond++;
        }
        removeTouching(Diamond.class);
    }
    
    // Create by Xiaoxiao Ren/Yimu Yang. Check if the thief touch something he should not touch.
    private void checkDie() {
        if (isTouching(Bat.class)) {
            //System.out.println("Touch bat");
            lives--;
            System.currentTimeMillis();
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);   
            
            this.setLocation(136,630);
        }
        Actor monster = getOneObjectAtOffset(25, 70, LandMonster.class);
        if (monster != null) {
            //System.out.println("Touch landmonster");
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200); 
            
            this.setLocation(136,630);
        }
        
        if (isTouching(SwordDown.class)) {
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);
            
            this.setLocation(136,630);
        }

        // Add by Min Lu. Check if the thief touch SwordUp.
        if (isTouching(SwordUp.class)) {
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);
            
            this.setLocation(136,630);
        }
    }
    
    // Create by Xiaoxiao Ren. Check if the actor should move and direction of movement.
    private void checkMove() {
        if (door != null && !door.isOpen()) {
            Actor dr = getOneObjectAtOffset(20, 70, Door.class);
            if (dr != null) {
            } else {
               if(Greenfoot.isKeyDown("right")) {
                   setLocation(getX() + HSpeed, getY());
               } 
            }
            
        } else {
            if(Greenfoot.isKeyDown("right")) {
                setLocation(getX() + HSpeed, getY());
            }
        }
        
        if (Greenfoot.isKeyDown("left")) {
                setLocation(getX() - HSpeed, getY());
        }
        
        if (Greenfoot.isKeyDown("space")) {
            jump();
        }
        
        fallCheck();
    }
    
    // Create by Xiaoxiao Ren. Jump funtion.
    private void jump() {
        VSpeed = -JumpStrength;
        fall();
    }
    
    // Create by Xiaoxiao Ren. Check if the actor should fall.
    private void fallCheck() {
        if (getY() >= 630) {
            VSpeed = 0;
        } else {
            fall();
        }
    }
    
    // Create by Xiaoxiao Ren. Fall funtion.
    private void fall() {  
        setLocation(getX(), getY() + VSpeed);
        VSpeed += acceleration;
    }
    
    // Create by Xiaoxiao Ren. Check falling boundary condition.
    private boolean isGround() {
        if (getY() == 630) {
            VSpeed = 0;
            return true;
        }
        return false;
    }
    
    // Author: Yimu Yang
    private void isOver() {
        if (lives <= 0) {
            GamePage endPage = worldCtrl.getOverPage();
            endPage.prepare();
            Greenfoot.setWorld(endPage);
        }
    }
    
}
