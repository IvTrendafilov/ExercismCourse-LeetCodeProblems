import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    static String word;
    public Anagram(String word){
        this.word = word;
    }
    public static ArrayList<String> match(List<String> words){
        ArrayList<String> res = new ArrayList<>();
        char[] firstWord = word.toLowerCase().toCharArray();
        Arrays.sort(firstWord);
        for (String oneWord: words){
            char[] secondWord = oneWord.toLowerCase().toCharArray();
            if (oneWord.length() == word.length()){
                Arrays.sort(secondWord);
                if (Arrays.equals(firstWord,secondWord) && !word.toLowerCase().equals(oneWord.toLowerCase())){
                    res.add(oneWord);
                }

            }
        }
        return res;
    }

    public static void main (String[] args){

        Anagram anagram = new Anagram("LISTEN");
        System.out.println(match(Arrays.asList("Listen", "Silent", "LISTEN")));

    }

}
