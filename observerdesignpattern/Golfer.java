package observerdesignpattern;
import java.util.*;

/**
 * golfer class implements the subject interface, represents a golfer with a name
 * @author Rachael
 */
public class Golfer implements Subject{
    
    //instance variables
    private ArrayList<Observer> observers; //arraylist of observers
    private String name; //golfer's name

    /**
     * sets the name of the golfer and instantiates the observers list 
     * @param name the string name of the golfer
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * method adds the current observer to the list of observers
     * @param observer the observer that is added to the arraylist of observers
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * method removes the current observer from the list of observers
     * @param observer the observer that is removed from the list
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * method that notifies and updates the stroke and par of each observer in the list 
     * @param strokes the in num of strokes that is used to call in update
     * @param par the int num of the par of the hole that is used to call in update
     */
    public void notifyObservers(int strokes, int par) {
        for(Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * calls the method notify observers with the current strokes and par
     * @param strokes the current strokes the golfer made
     * @param par the current par of the hole
     */
    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }

    /**
     * method that returns the name of the golfer
     * @return the string name of the golfer
     */
    public String getName() {
        return this.name;
    }

}
