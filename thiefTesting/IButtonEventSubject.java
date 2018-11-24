/**
 * Write a description of class IButtonEventSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Author: Yimu Yang
public interface IButtonEventSubject {
    public void attach(IButtonEventObserver obj);
    public void removeObserver(IButtonEventObserver obj);
    public void notifyObservers();    
}
