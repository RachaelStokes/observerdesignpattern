package observerdesignpattern;
/**
 * 
 * @author Rachael
 */
public class RoundScoreDisplay {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        displayRoundScore();
    }

    public void update(int strokes, int par) {
        this.strokesTotal += strokes;
        this.parTotal += par;
    }

    private void displayRoundScore() {
        //need to finish
    }
}
