import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Yacht {
    /*private final String[] category = {"Ones", "Twos", "Threes", "Fours", "Fives", "Sixes", "Full House", "Four of a Kind", "Little Straight",
            "Big Straight", "Choice", "Yacht"};*/
    private enum YachtCategory {
        Ones, Twos, Threes, Fours, Fives, Sixes, FullHouse, FourofaKind, LittleStraight,
        BigStraight, Choice, Yacht
    }

    private final int[] dice;
    private final YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        Arrays.sort(dice);
        this.dice = dice;
        this.yachtCategory = yachtCategory;

    }

    int score() {
        return switch (this.yachtCategory) {
            case Ones -> calculateScoreOfNumbers(1);
            case Twos -> calculateScoreOfNumbers(2);
            case Threes -> calculateScoreOfNumbers(3);
            case Fours -> calculateScoreOfNumbers(4);
            case Fives -> calculateScoreOfNumbers(5);
            case Sixes -> calculateScoreOfNumbers(6);
            case FullHouse -> calculateFullHouse();
            case FourofaKind -> calculateFourOfAkind();
            case LittleStraight -> calculateLittleStraigh();
            case BigStraight -> calculateBigStraigh();
            case Choice -> calculateChoice();
            case Yacht -> calculateYacht();
        };
    }

    private int calculateScoreOfNumbers(int number) {
        return Arrays.stream(dice).filter(side -> side == number).sum();
    }

    private int calculateFullHouse() {
        if (countNumberOfDistinct() == 3) {
            return Arrays.stream(dice).sum();
        } else {
            return 0;
        }
    }

    private int calculateFourOfAkind() {
        if (countNumberOfDistinct() >= 4) {
            if (dice[0] != dice[1]){
                return Arrays.stream(dice).sum() - dice[0];
            }else {
                return Arrays.stream(dice).sum() - dice[dice.length-1];
            }
        } else {
            return 0;
        }
    }

    private int calculateLittleStraigh() {
        if (countNumberOfDistinct() == 1 && Arrays.stream(dice).sum() == 15) {
            return 30;
        } else {
            return 0;
        }
    }

    private int calculateBigStraigh() {
        if (countNumberOfDistinct() == 1 && Arrays.stream(dice).sum() == 20) {
            return 30;
        } else {
            return 0;
        }
    }

    private int calculateChoice() {
        return Arrays.stream(dice).sum();
    }

    private int calculateYacht() {
        if (countNumberOfDistinct() == 5) {
            return 50;
        } else {
            return 0;
        }
    }

    private int countNumberOfDistinct() {
        int[] nums = new int[7];
        //Count number of repeating elemts withouth using hashMap or stream
        for (int n : this.dice) {
            nums[n]++;
        }
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }


    public static void main(String[] args) {
        int[] test = new int[]{3, 3, 3, 3, 3};
        /*Arrays.sort(test);
        int[] nums = new int[7];
        //Count number of repeating elemts withouth using hashMap or stream
        for (int n : test){
            nums[n]++;
        }
        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);
        //System.out.println(Arrays.stream(test));*/
        Yacht yacht = new Yacht(test, YachtCategory.FourofaKind);
        System.out.println(yacht.score());
    }
}
