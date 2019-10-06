package marioParty;

import java.util.ArrayList;

public class Casillero {
	
	ArrayList<Player> ListPlayer = new ArrayList<Player>();
	PowerUp powerUp;
	Camino camino;
	
	public Casillero(String[] tipoCamino) {
		camino = new Camino(tipoCamino);
	}
	
	public void setPlayer(Player player){
		ListPlayer.add(player);
	}
	
	public void removePlayer(Player player) {
		ListPlayer.remove(player);
	}
	
	public void setPowerUp(PowerUp powerUp){
		this.powerUp = powerUp;
	}
	
	public void removePowerUp(PowerUp powerUp) {
		this.powerUp = null;
	}
	
	public boolean canGoUp() {
		return this.camino.canGoUp();
	}
	
	public boolean canGoDown() {
		return this.camino.canGoDown();
	}
	
	public boolean canGoLeft() {
		return this.camino.canGoLeft();
	}

	public boolean canGoRight() {
		return this.camino.canGoRight();
	}
	
	
}
=======
package marioParty;
import java.util.ArrayList;

public class Casillero {
	
	private ArrayList<Player> listPlayer = new ArrayList<Player>();
	private PowerUp powerUp;
	private Casillero siguiente;
	private int id;
	
	
	public Casillero(int id) {
		this.id = id;
		this.listPlayer = new ArrayList<Player>();
	}

	public void setPlayer(Player player){
		listPlayer.add(player);
	}
	
	public void removePlayer(Player player) {
		listPlayer.remove(player);
	}
	
	public void setPowerUp(PowerUp powerUp){
		this.powerUp = powerUp;
	}
	
	public PowerUp getPowerUp() {
		return powerUp;
	}

	public void removePowerUp(PowerUp powerUp) {
		this.powerUp = null;
	}

	public ArrayList<Player> getListPlayer() {
		return listPlayer;
	}

	public Casillero getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Casillero siguiente) {
		this.siguiente = siguiente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}