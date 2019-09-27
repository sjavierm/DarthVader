package entidades;

import java.util.Scanner;

public class Tablero {
	private int ancho;
	private int largo;
	private Obstaculo [][]obs;
	private Especial[][]esp;
	private Jugador[][]jugadores;
	Scanner escaneo;
	
	public Tablero(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public void crearTableroConObstaculo(){
		obs=new Obstaculo[ancho][largo];
		for(int i=0;i<ancho;i++){
			for(int j=0;j<largo;j++){
				if((i==1||i==2||i==4||i==5||i==7||i==8)&&j!=0&&j!=9)
					obs[i][j]=new Obstaculo(i,j,this);
			}
		}
	}
	
	public void mostrarTableroConObstaculo(){
		for(int i=0;i<ancho;i++){
			for(int j=0;j<largo;j++){
				if(obs[i][j]==null)
					System.out.print("1"+" ");
				else
					System.out.print("0"+" ");
			}
			System.out.println();
		}
	}
	
	public void mostrarJugador(){
		for(int i=0;i<ancho;i++){
			for(int j=0;j<largo;j++){
				if(obs[i][j]==null&&jugadores[i][j]!=null)
					System.out.print(jugadores[i][j].id+" ");
				else{
					if(obs[i][j]==null&&esp[i][j]==null)
						System.out.print("1"+" ");
					else{
						if(esp[i][j]!=null){
							System.out.print("2"+" ");
						}
						else
							System.out.print("0"+" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	public void actualizarJugador(Jugador j1){
		char movi;
		int mov=j1.tirarDados();
		System.out.println("El jugador tiro los dados y salio:"+mov);
		jugadores[j1.posX][j1.posY]=null;
		for(int i=0;i<mov;i++){
			int arriba=0;
			int abajo=0;
			int izq=0;
			int der=0;
			if(j1.moverArriba()==1&&j1.posX-1>=0&&this.obs[j1.posX-1][j1.posY]==null)
				arriba=1;
			if(j1.moverAbajo()==1&&j1.posX+1<this.ancho&&this.obs[j1.posX+1][j1.posY]==null)
				abajo=1;
			if(j1.moverDer()==1&&j1.posY+1<this.largo&&this.obs[j1.posX][j1.posY+1]==null)
				der=1;
			if(j1.moverIzq()==1&&j1.posY-1>=0&&this.obs[j1.posX][j1.posY-1]==null)
				izq=1;
			if(arriba==1)
				System.out.println("te podes mover hacia arriba(W)");
			if(abajo==1)
				System.out.println("te podes mover hacia abajo(S)");
			if(izq==1)
				System.out.println("te podes mover hacia la izquierda(A)");
			if(der==1)
				System.out.println("te podes mover hacia la derecha(D)");
		    System.out.println("Seleccione un movimiento: ");
		   movi=escaneo.next().charAt(0);
		   if(movi=='w')
			   j1.posX-=1;
		   if(movi=='s')
			   j1.posX+=1;
		   if(movi=='d')
			   j1.posY+=1;
		   if(movi=='a')
			   j1.posY-=1;
		   if(this.esp[j1.posX][j1.posY]!=null)
			   j1.puntos+=this.esp[j1.posX][j1.posY].puntos;
		   
		}
		//System.out.println("ola mundo");
		 jugadores[j1.posX][j1.posY]=j1;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
	
	public void crearTableroConPuntosEspeciales(){
		esp=new Especial[ancho][largo];
		for(int i=0;i<ancho;i++){
			for(int j=0;j<largo;j++){
				if(i==0&&j==6||i==6&&j==9||i==9&&j==6||i==6&&j==0||i==0&&j==2||i==9&&j==2||i==9&&j==5)
					esp[i][j]=new Especial(i,j,this);
			}
		}
	}
	public void mostrarTableroCompleto(){
		for(int i=0;i<ancho;i++){
			for(int j=0;j<largo;j++){
				if(obs[i][j]==null&&esp[i][j]==null)
					System.out.print("1"+" ");
				else{
					if(esp[i][j]!=null){
						System.out.print("2"+" ");
					}
					else
						System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
	}
	
	public void crearMatrizJugadores(){
		jugadores=new Jugador[ancho][largo];
	}
	
	public void agregarJugadores(Jugador j){
		jugadores[j.posX][j.posY]=j;
	}
}
