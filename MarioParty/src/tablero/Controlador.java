package tablero;

import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
	private Tablero tablero;
	private ArrayList<Personaje> personajes;
	
	public Controlador (String path, ArrayList<Personaje> personajes) { //el controlador tiene el tablero y los personajes que juegan
		try {
			this.tablero = new Tablero("./archivos/mapa prueba.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.personajes = new ArrayList<Personaje>(personajes); //los pone en una lista
		for (Personaje p : personajes) { //y los para a todos en el casillero inicial del tablero
			p.setPosicionActual(tablero.getInicio());
		}
	}
	
	public void mostrarPosicionDeLosPersonajes() { // para las pruebas
		for (Personaje p : personajes) {
			System.out.println(p + ": estoy parado en " + p.getIdPosicion());
		}
	}

	public void repGraf() { //pruebas
		this.tablero.repGraf();
	}
	
	public CasilleroBasico elegirCamino (ArrayList<CasilleroBasico> caminos) {
		System.out.println("Caminos posibles: ");
		for (CasilleroBasico casillero : caminos) {
			System.out.println(casillero.getId());
		}
		Scanner teclado = new Scanner (new FilterInputStream(System.in) {
			public void close () {
				
			}
		});
		System.out.print("elegi: ");
		int opcion = teclado.nextInt();
		while (true) {
			for (CasilleroBasico casillero : caminos) {
				if (casillero.getId() == opcion) {
					System.out.println("elegido camino: " + opcion);
					teclado.close();
					return casillero;
				}
			}
			System.out.print("opcion invalida, intente nuevamente: ");
			opcion = teclado.nextInt();
		}
	}
	
	public void ronda () {
		for (Personaje personaje : personajes) {
			System.out.println("***** turno de: " + personaje + " *****\nPosicion actual: " + personaje.getIdPosicion());
			
			int pasos = 6; //Dado.tirarComun();
			
			System.out.println(personaje + " obtuvo un: " + pasos);
			
			CasilleroBasico posicionNueva = personaje.getPosicionActual();
			ArrayList<CasilleroBasico> siguientes;
			
			for (int i = 0; i < pasos ; i++) { 
				if ((siguientes = posicionNueva.getSiguientes()).size() == 1) {
					posicionNueva = siguientes.get(0);
				}
				else {
					posicionNueva = elegirCamino(siguientes);
				}
			}
			personaje.mover(posicionNueva);
			
			System.out.println(personaje + "se encuentra ahora en: " + personaje.getIdPosicion());
		}
	}
}
