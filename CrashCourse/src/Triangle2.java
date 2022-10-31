import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Triangle2 {

    private List<Double> valuesOfSides = new ArrayList<Double>();

    Triangle2(double side1, double side2, double side3) {

        valuesOfSides.add(side1);
        valuesOfSides.add(side2);
        valuesOfSides.add(side3);

    }

    boolean isEquilateral() {
        if (countDistinct(valuesOfSides) == 1){
            return true;
        }else {
            return false;
        }
    }

    boolean isIsosceles() {
        if (countDistinct(valuesOfSides) <= 2){
            return true;
        }else {
            return false;
        }
    }

    boolean isScalene() {
        if (countDistinct(valuesOfSides) == 3){
            return true;
        }else {
            return false;
        }
    }

    double countDistinct(List<Double> sides){
        return valuesOfSides.stream().distinct().count();
    }

    public static void main(String[] args){

        List<Double> test = new ArrayList<>();
        test.add(3.1);
        test.add(3.1);
        test.add(3.1);
        System.out.println(test.stream().distinct().count());
    }

}
