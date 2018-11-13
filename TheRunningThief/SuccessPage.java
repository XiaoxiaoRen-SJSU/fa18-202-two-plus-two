import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuccessPage here.
 * 
 * @author (Min Lu) 
 * @version (11/12/2018)
 */
public class SuccessPage extends GamePage {

    private Thief thief;
    private IScreenCommand replayGame;
    
    /**
     * Constructor for objects of class SuccessPage.
     * 
     */
    public SuccessPage() {
        super();
        thief = Thief.getThief();
        replayGame = new ScreenCommand();
        setReceiverReplayGame();
    }
    
    public void prepare() {
        EndingTitle endingtitle = new EndingTitle();
        addObject(endingtitle, 600, 127);
        
        Score score = new Score(Integer.toString(thief.countOfDiamond));
        addObject(score, 600, 227);
        
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
