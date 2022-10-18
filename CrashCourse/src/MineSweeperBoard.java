import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MineSweeperBoard {


    private List<String> inputBoard;


    MineSweeperBoard(List<String> inputBoard) {
        this.inputBoard = inputBoard;
    }

/*    List<String> withNumbers(){
        int height = inputString.size();
    }*/

    void printRes() {
/*        int height = inputBoard.size();
        int width = inputBoard.get(0).length();
        int[][] board = new int[height][width];*/

        List<String> copyInputBoard = new ArrayList<String>(inputBoard);
        int height = inputBoard.size();
        int width = (height == 0) ? 0 : inputBoard.get(0).length();
        String getRow;

        for (int row = 0; row < height; row++) {
            getRow = copyInputBoard.get(row);
            for (int column = 0; column < width; column++) {
                int count = 0;
                if (getRow.charAt(column) == '*') {
                    continue;
                }
                if (row == 0) {
                    if (column == 0) {
                        if (getRow.charAt(column + 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, getRow.substring(0, column) + count + getRow.substring(column + 1));
                        }

                    } else if (column == width - 1) {
                        if (getRow.charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, copyInputBoard.get(row).substring(0, column) + count + copyInputBoard.get(row).substring(column + 1));
                        }
                    } else {
                        if (getRow.charAt(column + 1) == '*') {
                            count++;
                        }
                        if (getRow.charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, copyInputBoard.get(row).substring(0, column) + count + copyInputBoard.get(row).substring(column + 1));
                        }
                    }
                } else if (row == height - 1) {

                    if (column == 0) {
                        if (getRow.charAt(column + 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, getRow.substring(0, column) + count + getRow.substring(column + 1));
                        }

                    } else if (column == width - 1) {
                        if (getRow.charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, copyInputBoard.get(row).substring(0, column) + count + copyInputBoard.get(row).substring(column + 1));
                        }
                    } else {
                        if (getRow.charAt(column + 1) == '*') {
                            count++;
                        }
                        if (getRow.charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, copyInputBoard.get(row).substring(0, column) + count + copyInputBoard.get(row).substring(column + 1));
                        }
                    }
                } else {
                    if (column == 0) {
                        if (getRow.charAt(column + 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, getRow.substring(0, column) + count + getRow.substring(column + 1));
                        }

                    } else if (column == width - 1) {
                        if (getRow.charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, copyInputBoard.get(row).substring(0, column) + count + copyInputBoard.get(row).substring(column + 1));
                        }
                    } else {
                        if (getRow.charAt(column + 1) == '*') {
                            count++;
                        }
                        if (getRow.charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row - 1).charAt(column + 1) == '*') {
                            count++;
                        }

                        if (copyInputBoard.get(row + 1).charAt(column) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column - 1) == '*') {
                            count++;
                        }
                        if (copyInputBoard.get(row + 1).charAt(column + 1) == '*') {
                            count++;
                        }
                        if (count > 0) {
                            copyInputBoard.set(row, copyInputBoard.get(row).substring(0, column) + count + copyInputBoard.get(row).substring(column + 1));
                        }
                    }
                }
            }
        }
        System.out.println(copyInputBoard);
    }

    public static void main(String[] args) {

        MineSweeperBoard mineSweeperBoard = new MineSweeperBoard(Arrays.asList("·*·*·", "··*··", "··*··", "·····"));
        mineSweeperBoard.printRes();
    }
}
