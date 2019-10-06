package marioParty;

public class Player {
	
	int id;
	int turnosJugados;
	int points;
	Character character;
	Casillero actual;
	
	public Player(int id) {
		this.id = id;
		this.turnosJugados = 0;
		this.points = 0;
	}
	
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Casillero getActual() {
		return actual;
	}

	public void setActual(Casillero actual) {
		this.actual = actual;
	}

	public int ejecutarTurno() {
		
		return (int) (Math.random() * 6) + 1;
	}	
}