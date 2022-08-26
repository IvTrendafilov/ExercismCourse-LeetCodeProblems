import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NucleotideCounter {

    String counter(String word) {
        Map<Character, Integer> res = new HashMap<>();
        if (Pattern.compile("[^ACGT]+").matcher(word).find()) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < word.length(); i++) {
            adder(res, word.charAt(i));
        }
        return res.toString();
    }

    void adder(Map<Character, Integer> mb, Character ch) {
        if (!mb.containsKey(ch)) mb.put(ch, 0);
        int count = mb.get(ch);
        mb.put(ch, count + 1);
    }


    public static void main(String[] args) {
        NucleotideCounter nucleotideCounter = new NucleotideCounter();
        System.out.println(nucleotideCounter.counter("GATTACA"));

    }
}
