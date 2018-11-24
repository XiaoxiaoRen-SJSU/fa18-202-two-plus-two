/**
 * Write a description of class IScreenCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface IScreenCommand  
{
    void setReceiver(IScreenReceiver r);
    void execute();
}
