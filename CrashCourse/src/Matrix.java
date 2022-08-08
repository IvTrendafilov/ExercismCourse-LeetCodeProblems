import java.util.HashMap;
import java.util.stream.IntStream;

public class Matrix {
    private int[][] matrix;

    Matrix(String matrixAsString) {
        String[] res = matrixAsString.split("\n");
        matrix = new int[res.length][res[0].split(" ").length];
        for (int i = 0; i < res.length; i++) {
            String[] line = res[i].split(" ");
            for (int j = 0; j < line.length; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    //  short method to get column
    int[] getColumn(int columnNumber) {
        int res[] = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            res[i] = matrix[i][columnNumber-1];
        }
        //System.out.println(res[);
        //return IntStream.range(0, matrix.length).map(i -> matrix[i][columnNumber - 1]).toArray();
        return res;

    }

    public static void main(String[] args) {
        String matrixAsString = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        Matrix matrix = new Matrix(matrixAsString);
        System.out.println(matrix.getRow(1));
        System.out.println(matrix.getColumn(2));
    }
}
