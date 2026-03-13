package problem2.chess.pieces;

public class Rook extends Piece {

	public Rook(String color) {
		super(color);
	}
	
	@Override
    public char getSymbol() {
        return color.equals("white") ? 'R' : 'r';
    }

	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.getX() - b.getX());
		int dy = Math.abs(a.getY() - b.getY());
		
		if((dx == 0 || dy == 0) &&
				!(dx == 0 && dy == 0)) {
			return true;
		}
		return false;
	}

}
