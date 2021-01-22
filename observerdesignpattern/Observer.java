package observerdesignpattern;

/**
 * interface Observer forces those that implement to have an update method
 * @author Rachael
 */
public interface Observer {

    /**
     * method that updates the current value of strokes and par for the golfer
     * @param strokes the int that keeps track of the strokes for a hole
     * @param par the int that keeps track of the par for a hole
     */
    public void update(int strokes, int par);
}