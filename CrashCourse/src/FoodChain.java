public class FoodChain {

    private static final String[][] STRINGS = new String[][]{
            {"fly", "", ""},
            {"spider", "It wriggled and jiggled and tickled inside her.\n",
                    " that wriggled and jiggled and tickled inside her"},
            {"bird", "How absurd to swallow a bird!\n", ""},
            {"cat", "Imagine that, to swallow a cat!\n", ""},
            {"dog", "What a hog, to swallow a dog!\n", ""},
            {"goat", "Just opened her throat and swallowed a goat!\n", ""},
            {"cow", "I don't know how she swallowed a cow!\n", ""}
    };
    public String verse(int verse) {
        StringBuilder sb = new StringBuilder("I know an old lady who swallowed a ");
        if (verse == 8) {
            sb.append("horse.\nShe's dead, of course!");
            return sb.toString();
        }
        for (int i = verse - 1; i > 0; i--) {
            sb.append(String.format("%1$s%3$s.\n%2$sShe swallowed the %1$s to catch the ",
                    STRINGS[i][0],
                    i == verse - 1 ? STRINGS[i][1] : "",
                    i != verse - 1 ? STRINGS[i][2] : ""));
        }
        sb.append(String.format("%1s.\nI don't know why she swallowed the %1$s. Perhaps she'll die.", STRINGS[0][0]));
        return sb.toString();
    }
    public String verses(int startVerse, int endVerse) {
        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i < endVerse; i++) {
            sb.append(String.format("%s\n\n", verse(i)));
        }
        sb.append(verse(endVerse));
        return sb.toString();
    }

    public static void main(String[] args){


    }

}
