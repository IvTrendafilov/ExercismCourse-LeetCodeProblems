import java.util.ArrayList;
import java.util.List;

public class Series {

    String number = "";

    public Series(String number) {
        this.number = number;
    }


    public List<String> slices(int lenDigits) {
        List<String> res = new ArrayList();
        String adder = "";
        if (number.length() < lenDigits){
            throw new IllegalArgumentException("Slice size is too big.");
        }else if(lenDigits <1){
            throw new IllegalArgumentException("Slice size is too small.");
        }
        for (int i = 0; i < number.length()-lenDigits+1; i++) {
            adder ="";
            for (int j = i; j < lenDigits+i; j++) {
                adder += number.charAt(j);
            }
            res.add(adder);
        }

        return res;
    }

    public static void main(String[] args) {
        Series series = new Series("49142");
        System.out.println(series.slices(1));


    }
}
