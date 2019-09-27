package entidades;

public class Jugador extends Elemento {
	protected int vida=100;
	protected int puntos=0;
	protected int id;
	public Jugador(int x,int y,Tablero t,int id){
		this.posX=x;
		this.posY=y;
		this.tablero=t;
		this.id=id;
	}
	
	protected int tirarDados(){
		return (int) (Math.random() * 6) + 1;
		
	}
	
	public int moverArriba(){
		if(this.posX-1>=0)
			return 1;
		return 0;
	}
	public int moverAbajo(){
		if(this.posX+1<=this.tablero.getAncho())
			return 1;
		return 0;
	}
	public int moverDer(){
		if(this.posY+1<=this.tablero.getLargo())
			return 1;
		return 0;
	}
	
	public int moverIzq(){
		if(this.posY-1<=this.tablero.getLargo())
			return 1;
		return 0;
	}
}
