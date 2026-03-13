package problem2.chess.game.model;

import problem2.chess.pieces.Bishop;
import problem2.chess.pieces.King;
import problem2.chess.pieces.Knight;
import problem2.chess.pieces.Pawn;
import problem2.chess.pieces.Piece;
import problem2.chess.pieces.Position;
import problem2.chess.pieces.Queen;
import problem2.chess.pieces.Rook;

public class Board {
	private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        setupBoard();
    }
    
    private void setupBoard() {

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("black", -1);
            board[6][i] = new Pawn("white", 1);
        }

        board[0][0] = new Rook("black");
        board[0][7] = new Rook("black");
        board[7][0] = new Rook("white");
        board[7][7] = new Rook("white");

        board[0][1] = new Knight("black");
        board[0][6] = new Knight("black");
        board[7][1] = new Knight("white");
        board[7][6] = new Knight("white");

        board[0][2] = new Bishop("black");
        board[0][5] = new Bishop("black");
        board[7][2] = new Bishop("white");
        board[7][5] = new Bishop("white");

        board[0][3] = new Queen("black");
        board[7][3] = new Queen("white");

        board[0][4] = new King("black");
        board[7][4] = new King("white");
    }
	
	public void drawBoard() {
		System.out.println("   0   1   2   3   4   5   6   7");
		for (int row = 0; row < 8; row++) {
            System.out.println(" +---+---+---+---+---+---+---+---+");
            System.out.print((row) + "|");
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece == null) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + piece.getSymbol() + " |");
                }
            }
            System.out.println(row);
		}
		System.out.println(" +---+---+---+---+---+---+---+---+");
        System.out.println("   0   1   2   3   4   5   6   7");
	}
	
    public boolean movePiece(Position from, Position to) {

        if (!isInsideBoard(from) || !isInsideBoard(to)) {
            System.out.println("Illegal move");
            return false;
        }

        Piece piece = board[from.getX()][from.getY()];

        if (piece == null) {
            System.out.println("No piece at starting position");
            return false;
        }

        if (!piece.isLegalMove(from, to)) {
            System.out.println("Illegal move");
            return false;
        }

        board[to.getX()][to.getY()] = piece;
        board[from.getX()][from.getY()] = null;

        return true;
    }

    private boolean isInsideBoard(Position pos) {
        return pos.getX() >= 0 && pos.getX() < 8 &&
               pos.getY() >= 0 && pos.getY() < 8;
    }
    
    public Piece getPiece(Position pos) {
        return board[pos.getX()][pos.getY()];
    }
}
 