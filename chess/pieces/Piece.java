package chess.pieces;

import chess.Player;
import chess.Position;

public abstract class Piece {
	
	private Position position;
	private Player player;
	
	public Piece(Position position, Player player) {
		this.position = position;
		this.player = player;
	}
	
	public abstract Type getType();
	
	
	public abstract boolean isValidPath(Position newPosition);
	
	
	public boolean moveTo(Position newPosition) {
		if(isValidPath(newPosition)) {
			position.updateToNew(newPosition);
			return true;
		}
		return false;
	}
	
	public Position currentPosition() {
		return position;
	}
	

}
