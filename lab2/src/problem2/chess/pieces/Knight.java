package problem2.chess.pieces;

public class Knight extends Piece {

	public Knight(String color) {
		super(color);
	}
	
	@Override
    public char getSymbol() {
        return color.equals("white") ? 'N' : 'n';
    }

	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.getX() - b.getX());
		int dy = Math.abs(a.getY() - b.getY());
		
		if(((dx == 1 && dy == 2) 
				|| (dx == 2 && dy == 1))) {
			return true;
		}
		return false;
	}

}
