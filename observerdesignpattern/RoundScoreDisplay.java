package observerdesignpattern;
/**
 * class to display the round hole stats and implements the Observer interface
 * @author Rachael
 */
public class RoundScoreDisplay implements Observer{
    //instance variables
    private Subject golfer; //new subject golfer
    private int strokesTotal; //int to keep track of total strokes
    private int parTotal; //int to keep track of total par

    /**
     * sets the golfer and calls register observer to add the golfer to the list of observers
     * @param golfer the subject that is being registered as an observer
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * adds the strokes and the par to the totals and calls the displayRoundScore method
     * @param strokes int used to add to the total strokes
     * @param par int used to add to the total par
     */
    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

    /**
     * method prints out the round stats and how many above or below par the golf is or if they made par
     */
    private void displayRoundScore() {
        int score;
        System.out.println(" ");
        System.out.println("Round Stats:");
        System.out.println("Par: " + parTotal + "");
        System.out.println("Strokes: " + strokesTotal + "");
        if (strokesTotal > parTotal) {
            score = strokesTotal - parTotal;
            System.out.println(score + " Over par");
        }
        else if (strokesTotal == parTotal) {
            System.out.println("Making par");
        }
        else {
            score = parTotal - strokesTotal;
            System.out.println(score + " Under par");
        }
    }
    
}
