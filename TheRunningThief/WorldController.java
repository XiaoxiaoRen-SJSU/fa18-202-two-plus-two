import java.util.*;
/**
 * Write a description of class WorldController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldController {
    //private static WorldController worldCtrl;
    
    List<GamePage> pageChain = new LinkedList<GamePage>();
    
    private GamePage level11;
    private GamePage level12;
    private GamePage level13;

    private GamePage level31;
    private GamePage level32;
    private GamePage level33;
    
    private GamePage level41;
    private GamePage level42;
    private GamePage level43;
    
    private GamePage overPage;
    private GamePage successPage;
    
    // Modified by Yimu Yang,Min Lu
    public WorldController() {
        level11 = new Level1R1();
        level12 = new Level1R2();
        level13 = new Level1R3();

        level31 = new Level3R1();
        level32 = new Level3R2();
        level33 = new Level3R3();
        
        level41 = new Level4R1();
        level42 = new Level4R2();
        level43 = new Level4R3();
        
        overPage = new OverPage();

        successPage = new SuccessPage();
        //pageChain.add(level11);
        //pageChain.add(level12);
        //pageChain.add(level13);
        

        pageChain.add(level31);
        pageChain.add(level32);
        pageChain.add(level33);
        
        pageChain.add(level41);
        pageChain.add(level42);
        pageChain.add(level43);

        pageChain.add(successPage);
        
        
        
        
    }
    
    /* static WorldController getWorldController() {
        if (worldCtrl == null) {
            worldCtrl = new WorldController();
        }
        return worldCtrl;
    }*/
    
    public List<GamePage> getPageChain() {
        return pageChain;
    }
    
    // Author: Yimu Yang
    public GamePage getOverPage() {
        return overPage;
    }
    
}
