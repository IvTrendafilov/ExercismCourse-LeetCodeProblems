import java.util.*;

public class Matrix {


    List<List<Integer>> values;
    Set<MatrixCoordinate> coordinates = new HashSet<>();

    Matrix(List<List<Integer>> values) {
        this.values = values;
        if (!values.isEmpty()) {
            for (int row = 0; row < values.size(); row++) {
                for (int column = 0; column < values.get(row).size(); column++) {
                    final int currentValue = values.get(row).get(column);
                    if (currentValue == getRowMax(row) && currentValue == getMinInColumn(column)) {
                        coordinates.add(new MatrixCoordinate(row + 1, column + 1));
                    }
                }
            }
        }
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return coordinates;
    }

    private int getMinInColumn(int column) {
        List<Integer> valuesInColumn = new ArrayList<>();
        for (int row = 0; row < values.size(); row++) {
            valuesInColumn.add(values.get(row).get(column));
        }
        return Collections.min(valuesInColumn);
    }

    private int getRowMax(int row) {
        return Collections.max(values.get(row));
    }


    private class MatrixCoordinate {
        int i,j;
        public MatrixCoordinate(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
