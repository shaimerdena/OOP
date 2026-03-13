package problem2.chess.pieces;

public class King extends Piece{

	public King(String color) {
		super(color);
	}
	
	@Override
    public char getSymbol() {
        return color.equals("white") ? 'K' : 'k';
    }

	@Override
	public boolean isLegalMove(Position a, Position b) {
		int dx = Math.abs(a.getX() - b.getX());
		int dy = Math.abs(a.getY() - b.getY());
		
		if(dx <= 1 && dy <= 1 &&
				!(dx == 0 && dy == 0)) {
			return true;
		}
		return false;
	}

}
