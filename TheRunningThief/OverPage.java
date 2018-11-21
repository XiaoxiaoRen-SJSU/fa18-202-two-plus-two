import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverPage extends GamePage {

    private Thief thief;
    private IScreenCommand replayGame;
    
    /**
     * Constructor for objects of class OverPage.
     * 
     */
    public OverPage() {
        super();
        thief = Thief.getThief();
        replayGame = new ScreenCommand();
        setReceiverReplayGame();
    }
    
    public void prepare() {
        OverTitle overTitle = new OverTitle();
        addObject(overTitle, 650, 127);
        
        DiamondLabel diamondLabel = new DiamondLabel();
        addObject(diamondLabel, 600, 317);
        
        Score score = new Score(Integer.toString(thief.countOfDiamond));
        addObject(score, 600, 368);
        
        TryAgainButton tryAgainButton = new TryAgainButton();
        tryAgainButton.setCommand(replayGame);
        addObject(tryAgainButton, 1000, 675);
    }
    
    private void setReceiverReplayGame() {
        replayGame.setReceiver(
            new IScreenReceiver() {
                /** Command Action */
                public void doAction() {
                    Greenfoot.setWorld(new HomePage());
                }
            }
        );
    }
}
