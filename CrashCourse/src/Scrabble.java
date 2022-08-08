import java.util.HashMap;

public class Scrabble {

    private HashMap<Character[], Integer> points = new HashMap<>();
    String word = "";

    Scrabble(String word) {
        this.word = word;

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getScore() {
        int score = 0;

        if (word.length() == 0) {
            score = 0;
        }
        points.put(new Character[]{'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'}, 1);
        points.put(new Character[]{'D', 'G'}, 2);
        points.put(new Character[]{'B', 'C', 'M', 'P' },3);
        points.put(new Character[]{'F', 'H', 'V', 'W', 'Y' },4);
        points.put( new Character[]{'K'}, 5);
        points.put(new Character[]{'J', 'X' }, 8);
        points.put(new Character[]{'Q', 'Z'}, 10);
        for (Character[] s : points.keySet()) {
            for (char z: s){
                for (int i = 0; i < word.length(); i++){
                    if (z == word.toUpperCase().charAt(i)){
                        score += points.get(s);
                    }
                }

            }
        }
        //System.out.println(points.containsValue('Z"));
        return score;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        Scrabble scrabble = new Scrabble("cabbage");
        System.out.println(scrabble.getScore());
    }

}
