package MarioParty;

public class Tablero {
	private int dimension;
	private Entidad[][] tablero;
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public Entidad[][] getTablero() {
		return tablero;
	}
	public void setTablero(Entidad[][] tablero) {
		this.tablero = tablero;
	}
	public Tablero(int dimension) {
		this.dimension = dimension;
		this.tablero = new Entidad[this.dimension][this.dimension];
		
		for(int i = 0; i<this.dimension; i++){
			for(int j = 0; j<this.dimension ; j++) {
				this.tablero[i][j] = new Paisaje();
			}
		}
	}
	
	
}
