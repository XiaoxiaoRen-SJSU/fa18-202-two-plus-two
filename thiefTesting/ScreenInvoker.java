/**
 * Write a description of class ScreenInvorker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenInvoker implements IScreenInvoker 
{
    IScreenCommand command;
    
    public void setCommand(IScreenCommand c) {
        command = c;
    }
    
    public void invoke() {
        command.execute();
    }
}
