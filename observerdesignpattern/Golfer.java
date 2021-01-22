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

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int strokes, int par) {
        for(Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
    }

    public String getName() {
        return this.name;
    }

}
