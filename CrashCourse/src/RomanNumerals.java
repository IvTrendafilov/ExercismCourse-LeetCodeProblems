public class RomanNumerals {

    private final String[] romanNumerals = {null, "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    private final Integer[] normalNumbers = {0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    private int number = 0;

    public RomanNumerals(int number){
        this.number = number;
    }
    public String converter() {
        StringBuilder res = new StringBuilder();
        for (int i = normalNumbers.length-1; number > 0; i--){
            while (number >= normalNumbers[i]){
                res.append(romanNumerals[i]);
                number -= normalNumbers[i];
            }
        }

        return res.toString();
    }


    public static void main(String[] args) {
        RomanNumerals romanNumerals1 = new RomanNumerals(499);
        System.out.println(romanNumerals1.converter());
        //System.out.println(499%10);

    }
}
