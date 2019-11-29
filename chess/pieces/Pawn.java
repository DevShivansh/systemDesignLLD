package chess.pieces;

import chess.Player;
import chess.Position;

public class Pawn extends Piece{

	private Type type = Type.PAWN;

	public Pawn(Position position, Player player) {
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
