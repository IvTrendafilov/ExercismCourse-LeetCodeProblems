import java.util.stream.IntStream;

public class Hamming {
    private String leftStrand = "";
    private String rightStrand = "";

    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()) {
            if(leftStrand.length() == 0) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }
            if(rightStrand.length() == 0) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public int getHammingDistance() {
        int res = 0;
        res = (int) IntStream.range(0, leftStrand.length()).filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i)).count();
        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {
        Hamming hamming = new Hamming("GG", "G");
        System.out.println(hamming.getHammingDistance());
    }
}
