public class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        int res = 0;
        stringToVerify = stringToVerify.replace("-", "");
        if (stringToVerify.length() == 0 || stringToVerify.length() !=10){
            return false;
        }
        String test = stringToVerify.substring(0,9);
        for (int j = 0; j < test.length(); j++){
            if (Character.isLetter(test.charAt(j))){
                return false;
            }
        }
        //System.out.println(stringToVerify);
        for (int i = 0; i < stringToVerify.length(); i++) {
            if (stringToVerify.charAt(i) == 'X'){
                res += 10 * (stringToVerify.length() - i);
            }
            else if(Character.isLetter(stringToVerify.charAt(i))){
                return false;
            }
            else{
                res += (Character.getNumericValue(stringToVerify.charAt(i)) * (stringToVerify.length() - i));
            }
            //System.out.println(stringToVerify.charAt(i) + " " +  (stringToVerify.length()-i));
            System.out.println(Character.getNumericValue(stringToVerify.charAt(i)) * (stringToVerify.length()-i)+ "=" + stringToVerify.charAt(i) + "*" +  (stringToVerify.length()-i) );
            System.out.println(res);
            //System.out.println(stringToVerify.length()-i);
        }
        System.out.println(res);

        return res % 11 == 0;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        IsbnVerifier isbnVerifier = new IsbnVerifier();
        System.out.println(isbnVerifier.isValid("3-598-21515-X"));
    }

}
