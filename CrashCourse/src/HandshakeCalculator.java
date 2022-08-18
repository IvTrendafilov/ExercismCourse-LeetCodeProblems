

import sun.misc.Signal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HandshakeCalculator {
    private List<String> res = new ArrayList<String>();

    List<String> calculateHandshake(int number) {
        String ress = "";
        String revRes = "";
        int intRevRes = 0;
        while (number > 0) {
           /* if (number == 1){
                res+= number;
            }*/
            ress += number % 2;
            number = number / 2;
        }
        for (int i = ress.length() - 1; i >= 0; i--) {
            revRes += ress.charAt(i);
        }
        System.out.println(revRes);
        if (ress.charAt(0) == '1'){
            res.add("WINK");
        }
        if ( ress.length() > 1 && ress.charAt(1) == '1'){
            res.add("Double Blink");
        }
        if (ress.length()  > 2 && ress.charAt(2) == '1'){
            res.add("close your eyes");
        }
        if ( ress.length()  > 3 && ress.charAt(3) == '1'){
            res.add("jump");
        }
        if (ress.length()  > 4 && ress.charAt(4) == '1') {
            Collections.reverse(res);
        }

        return res;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args) {
        HandshakeCalculator handshakeCalculator = new HandshakeCalculator();
        System.out.println(handshakeCalculator.calculateHandshake(3));
    }


}
