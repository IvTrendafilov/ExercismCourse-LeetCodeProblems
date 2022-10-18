import java.util.ArrayList;
import java.util.List;

public class Knapsack {



    public int maximumValue(int bagCapacity, final List<Item> items) {
        return maximumValueRec(items, items.size(), bagCapacity);
    }

    private int maximumValueRec(final List<Item> items, int n, int W) {
        if (n <= 0) {
            return 0;
        } else if (items.get(n - 1).getWeight() > W) {
            return maximumValueRec(items, n - 1, W);
        } else {
            return Math.max(
                    maximumValueRec(items, n - 1, W),
                    items.get(n - 1).getValue() + maximumValueRec(items, n - 1, W - items.get(n - 1).getWeight()));
        }
    }

    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        List<Item> items = List.of(
                new Item(70, 135),
                new Item(73, 139),
                new Item(77, 149),
                new Item(80, 150),
                new Item(82, 156),
                new Item(87, 163),
                new Item(90, 173),
                new Item(94, 184),
                new Item(98, 192),
                new Item(106, 201),
                new Item(110, 210),
                new Item(113, 214),
                new Item(115, 221),
                new Item(118, 229),
                new Item(120, 240)
        );

        System.out.println(knapsack.maximumValue(750,items));
    }


}

class Item {

    private int weight = 0;
    private int value = 0;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }


    public int getValue() {
        return value;
    }


}