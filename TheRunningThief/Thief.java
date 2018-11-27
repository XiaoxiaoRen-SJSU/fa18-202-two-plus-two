import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefRight here.
 * 
 * @author (your name)
 * @version (a version number or a date) updated by Wenyan He on Nov 22, 2018 at
 *          6:00pm PST added isTouching( RotatingBomb.class ) block
 */
public class Thief extends Actor {

    private IScreenCommand continueCmd;
    private IScreenCommand exitCmd;

    GreenfootSound backgroundMusic = new GreenfootSound("background.mp3");
    // Create by Xiaoxiao Ren. Implement Singleton Pattern.
    private static Thief thief;

    // Created by Wenyan He for state pattern implementation
    private IThiefState thiefState = new ThiefRightState();

    private Thief() {
        backgroundMusic.playLoop();
        continueCmd = new ScreenCommand();
        exitCmd = new ScreenCommand();
        setReceiverContinue();
        setReceiverExit();
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

    GreenfootSound gameoverMusic = new GreenfootSound("gameover.wav");

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
        checkPage();
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

    // Create by Yimu Yang. Red Button should be switched to White Button if touched
    // by actor
    private void checkButton() {
        if (isTouching(RedButton.class)) {
            GreenfootSound redButtonMusic = new GreenfootSound("redbutton1.mp3");
            redButtonMusic.play();
            Actor actor = getOneIntersectingObject(RedButton.class);
            actor.setImage("whiteButton.png");
            actor.move(0);
        }
    }

    // Create by Xiaoxiao Ren. Change page function.
    private void checkPage() {
        if (getX() >= getWorld().getWidth() - 20) {
            if (worldCtrl != null) {
                int index = (worldCtrl.getPageChain()).indexOf((GamePage) getWorld());
                if (index + 2 == worldCtrl.getPageChain().size()) {
                    GreenfootSound successMusic = new GreenfootSound("success.wav");
                    // added by Wenyan He to replace background music with
                    // success music for "You Win" page
                    // backgroundMusic.stop();
                    successMusic.play();
                }
                if ((index + 1) % 3 == 0 && (index + 1) / 3 == 1) {
                    DialogLevel2 dl2 = new DialogLevel2();
                    ContinueButton cb2 = new ContinueButton();
                    ExitButton eb2 = new ExitButton();
                    cb2.setScreenItem(continueCmd);
                    eb2.setScreenItem(exitCmd);
                    World world = getWorld();
                    world.addObject(dl2, 610, 400);
                    world.addObject(cb2, 720, 460);
                    world.addObject(eb2, 500, 460);
                } else if ((index + 1) % 3 == 0 && (index + 1) / 3 == 2) {
                    DialogLevel3 dl3 = new DialogLevel3();
                    ContinueButton cb3 = new ContinueButton();
                    ExitButton eb3 = new ExitButton();
                    cb3.setScreenItem(continueCmd);
                    eb3.setScreenItem(exitCmd);
                    World world = getWorld();
                    world.addObject(dl3, 610, 400);
                    world.addObject(cb3, 720, 460);
                    world.addObject(eb3, 500, 460);
                } else if ((index + 1) % 3 == 0 && (index + 1) / 3 == 3) {
                    DialogLevel4 dl4 = new DialogLevel4();
                    ContinueButton cb4 = new ContinueButton();
                    ExitButton eb4 = new ExitButton();
                    cb4.setScreenItem(continueCmd);
                    eb4.setScreenItem(exitCmd);
                    World world = getWorld();
                    world.addObject(dl4, 610, 400);
                    world.addObject(cb4, 720, 460);
                    world.addObject(eb4, 500, 460);
                } else {
                    switchPage();
                }
            }
        }
    }
    
    // Create by Xiaoxiao Ren. Function to switch page.
    public void switchPage() {
        if (worldCtrl != null) {
            int index = (worldCtrl.getPageChain()).indexOf((GamePage) getWorld());
            if (index != worldCtrl.getPageChain().size() - 1) {
                GamePage nextWorld = worldCtrl.getPageChain().get(index + 1);
                nextWorld.prepare();
                Greenfoot.setWorld(nextWorld);
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

    // Create by Xiaoxiao Ren/Yimu Yang. Check if the thief touch something he
    // should not touch.
    private void checkDie() {
        if (isTouching(Bat.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }

        // Added by Wenyan He
        if (isTouching(OneDirectionBat.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }

        // Added by Wenyan He
        if (isTouching(OneDirectionLandMonster.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }

        // Added by Wenyan He
        if (isTouching(RotatingBomb.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;
            System.currentTimeMillis();

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }

        Actor monster = getOneObjectAtOffset(25, 70, LandMonster.class);
        if (monster != null) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }

        if (isTouching(SwordDown.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }

        // Add by Min Lu. Check if the thief touch SwordUp.
        if (isTouching(SwordUp.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }
        if (isTouching(BombDown.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }
        if (isTouching(BombUp.class)) {
            GreenfootSound touchObstacleMusic = new GreenfootSound("touchObstacle.wav");
            touchObstacleMusic.play();
            lives--;

            long curTime = System.currentTimeMillis();
            while (System.currentTimeMillis() < curTime + 200)
                ;

            this.setImage("right.png");
            this.setLocation(136, 630);
        }
    }

    // Create by Xiaoxiao Ren. Check if the actor should move and direction of
    // movement.
    private void checkMove() {
        if (door != null && !door.isOpen()) {
            Actor dr = getOneObjectAtOffset(20, 70, Door.class);
            if (dr != null) {
            } else {
                if (Greenfoot.isKeyDown("right")) {
                    // added by Wenyan He for state pattern implementation
                    if (HSpeed < 0)  // thief now facing left, or in Left State
                        thiefState.toggleState(this);
                    setLocation(getX() + HSpeed, getY());
                }
            }

        } else {
            if (Greenfoot.isKeyDown("right")) {
                // added by Wenyan He for state pattern implementation
                if (HSpeed < 0)  // thief now facing left, or in Left State
                    thiefState.toggleState(this);
                setLocation(getX() + HSpeed, getY());
            }
        }

        if (Greenfoot.isKeyDown("left")) {
            // added by Wenyan He for state pattern implementation
            if (HSpeed > 0)  // thief now facing right, or in Right State
                thiefState.toggleState(this);
            setLocation(getX() + HSpeed, getY());  // plus needs further check
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
            // added by Wenyan He to adjust thief direction for next round
            thief.setImage("right.png");

            gameoverMusic.play();
            GamePage endPage = worldCtrl.getOverPage();
            endPage.prepare();
            Greenfoot.setWorld(endPage);
        }
    }

    // Added by Wenyan He for state pattern implementation
    public void reverseDirection() {
        HSpeed = -HSpeed;
    }

    // Added by Wenyan He for state pattern implementation
    public void setState(IThiefState state) {
        thiefState = state;
    }

    private void setReceiverContinue() {
        continueCmd.setReceiver(new IScreenReceiver() {
            /** Command Action */
            public void doAction() {
                Thief thief = Thief.getThief();
                thief.switchPage();
            }
        });
    }

    private void setReceiverExit() {
        exitCmd.setReceiver(new IScreenReceiver() {
            /** Command Action */
            public void doAction() {
                Greenfoot.setWorld(new HomePage());
            }
        });
    }
}
