package tablero;

public class Dado {
	int caras;
	
	public Dado () {
		this.caras = 6;
	}
	
	public Dado (int caras) {
		this.caras = caras;
	}
	
	public int tirar () {
		return (int) Math.random() % this.caras + 1;
	}
	
	public static int tirarComun () {
		return (int) Math.random() % 6 + 1;
	}
}
