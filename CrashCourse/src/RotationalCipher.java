public class RotationalCipher {
    private int shiftKey = 0;
    Character[] lowerCaseLett = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    Character[] upperCaseLett = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
        if (shiftKey < 0) {
            throw new IllegalArgumentException("Error");
        }
        //throw new UnsupportedOperationException('Delete this statement and write your own implementation.');
    }

    String rotate(String data) {
        String res = "";
        int n = 0;
        int z = 0;
        for (int i = 0; i < data.length(); i++) {
            if (Character.isLetter(data.charAt(i))) {
                if (Character.isLowerCase(data.charAt(i))) {
                    for (int j = 0; j < lowerCaseLett.length; j++) {
                        if (lowerCaseLett[j] == data.charAt(i)) {
                            n = j + shiftKey;
                            if (n > lowerCaseLett.length - 1) {
                                z = n - lowerCaseLett.length;
                                res += lowerCaseLett[z];
                                break;
                            } else {
                                res += lowerCaseLett[n];
                                break;
                            }
                        }
                    }
                } else if (Character.isUpperCase(data.charAt(i))) {
                    for (int j = 0; j < upperCaseLett.length; j++) {
                        if (upperCaseLett[j] == data.charAt(i)) {
                            n = j + shiftKey;
                            if (n > upperCaseLett.length - 1) {
                                z = n - upperCaseLett.length;
                                res += upperCaseLett[z];
                                break;
                            } else {
                                res += upperCaseLett[n];
                                break;
                            }
                        }
                    }
                }
            }else{
                res += data.charAt(i);
            }
        }
        return res;
        //throw new UnsupportedOperationException('Delete this statement and write your own implementation.');
    }

    public static void main(String[] args) {
        RotationalCipher rotationalCipher = new RotationalCipher(13);
        System.out.println(rotationalCipher.rotate("Gur dhvpx oebja sbk whzcf bire gur ynml qbt."));
    }
}
