package chess;

import java.util.ArrayList;
import java.util.List;

import chess.block.Color;
import chess.pieces.King;
import chess.pieces.Piece;

public class Player {
	
	private String playerName;
	
	private List<Piece> army;
	
	private List<Piece> conqured;
	
	private Color color;
	
	private boolean hasCheckMate = false;
	
	public Player(String name, List<Piece> army, Color color) {
		// TODO Auto-generated constructor stub
		army = new ArrayList<Piece>(army);
		conqured = new ArrayList<Piece>();
		this.color = color;
		// army initialisation
	}
	
	
	public void conquredNew(Piece piece) {
		conqured.add(piece);
	}
	
	public void lostPiece(Piece piece) {
		army.remove(piece);
	}
	
	
	public boolean makeMove(Piece piece, Position pos) {
		
		for(Piece soilder : army) {
			if(piece.equals(soilder)) {
				return soilder.moveTo(pos);
			}
		}
		return false;
		
	}
	
	private String name() {
		return playerName;
	}


	public boolean checkMate() {
		return hasCheckMate;
	}
	
	
	public Position postionInputFromUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public Piece userInputForPiece() {
		// TODO Auto-generated method stub
		return null;
	}


	public void removeLost(Piece previousPiece) {
		// TODO Auto-generated method stub
		if( previousPiece instanceof King)
			hasCheckMate = true;
		army.remove(previousPiece);
		
	}

}
