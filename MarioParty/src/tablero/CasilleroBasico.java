package tablero;

import java.util.ArrayList;

public class CasilleroBasico { //se llama casilleroBasico porque lo iba a hacer con decorators para los powerups pero no supe como
	private ArrayList<CasilleroBasico> siguientes; //siguientes
	private ArrayList<Personaje> personajes; //personajes parados en este casillero
	private int id;//solo para las pruebas
	
	public CasilleroBasico() {
		siguientes = new ArrayList<CasilleroBasico>();
		personajes = new ArrayList<Personaje>();
	}
	
	public CasilleroBasico (int id) {
		siguientes = new ArrayList<CasilleroBasico>();
		personajes = new ArrayList<Personaje>();
		this.id = id;
	}
	
	public void agregarPersonaje (Personaje personaje) { //esto podria tener otro metodo para agregar una lista de personajes
		this.personajes.add(personaje);
	}

	public void removerPersonaje(Personaje personaje) {
		this.personajes.remove(personaje);
	}
	
	public void agregarSiguiente (CasilleroBasico casillero) {
		this.siguientes.add(casillero);
	}
	
	public ArrayList<CasilleroBasico> getSiguientes (){
		return siguientes;
	}
	
	public ArrayList<Personaje> getPersonajes (){
		return personajes;
	} 
	
	public int getId () { //esto tambien esta para pruebas
		return this.id;
	}
}
