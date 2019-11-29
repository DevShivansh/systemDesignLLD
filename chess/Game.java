package chess;

import chess.pieces.Piece;

public class Game {
	
	private Player player1;
	private Player player2;
	private Board board;
	
	public Game(Player p1, Player p2, int n) {
		this.player1 = p1;
		this.player2 = p2;
		board = new Board(n);
	}
	
	public void start() {
		
		boolean toogle = true;
		while( !isWinnerFound()) {
			Player currentPlayer = null;
			if(toogle) {
				currentPlayer = player1;
				toogle = false;
			}else {
				currentPlayer = player2;
				toogle = true;
			}
			
			Piece piece = null;
			Position pos = null;
			boolean flag;
			do {
				piece = currentPlayer.userInputForPiece();
				pos = currentPlayer.postionInputFromUser();
				flag = currentPlayer.makeMove(piece, pos);
				
			} while(!flag);
			Piece previousPiece = board.movePiece(piece, pos);
			if(previousPiece != null)
				updateScore(currentPlayer, previousPiece);
			
		}
		
	}

	
	private void updateScore(Player currentPlayer, Piece previousPiece) {
		Player tempPlayer = currentPlayer == player1 ? player2 : player1;
		currentPlayer.conquredNew(previousPiece);
		tempPlayer.removeLost(previousPiece);
		
	}

	private boolean isWinnerFound() {
		if( player1.checkMate() || player2.checkMate())
			return true;
		return false;
	}
	
	

}
