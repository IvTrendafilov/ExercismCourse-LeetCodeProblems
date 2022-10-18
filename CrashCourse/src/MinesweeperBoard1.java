import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class MinesweeperBoard1 {

    private static final char MINE = '*';
    private static final char ADD_NUMBER = ' ';
    private final List<String> board;
    private final int rows;
    private final int cols; // Assumption:  All rows have the same number of columns (rectangular board)

    public MinesweeperBoard1(List<String> inputBoard) {
        requireNonNull(inputBoard);
        board = new ArrayList<>(inputBoard);  // Make a copy using a specific list type to ensure available methods
        rows = inputBoard.size();
        if (rows > 0) {
            cols = inputBoard.get(0).length();
        } else {
            cols = 0;
        }
        // Loop through each position on the board and if it is a space, then look at adjacent positions for mines
        String row;
        int count;
        for (int i = 0; i < rows; i++) {
            row = board.get(i);
            for (int j = 0; j < cols; j++) {
                if (row.charAt(j) == ADD_NUMBER) {
                    // Count adjacent mines, taking advantage of lazy evaluation of compound boolean expressions
                    count = 0;
                    if (i > 0) {
                        for (int k = -1; k <= 1; k++) {
                            if (j + k >= 0 && j + k < cols && board.get(i - 1).charAt(j + k) == MINE) {
                                count++;
                            }
                        }
                    }
                    if (i < rows - 1) {
                        for (int l = -1; l <= 1; l++) {
                            if (j + l >= 0 && j + l < cols && board.get(i + 1).charAt(j + l) == MINE) {
                                count++;
                            }
                        }
                    }
                    if (j > 0 && row.charAt(j - 1) == MINE) {
                        count++;
                    }
                    if (j < cols - 1 && row.charAt(j + 1) == MINE) {
                        count++;
                    }
                    if (count > 0) {
                        row = board.get(i);
                        board.set(i, row.substring(0, j) + count + row.substring(j + 1));
                    }
                }
            }
        }
    }

    public List<String> withNumbers() {
        return board;
    }
}
