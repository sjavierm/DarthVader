package tablero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tablero {
	private String nombre;
	private CasilleroBasico[][] tablero;
	private CasilleroBasico inicio;
	
	public Tablero (String path) throws FileNotFoundException { //lo instancias con el path del archivo de donde levanta el mapa
		llenarMatriz(path);
	}
	
	private void llenarMatriz (String path) throws FileNotFoundException {
		
		Scanner lector = new Scanner(new File(path));
		
		nombre = lector.nextLine(); //un nombre para el tablero, no se si sirve para algo
		int ancho = lector.nextInt(), //ancho y alto del tablero
			alto = lector.nextInt();
		tablero = new CasilleroBasico[ancho][alto]; //instancia la matriz
		
		//avanza por los 0 y 1 del archivo y si hay un 1 hace un casillero nuevo y le pone el ID
		for (int i = 0; i < alto ; i++)
			for (int j = 0; j < ancho ; j++)
				if (lector.nextInt() == 1)
					tablero[j][i] = new CasilleroBasico(j + 5 * i);
		
		String[] propiedades; // direccion de los siguientes casilleros, inicio, powerups, etc.
		
		while (lector.hasNext()) { //mientras no se haya terminado el archivo
			int x = lector.nextInt(), //mira que elemento de la matriz es
				y = lector.nextInt();
			propiedades = lector.nextLine().split(" "); //lee la descripcion que tiene al lado
			
			for(String prop : propiedades) { // y hace cosas dependiendo de las propiedades que encuentre
				if (prop.equals("derecha"))
					tablero[x][y].agregarSiguiente(tablero[x + 1][y]);
				else if (prop.equals("izquierda"))
					tablero[x][y].agregarSiguiente(tablero[x - 1][y]);
				else if (prop.equals("arriba"))
					tablero[x][y].agregarSiguiente(tablero[x][y - 1]);
				else if (prop.equals("abajo"))
					tablero[x][y].agregarSiguiente(tablero[x][y + 1]);
				else if (prop.equals("inicio"))
					this.inicio = tablero[x][y];
			}
			//seria buena idea cambiar los else if pero no se usar switch en java
		}
		
		lector.close();
	}
	
	public CasilleroBasico getInicio () {
		return inicio; //devuelve una referencia al casillero donde empiezan los personajes
	}
	
	public String toString() {
		return this.nombre;
	}
	
	public void repGraf () { //representacion grafica para la prueba, recorre la matriz y pone el id del casillero o 0 si no hay nada
		for (int i = 0; i < tablero.length ; i++) {
			for (int j = 0; j < tablero[0].length ; j++) {
				if (tablero[j][i] != null)
					System.out.print(tablero[j][i].getId() + "\t");
				else
					System.out.print(0 + "\t");
			}
			System.out.println();
		}
	}
}
