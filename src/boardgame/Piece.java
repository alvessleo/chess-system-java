package boardgame;

public class Piece {
    private Board board;
    protected Position position;

    public Piece(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
}
