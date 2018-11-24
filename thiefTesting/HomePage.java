import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomePage extends World
{
    ThiefRight thief;
    WorldController worldCtrl;
    private IScreenCommand playGame;
    
    // Create by Xiaoxiao Ren, the IScreenCommand variable.
    /**
     * Constructor for objects of class page.
     * 
     */
    public HomePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 780, 1); 
        
        // Create by Xiaoxiao Ren, initial commmand parttern.
        playGame = new ScreenCommand();
        setReceiverPlayGame();
        worldCtrl = new WorldController();
        thief = ThiefRight.getThief();
        prepare();
    }
    
    // Create by Xiaoxiao Ren. Prepare home page.
    private void prepare() {
        PlayGameButton playGameButton = new PlayGameButton();
        addObject(playGameButton,1003,675);
        playGameButton.setScreenItem(playGame);
        
        EasyModeButton easyModeButton = new EasyModeButton();
        addObject(easyModeButton,309,686);
        HardModeButton hardModeButton = new HardModeButton();
        addObject(hardModeButton,509,686);
        Title title = new Title();
        addObject(title,812,127);
        
        thief.countOfDiamond = 0;
        thief.lives = 3;
        
        thief.setWorldController(worldCtrl);
    }
    
    // Create by Xiaoxiao Ren. Set Command receiver.
    private void setReceiverPlayGame() {
        playGame.setReceiver(
            new IScreenReceiver() {
                /** Command Action */
                public void doAction() {
                    GamePage beginPage = worldCtrl.getPageChain().get(0);
                    beginPage.prepare();
                    Greenfoot.setWorld(beginPage);
                }
            }
        ) ;
    }

}
