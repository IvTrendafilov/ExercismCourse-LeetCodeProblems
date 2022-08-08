public class MicroBlog {
    public static String truncate(String input) {
        int len = input.length();
        String res = "";
        if (len > 5){
            return input.substring(0,input.offsetByCodePoints(0,5));
        }else {
            return input;
        }
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    public static void main(String[] args){
        System.out.println(truncate("\uD83C\uDCCE\uD83C\uDCB8\uD83C\uDCC5\uD83C\uDCCB\uD83C\uDCCD\uD83C\uDCC1\uD83C\uDCCA"));
    }
}
