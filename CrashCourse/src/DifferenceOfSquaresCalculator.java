import java.time.LocalDateTime;
import java.time.Month;

public class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int res = 0;
        for (int i = 0; i <= input; i++){
            res += i;
        }

        return res*res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeSumOfSquaresTo(int input) {
        int res = 0;
        for (int i = 0; i <= input; i++){
            res += i*i;
        }

        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int computeDifferenceOfSquares(int input) {
        int res = 0;
        res = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {
        DifferenceOfSquaresCalculator calculator = new DifferenceOfSquaresCalculator();
        System.out.println(calculator.computeDifferenceOfSquares(5));

    }
}
