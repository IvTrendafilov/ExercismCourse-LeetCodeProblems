import java.util.Arrays;
import java.util.HashSet;

public class IsogramChecker {
    boolean isIsogram(String phrase) {
        phrase = phrase.replace("-", "").replace(" ", "").toLowerCase();
        return phrase.chars().distinct().count() == phrase.length();
    }
    //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    public static void main(String[] args) {

        IsogramChecker iso = new IsogramChecker();
        System.out.println(iso.isIsogram("six-year-old"));
    }
}
