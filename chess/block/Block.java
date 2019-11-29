package chess.block;

import chess.Position;
import chess.pieces.Piece;

public abstract class Block {

	private Position position;
	
	private Piece piece;
	
	
	public Block(Position position) {
		this.position = position;
		piece = null;
	}
	
	public abstract Color color();
	
	public boolean isFree() {
		
		return piece == null ? true : false;
	}
	
	public Piece currentPiece() {
		return piece;
	}
	
	public void occupyBlock(Piece piece) {
		
		this.piece = piece;
	}
	
	public Position position() {
		return position;
	}
	
	
}
