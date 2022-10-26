import java.util.ArrayList;

public class BowlingGame {
    private ArrayList<Integer> containsPins = new ArrayList<>();
    private int finalScore = 0;

    void roll(Integer pins) {
        if (pins < 0) {
            throw new IllegalStateException("Negative roll is invalid");
        } else if (pins > 10) {
            throw new IllegalStateException("Pin count exceeds pins on the lane");
        } else {
            this.containsPins.add(pins);
        }
        if (containsPins.size() > 20 && containsPins.get(20) != 10) {
            throw new IllegalStateException("Impossible");
        }
    }

    int score() {
        int frameCount = 0;
        for (int i = 0; i < containsPins.size() - 1; i++) {
            if (frameCount == 10) {
                break;
            } else {
                if ((containsPins.get(i) == 10) && i < containsPins.size() - 2) {
                    finalScore += containsPins.get(i) + containsPins.get(i + 1) + containsPins.get(i + 2);
                    frameCount++;

                } else if (i < containsPins.size() - 2 && (containsPins.get(i) + containsPins.get(i + 1) == 10)) {
                    finalScore += containsPins.get(i) + containsPins.get(i + 1) + containsPins.get(i + 2);
                    i++;
                    frameCount++;
                } else if ((containsPins.get(i) + containsPins.get(i + 1) < 10) && i < containsPins.size() - 1) {
                    finalScore += containsPins.get(i) + containsPins.get(i + 1);
                    i++;
                    frameCount++;
                } else if (i < containsPins.size() - 2 && (containsPins.get(i) + containsPins.get(i + 1) > 10)) {
                    throw new IllegalStateException("Pin count exceeds pins on the lane");
                }
            }
        }
        return finalScore;
    }

    public static void main(String[] args) {

        int[] rolls = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 5, 6 };


        BowlingGame bowlingGame = new BowlingGame();
        for (int pins : rolls) {
            bowlingGame.roll(pins);
        }

        System.out.println(bowlingGame.score());


    }
}
