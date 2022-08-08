import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResistorColorDuo {
    private String[] COLOURS = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    //private Integer[] numbers = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    int value(String[] colors) {
        List arrayList = Arrays.asList(COLOURS);
        int res = 0;

        if (colors.length < 1) {
            throw new IllegalArgumentException("Problem");

        } else if (colors.length == 1) {
            res += arrayList.indexOf(colors[0]);
        } else {
            res += arrayList.indexOf(colors[0]) * 10 + arrayList.indexOf(colors[1]);

        }

        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {

        ResistorColorDuo resistorColor = new ResistorColorDuo();
        System.out.println(resistorColor.value(new String[]{"yellow", "white", "yellow"}));
    }
}
