package marioParty;

public class PowerUp {
	private String tipo;
	private int vidas;
	private int puntos;
	private int turnosExtra;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getTurnosExtra() {
		return turnosExtra;
	}
	public void setTurnosExtra(int turnosExtra) {
		this.turnosExtra = turnosExtra;
	}
	
	public PowerUp(String tipo, int vidas, int puntos, int turnosExtra) {
		super();
		this.tipo = tipo;
		this.vidas = vidas;
		this.puntos = puntos;
		this.turnosExtra = turnosExtra;
	}
	
	
	
}
