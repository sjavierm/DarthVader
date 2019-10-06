package marioParty;

public class PowerUp {
	private String nombre;
	private boolean turnoExtra;
	private int puntosExtra;
	
	public PowerUp(String nombre, boolean turnoExtra, int puntosExtra) {
		super();
		this.nombre = nombre;
		this.turnoExtra = turnoExtra;
		this.puntosExtra = puntosExtra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isTurnoExtra() {
		return turnoExtra;
	}

	public void setTurnoExtra(boolean turnoExtra) {
		this.turnoExtra = turnoExtra;
	}

	public int getPuntosExtra() {
		return puntosExtra;
	}

	public void setPuntosExtra(int puntosExtra) {
		this.puntosExtra = puntosExtra;
	}
		
}
