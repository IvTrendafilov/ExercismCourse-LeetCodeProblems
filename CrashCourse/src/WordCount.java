import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> addWords(String words) {
        Map<String, Integer> res = new HashMap<>();

        for (String word : words.toLowerCase().split("\\s+|,")) {
            word = word.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");
            if (word.length() == 0) {
                continue;
            }

                adder(res,word);

        }

        return res;
    }

    private void adder(Map<String, Integer> res1, String word){
        if (!res1.containsKey(word)) res1.put(word, 0);
        int crnt = res1.get(word);

        res1.put(word,crnt+1);
    }

    public static void main(String[] args) {

        WordCount wordCount = new WordCount();
        System.out.println(wordCount.addWords("That's the password: 'PASSWORD 123'!, cried the Special Agent.\nSo I fled."));
    }
}
