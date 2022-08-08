public class ReverseString {
    static String reverse(String inputString) {
        String res = "";
        for (int i = inputString.length()-1; i >=0; i--){
            res = res + inputString.charAt(i);
        }
        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args){
        System.out.println(reverse("cool"));
    }

}
