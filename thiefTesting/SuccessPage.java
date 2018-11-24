import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SuccessPage here.
 * 
 * @author (Min Lu) 
 * @version (11/12/2018)
 */
public class SuccessPage extends GamePage {

    private ThiefRight thief;
    private IScreenCommand replayGame;
    
    /**
     * Constructor for objects of class SuccessPage.
     * 
     */
    public SuccessPage() {
        super();
        thief = ThiefRight.getThief();
        replayGame = new ScreenCommand();
        setReceiverReplayGame();
    }
    
    public void prepare() {
        YouWin youwin = new YouWin();
        addObject(youwin, 600, 227);
        
        Score score = new Score(Integer.toString(thief.countOfDiamond));
        addObject(score, 600, 277);
        
        TryAgainButton tryAgainButton = new TryAgainButton();
        tryAgainButton.setCommand(replayGame);
        addObject(tryAgainButton, 1000, 675);

        addObject(thief,136,430);
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
