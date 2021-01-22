package observerdesignpattern;

/**
 * interface Observer forces those that implement to have an update method
 * @author Rachael
 */
public interface Observer {
    public void update(int strokes, int par);
}