package entidades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tablero t1=new Tablero(10,10);
		t1.escaneo = new Scanner(System.in);
		System.out.println();
		//System.out.println("TABLERO CON OBSTACULO");
		t1.crearTableroConObstaculo();
		t1.crearTableroConPuntosEspeciales();
		t1.crearMatrizJugadores();+
		//t1.mostrarTableroCompleto();
		System.out.println("TABLERO CON JUGADOR");
		Jugador j1=new Jugador(0,0,t1,3);
		t1.agregarJugadores(j1);
		Jugador j2=new Jugador(9,0,t1,4);
		t1.agregarJugadores(j2);
		t1.mostrarJugador();
	
		int turnos=0;
		while(j1.puntos<100&&j2.puntos<100){
			turnos++;
			System.out.println("///////////////////");
			System.out.println("TURNO:"+turnos);
			System.out.println("///////////////////");
			System.out.println("JUGADOR 1"+"(id:"+j1.id+")");
			t1.actualizarJugador(j1);
			t1.mostrarJugador();
			System.out.println("PUNTOS DEL JUGADOR 1:"+j1.puntos);
			if(j1.puntos<100){
			System.out.println("JUGADOR 2"+"(id:"+j2.id+")");
			t1.actualizarJugador(j2);
			t1.mostrarJugador();
			System.out.println("PUNTOS DEL JUGADOR 2:"+j2.puntos);
			}
		}
		if(j1.puntos>j2.puntos)
			System.out.println("El ganador es el jugador 1");
		else
			System.out.println("El ganador es el jugador 1");
		t1.escaneo.close();
	}

}
