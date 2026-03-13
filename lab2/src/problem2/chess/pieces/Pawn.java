package problem2.chess.pieces;

public class Pawn extends Piece {
	private int direction;

	public Pawn(String color, int direction) {
		super(color);
		this.direction = direction;
	}
	
	@Override
    public char getSymbol() {
        return color.equals("white") ? 'P' : 'p';
    }

	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = a.getX() - b.getX();
		int dy = a.getY() - b.getY();
		
		if(direction == dx && dy == 0 && !(dx == 0 && dy == 0)) {
			return true;
		}
		return false;
	}
}
