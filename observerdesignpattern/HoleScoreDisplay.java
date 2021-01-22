package observerdesignpattern;
/**
 * class implements the Observer interface
 * @author Rachael
 */
public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        
    }

    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    private void displayCurrentScore() {
        int score;
        System.out.println("Current Hole Stats:");
        System.out.println("Par: " + par + "");
        System.out.println("Strokes: " + strokes + "");
        if (strokes > par) {
            score = strokes - par;
            System.out.println(score + "Over par");
        }
        else if (strokes == par) {
            System.out.println("Made par");
        }
        else {
            score = par - strokes;
            System.out.println(score + "Under par");
        }
    }
}
