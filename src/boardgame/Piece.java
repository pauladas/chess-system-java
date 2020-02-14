package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public Boolean[][] possibleMoves() {
		Boolean[][] x = new Boolean[2][2];
		return x;
	}

	public Boolean possibleMove(Position position) {
		return true;
	}

	public Boolean isThereAnyPossibleMove() {
		return true;
	}

}
