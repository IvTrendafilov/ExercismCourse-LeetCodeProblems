public class RaindropConverter {
    static String convert(int number) {
        String res = "";
        if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0){
            return String.valueOf(number);
        }
        while (number != 1) {
            if (number % 3 == 0) {
                if (!res.contains("Pling")) {
                    res = res + "Pling";
                    number = number / 3;

                } else {
                    number = number / 3;
                    continue;
                }

            }
            if (number % 5 == 0) {
                if (!res.contains("Plang")) {
                    res = res + "Plang";
                    number = number / 5;

                } else {
                    number = number / 5;
                    continue;
                }
            }
            if (number % 7 == 0) {
                if (!res.contains("Plong")) {
                    res = res + "Pling";
                    number = number / 7;

                } else {
                    number = number / 7;
                    continue;
                }
            }
            if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
                break;
            }

        }
        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {
        System.out.println(convert(75));
    }
}
