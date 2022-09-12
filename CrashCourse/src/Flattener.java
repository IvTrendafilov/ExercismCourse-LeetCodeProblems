import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Flattener {

    public <T> List<T> flatten(List<T> list) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            if (element == null) continue;
            if (element instanceof List) result.addAll(flatten((List<T>) element));
            else result.add(element);
        }
        return result;
    }

    public static void main(String[] args){

        Flattener flattener = new Flattener();
        System.out.println(flattener.flatten(asList("0", 2, asList("two", '3'), "8", "one hundred", "negative two")));

    }
}
