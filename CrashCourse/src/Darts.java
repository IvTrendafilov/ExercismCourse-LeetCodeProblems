import java.util.Map;

public class Darts {

    private static double x = 0;
    private static double y = 0;


    Darts(double x, double y) {

        this.x = x;
        this.y = y;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    static int score() {
        int score = 0;
        double radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (radius <= 1) {
            score = 10;
        } else if (radius <= 5) {
            score =  5;

        } else if (radius <= 10) {
            score = 1;
        }
        return score;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {
        Darts darrt = new Darts(0.5, -0.5);
        System.out.println(score());
    }
}
