package observerdesignpattern;

/**
 * class to display the current hole stats and implements the Observer interface
 * @author Rachael
 */
public class HoleScoreDisplay implements Observer{
    //instance variables
    private Subject golfer; //creates new subject golfer 
    private int strokes; //strokes of the hole
    private int par; //par of the hole

    /**
     * sets the golfer and calls register observer to add the golfer to the list of observers
     * @param golfer
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * updates the strokes and the par and calls the displayCurrentScore method
     * @param strokes int that stores the strokes taken that hole
     * @param par int that stores the par of the hole
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * method prints out the current hole stats and how many above or below par the golf is or if they made par
     */
    private void displayCurrentScore() {
        int score; //how much above or below par the golfer is
        System.out.println(" ");
        System.out.println("Current Hole Stats:");
        System.out.println("Par: " + par + "");
        System.out.println("Strokes: " + strokes + "");
        if (strokes > par) {
            score = strokes - par;
            System.out.println(score + " Over par");
        }
        else if (strokes == par) {
            System.out.println("Made par");
        }
        else {
            score = par - strokes;
            System.out.println(score + " Under par");
        }
    }
}
