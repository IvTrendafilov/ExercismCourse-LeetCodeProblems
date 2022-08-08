import java.util.Arrays;

public class LuhnValidator {
    boolean isValid(String candidate) {
        boolean res = false;
        int sum = 0;
        String str = "";
        candidate = candidate.replace(" ", "");

        if (candidate.length() <= 1) {
            return false;
        }


        for (int i = candidate.length() - 1; i > 0; i = i - 2) {
            if (Character.isDigit(candidate.charAt(i))) {
                str += candidate.charAt(i);
                if (Character.isDigit(candidate.charAt(i-1))){
                    if (Character.getNumericValue(candidate.charAt(i - 1)) * 2 > 9 ) {
                        int z = Character.getNumericValue(candidate.charAt(i - 1));
                        str += z * 2 - 9;
                        //candidate.replace(candidate.charAt(i - 1), (char) (Character.getNumericValue(candidate.charAt(i - 1)) * 2 - 9));
                    } else {
                        int z = Character.getNumericValue(candidate.charAt(i - 1));
                        str += z * 2;
                        //candidate.replace(candidate.charAt(i - 1), (char) (Character.getNumericValue(candidate.charAt(i - 1)) * 2));
                    }
                }else {
                    return false;
                }

            } else {
                return false;
            }
        }
        //System.out.println(str);
        for (int j = 0; j < str.length(); j++){
            sum += Character.getNumericValue(str.charAt(j));
        }
        //System.out.println(sum);
        return sum%10 == 0;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        LuhnValidator luhnValidator = new LuhnValidator();
        System.out.println(luhnValidator.isValid(":9"));
    }
}
