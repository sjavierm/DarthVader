package tablero;

import java.util.ArrayList;

public class Pruebas {
	public static void main(String[] args) {
		
		Personaje	mario = new Personaje("Mario"),
					luigi = new Personaje("Luigi");
		
		ArrayList<Personaje> gente = new ArrayList<Personaje>();
		
		gente.add(luigi);
		gente.add(mario);
		
		Controlador controlador = new Controlador("./archivos/mapa prueba.txt", gente);
		
		controlador.repGraf(); //representacion grafica del tablero (0 -> vacio, n -> id)
		
		controlador.ronda();
	}
}
