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
