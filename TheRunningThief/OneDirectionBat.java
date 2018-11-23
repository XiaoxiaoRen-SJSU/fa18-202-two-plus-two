import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OneDirectionBat here.
 * 
 * @author (Wenyan He)
 * @version (version 1)
 */
public class OneDirectionBat extends Actor
{
    private int batSpeed;;
    
    public OneDirectionBat(int batSpeed) {
        this.batSpeed = batSpeed;
    }
    /**
     * Act - do whatever the OneDirectionBat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(batSpeed);
        
        if (isAtEdge()) {
            setLocation(20, getY());
            /*
            World world = getWorld();
            world.removeObject(this);
            return;
            */
        }

        // a flying bat can eat up a diamond in its path
        /*
        Actor diamond = getOneObjectAtOffset(0, 0, Diamond.class);
        if (diamond != null)
        {
            World world = getWorld();
            world.removeObject(diamond);
        }
        */
    }    
}
