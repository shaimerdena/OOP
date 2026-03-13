package problem2.chess.pieces;

public abstract class Piece {
	protected String color;
	
	public Piece(String color) {
		this.color = color;
	}
	
	public abstract char getSymbol();
	
	public abstract boolean isLegalMove(Position a, Position b);
}
