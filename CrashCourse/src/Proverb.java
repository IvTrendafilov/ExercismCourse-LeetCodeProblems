public class Proverb {

    private String[] words = {};

    Proverb(String[] words) {

        this.words = words;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String recite() {
        if (words.length == 0){
            return "";
        }
        String res = "";
        for (int i = 0; i < words.length - 1; i++) {
            res += "For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n";

        }
        res += "And all for the want of a " + words[0] + ".";

        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        Proverb pro = new Proverb(new String[]{"nail", "shoe", "horse"});
        System.out.println(pro.recite());
    }
}
