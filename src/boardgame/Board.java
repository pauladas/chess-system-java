package boardgame;


public class Board {
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;

	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public Piece piece(Integer row, Integer columns) {
		return new Piece(this);
	}

	public Piece piece(Position position) {
		return new Piece(this);
	}

	public void placePiece(Piece piece, Position position) {

	}

	public Piece removePiece(Position position) {
		return new Piece(this);
	}

	public Boolean positionExists(Position position) {
		return true;
	}

	public Boolean thereIsAPiece(Position position) {
		return true;
	}
}
