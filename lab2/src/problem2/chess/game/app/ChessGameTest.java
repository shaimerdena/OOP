package problem2.chess.game.app;

import problem2.chess.game.model.Board;
import problem2.chess.pieces.Position;

public class ChessGameTest {

	public static void main(String[] args) {

        Board board = new Board();

        board.drawBoard();

        board.movePiece(
                new Position(6,2), 
                new Position(5,2)
        );

        board.drawBoard();
        
        board.movePiece(
                new Position(0,6), 
                new Position(2,7)
        );
        
        board.drawBoard();
    }

}
