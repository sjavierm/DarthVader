package tablero;

public class Personaje {
	private String nombre;
	private CasilleroBasico posicionActual; // casillero donde esta parado
	
	public Personaje(String nombre) {
		this.nombre = nombre;
	}
	
	public CasilleroBasico getPosicionActual () {
		return posicionActual;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setPosicionActual (CasilleroBasico casillero) { //agrega la posicion donde esta parado y se agrega a la lista de ese casillero
		this.posicionActual = casillero;
		this.posicionActual.agregarPersonaje(this);
	}
	
	public void mover (CasilleroBasico casillero) { // lo cambia de lugar, eso incluye sacarse de la lista del casillero y agregarse en el nuevo
		this.posicionActual.removerPersonaje(this);
		this.posicionActual = casillero;
		this.posicionActual.agregarPersonaje(this);
	}
	
	public int getIdPosicion () { //para pruevas
		return this.posicionActual.getId();
	}
	
	public String toString () {
		return this.nombre;
	}
}
