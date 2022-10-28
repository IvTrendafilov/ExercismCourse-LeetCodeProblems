public class Connect {
    private String[] board;

    public Connect(String[] board) {
        this.board = board;
    }

    public Winner computeWinner(){
        return computeWinner(this.board);
    }

    public Winner computeWinner(String[] board) {

        return Winner.NONE;
    }
}

enum Winner {
    PLAYER_O,
    PLAYER_X,
    NONE
}