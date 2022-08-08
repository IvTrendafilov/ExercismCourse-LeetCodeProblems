public class LargestSeriesProductCalculator {

    private String input = "";

    LargestSeriesProductCalculator(String inputNumber) {
        this.input = inputNumber;
        for (int i = 0; i < inputNumber.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }
        //throw new UnsupportedOperationException ("Delete this statement and write your own implementation.");
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        long maxRes = Long.MIN_VALUE;
        long secondRes = 0;
        if (input.length() == 0 && numberOfDigits == 0) {
            return 1;
        }
        if (input.length() < numberOfDigits) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        for (int i = 0; i < input.length() - numberOfDigits + 1; i++) {

            long res = 1;
            int j = i;
            int rotate = numberOfDigits + i;
            while (j < rotate) {
                int z = Character.getNumericValue(input.charAt(j));
                res *= z;
                j++;
            }
            secondRes = res;
            if (maxRes < secondRes) {
                maxRes = secondRes;
            }

        }
        return maxRes;
        //throw new UnsupportedOperationException ("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        LargestSeriesProductCalculator largestSeriesProductCalculator = new LargestSeriesProductCalculator("1234a5");
        System.out.println(largestSeriesProductCalculator.calculateLargestProductForSeriesLength(2));
    }
}
