package chess;

import chess.block.BlackBlock;
import chess.block.Block;
import chess.block.WhiteBlock;
import chess.pieces.Piece;

public class Board {

	private int N;
	
	private Block[][] blocks;
	
	public Board(int N) {
		// TODO Auto-generated constructor stub
		this.N = N;
		blocks = new Block[N][N];
		initBlocks();
		initPieces();
		
	}

	private void initPieces() {
		// TODO 
	}

	private void initBlocks() {
		
		boolean toogle = true;
		
		for(int i = 0; i < N; i++) {
			if(toogle) {
				toogle = false;
				for(int j = 0; j < N; j++) {
					blocks[i][j++] = new BlackBlock(new Position(i, j));
					blocks[i][j] = new WhiteBlock(new Position(i, j));
				}
			}else {
				toogle = true;
				for(int j = 0; j < N; j++) {
					blocks[i][j++] = new WhiteBlock(new Position(i, j));
					blocks[i][j] = new BlackBlock(new Position(i, j));
				}
			}
		}
		
	}
	
	public Block[][] getBlocks(){
		return blocks;
	}

	
	public Piece movePiece(Piece piece, Position pos) {
		Block block = blocks[pos.getX()][pos.getY()];
		Piece previousPiece = null;
		if(!block.isFree()) {
			previousPiece = block.currentPiece();
		}
		block.occupyBlock(piece);
		return previousPiece;
		
	}
	
	
	
	
}
