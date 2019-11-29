package chess;

public class Position {
	
	private int x;
	private int y;
	
	public Position(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = y;
		this.y = y;
	}
	
	
	public void updateToNew(Position p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}
