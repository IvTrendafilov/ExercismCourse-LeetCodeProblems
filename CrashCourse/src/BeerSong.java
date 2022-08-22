public class BeerSong {

    public static String sing(int i, int j){
        String res = "";
        int k = i-1;
        while (j > 0){
            if(i== 0){
                res += "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
            }else {
                if (k == 0) {
                    res += i + " bottle of beer on the wall, " + i + " bottle of beer.\n" +
                            "Take it down and pass it around, no more bottles of beer on the wall.\n";
                } else {
                    if (k == 1){
                        res += i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                                "Take one down and pass it around, " + k + " bottle of beer on the wall.\n";
                    }else{
                        res += i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                                "Take one down and pass it around, " + k + " bottles of beer on the wall.\n";
                    }
                }
            }
            i--;
            k--;
            j--;
        }
        return res;
    }
    public static String SingEntireSong() {
        int i = 100;
        int j = i - 1;
        String res = "";
        while (i >= 0) {

            if (i == 0) {
                res += "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.\n";
            } else {
                if (j == 0) {
                    res += i + " bottle of beer on the wall, " + i + " bottle of beer.\n" +
                            "Take it down and pass it around, no more bottles of beer on the wall.\n";
                } else {
                    if (j == 1){
                        res += i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                                "Take one down and pass it around, " + j + " bottle of beer on the wall.\n";
                    }else{
                        res += i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
                                "Take one down and pass it around, " + j + " bottles of beer on the wall.\n";
                    }

                }


            }
            i--;
            j--;
        }
        return res;
    }

    public static void main(String[] args) {
        BeerSong beerSong = new BeerSong();
        //System.out.println(beerSong.SingEntireSong());
        System.out.println(beerSong.sing(3,3));
    }
}
