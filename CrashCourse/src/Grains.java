import java.math.BigInteger;

public class Grains {

    private int square = 0;

    BigInteger grainsOnSquare(final int square) {
        this.square = square;
        BigInteger result = new BigInteger("2");
        if (square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        //result  = BigInteger.valueOf((long) Math.pow(2 , (square-1)));

        return result.pow(square-1);

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    BigInteger grainsOnBoard() {
        BigInteger res = new BigInteger("0");
        for (int i = 1; i <= 64; i++){
            res = res.add(grainsOnSquare(i));
        }
        return res;
    }

    public static void main(String[] args){

        Grains grains = new Grains();
        System.out.println(grains.grainsOnSquare(64));
        System.out.println(grains.grainsOnBoard());
    }
}
