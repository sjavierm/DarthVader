package MarioParty;

public enum Mover {
	ARRIBA(-1,0),
	ABAJO(1,0),
	DERECHA(0,1),
	IZQUIERDA(0,-1);
	
	private int x;
	private int y;
	
	Mover(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
