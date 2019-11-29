package chess.pieces;

import chess.Player;
import chess.Position;

public class Horse extends Piece{

	private Type type = Type.HORSE;

	public Horse(Position position, Player player) {
		super(position, player);
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
