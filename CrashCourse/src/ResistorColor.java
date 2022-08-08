import java.util.HashMap;

public class ResistorColor {
    /*
    Black: 0
Brown: 1
Red: 2
Orange: 3
Yellow: 4
Green: 5
Blue: 6
Violet: 7
Grey: 8
White: 9
     */
    private String[] COLOURS = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    private HashMap<String, Integer> COlours = new HashMap<>();

    int colorCode(String color) {
        COlours.put("black", 0);
        COlours.put("brown", 1);
        COlours.put("red", 2);
        COlours.put("orange", 3);
        COlours.put("yellow", 4);
        COlours.put("green", 5);
        COlours.put("blue", 6);
        COlours.put("violet", 7);
        COlours.put("grey", 8);
        COlours.put("white", 9);

        return COlours.get(color.toLowerCase());

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String[] colors() {
        return COLOURS;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        ResistorColor resistorColor = new ResistorColor();
        System.out.println(resistorColor.colorCode("Green"));
    }
}
