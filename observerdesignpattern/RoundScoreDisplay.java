package observerdesignpattern;
/**
 * 
 * @author Rachael
 */
public class RoundScoreDisplay implements Observer{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
        displayRoundScore();
    }

    private void displayRoundScore() {
        //need to finish
    }
}
