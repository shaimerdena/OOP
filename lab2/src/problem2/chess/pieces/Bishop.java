package problem2.chess.pieces;

public class Bishop extends Piece {

	public Bishop(String color) {
		super(color);
	}
	
	@Override
    public char getSymbol() {
        return color.equals("white") ? 'B' : 'b';
    }

	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.getX() - b.getX());
		int dy = Math.abs(a.getY() - b.getY());
		
		if(dx == dy && !(dx == 0 && dy == 0)) {
			return true;
		}
		return false;
	}

}
