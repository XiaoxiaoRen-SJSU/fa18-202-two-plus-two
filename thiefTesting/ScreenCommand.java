/**
 * Write a description of class ScreenCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenCommand implements IScreenCommand 
{
    IScreenReceiver receiver;
    
    public void setReceiver(IScreenReceiver r) {
        receiver = r;
    }
    
    public void execute() {
        receiver.doAction();
    }
}
