package chess.pieces;

import chess.Player;
import chess.Position;

public class Knight extends Piece{
	
	private Type type = Type.KNIGHT;

	public Knight(Position position, Player player) {
		super(position, player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public boolean isValidPath(Position newPosition) {
		// TODO calculations
		return false;
	}


}
