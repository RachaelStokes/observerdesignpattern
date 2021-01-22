package observerdesignpattern;
import java.util.*;

/**
 * 
 * @author Rachael
 */
public class Golfer implements Subject{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;

    public Golfer(String name) {
        this.name = name;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {

    }

    public void notifyObservers(int strokes, int par) {

    }

    public void enterScore(int strokes, int par) {

    }

    public String getName() {
        return this.name;
    }

}
