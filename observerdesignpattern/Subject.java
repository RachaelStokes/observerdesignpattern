package observerdesignpattern;

/**
 * interface subject that requires the classes that implement it to creates these methods
 * @author Rachael
 */
public interface Subject {
    /**
     * method that will add an observer to a list of observers
     * @param observer the Observer that is added to the list
     */
    public void registerObserver(Observer observer);

    /**
     * method that will remove an observer from a list of observers
     * @param observer the Observer that will be removed from the list
     */
    public void removeObserver(Observer observer);

    /**
     * method that will notify the observers by updating the par and strokes
     * @param strokes the int for the number of strokes the golfer has made
     * @param par the int for the par of the hole the golfer is on 
     */
    public void notifyObservers(int strokes, int par);
}
