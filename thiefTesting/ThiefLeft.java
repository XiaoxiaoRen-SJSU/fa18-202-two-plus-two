import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * updated by Wenyan He on Nov 22, 2018 at 6:00pm PST
 * added isTouching( RotatingBomb.class ) block
 * changed class type to abstract due to added abstract method nextState()
 */
public class ThiefLeft extends Thief implements IThiefState {
    // GreenfootSound backgroundMusic = new GreenfootSound("background.mp3");
    // Create by Xiaoxiao Ren. Implement Singleton Pattern.
    private static ThiefLeft thief;
    public int countOfDiamond = 0; 
    public int lives = 3; // You have 3 lives at beginning of the game.
    
    private ThiefLeft() {
        backgroundMusic.playLoop();
    }

    public ThiefLeft(int diamonds, int lives) {
        this.countOfDiamond = diamonds;
        this.lives = lives;
        backgroundMusic.playLoop();
    }
    
    public static ThiefLeft getThief() {
        if (thief == null) {
            thief = new ThiefLeft();
        }
        return thief;
    }
    // Singleton ends here
    
    WorldController worldCtrl;
    
    int HSpeed = 8;
    int VSpeed = 0;
    int acceleration = 1;
    int JumpStrength = 10;
    
    Door door;
    

    GreenfootSound gameoverMusic = new GreenfootSound("gameover.wav");
    
    /**
     * Act - do whatever the ThiefLeft wants to do. This method is called whenever
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
            GreenfootSound keyMusic = new GreenfootSound("key.wav");
            keyMusic.play();
            door.openDoor();
        }
        removeTouching(Key.class);
    }
    
    // Create by Yimu Yang. Red Button should be switched to White Button if touched by actor
    private void checkButton() {
        if (isTouching(RedButton.class)) {
            GreenfootSound redButtonMusic = new GreenfootSound("RedButton.wav");
            redButtonMusic.play();
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
            GreenfootSound diamondMusic = new GreenfootSound("diamond.wav");
            diamondMusic.play();
            countOfDiamond++;
        }
        removeTouching(Diamond.class);
    }
    
    // Create by Xiaoxiao Ren/Yimu Yang. Check if the thief touch something he should not touch.
    private void checkDie() {
        if (isTouching(Bat.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);   
            
            this.setLocation(136,630);
        }

        // Added by Wenyan He
        if( isTouching( OneDirectionBat.class ) ) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);   
            
            this.setLocation(136,630);
        }

        // Added by Wenyan He
        if( isTouching( OneDirectionLandMonster.class ) ) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);   
            
            this.setLocation(136,630);
        }

        // Added by Wenyan He
        if( isTouching( RotatingBomb.class ) ) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);   
            
            this.setLocation(136,630);
        }

        Actor monster = getOneObjectAtOffset(25, 70, LandMonster.class);
        if (monster != null) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200); 
            
            this.setLocation(136,630);
        }
        
        if (isTouching(SwordDown.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);
            
            this.setLocation(136,630);
        }

        // Add by Min Lu. Check if the thief touch SwordUp.
        if (isTouching(SwordUp.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);
            
            this.setLocation(136,630);
        }
        if (isTouching(BombDown.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            
            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200);
            
            this.setLocation(136,630);
        }
        if (isTouching(BombUp.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
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
               if(Greenfoot.isKeyDown("left")) {
                   setLocation(getX() - HSpeed, getY());
               } 
            }
            
        } else {
            if(Greenfoot.isKeyDown("right")) {
                // setLocation(getX() + HSpeed, getY());
                nextState();
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
            gameoverMusic.play();
            GamePage endPage = worldCtrl.getOverPage();
            endPage.prepare();
            Greenfoot.setWorld(endPage);
        }
    }
    
    // Author: Wenyan He
    public void nextState() {
        ThiefRight thiefRight = new ThiefRight(countOfDiamond, lives);
        int x = this.getX();
        int y = this.getY();
        getWorld().removeObject(this);
        thiefRight.setLocation(x, y);
    }
}
