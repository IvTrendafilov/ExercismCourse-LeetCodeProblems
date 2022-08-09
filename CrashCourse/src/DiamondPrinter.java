import javax.print.CancelablePrintJob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiamondPrinter {

    private final char dot = ' ';
    List<String> printToList(char a) {
        int num = a - 'A' +1;
        int size = (num-1)*2 + 1;
        String[] res = new String[size];

       for (int i = 0; i < (size/2)+1;i++){
           char b = (char) ('A' + i);

           int leftPos = size/2 - i;
           int rightPos = size - leftPos - 1;
           char[] buf = new char[size];
           Arrays.fill(buf,dot);
           buf[leftPos] = b;
           buf[rightPos] = b;
           String ress = new String(buf);
           res[i] = ress;
           res[size-i-1] = ress;
       }

        return Arrays.asList(res);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    public static void main(String[] args){

        DiamondPrinter diamondPrinterd = new DiamondPrinter();
        System.out.println(diamondPrinterd.printToList('C'));
    }
}
