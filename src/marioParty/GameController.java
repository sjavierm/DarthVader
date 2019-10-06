package marioParty;

import java.io.IOException;
import java.util.ArrayList;

public class GameController {
	
	int contTurnos;
	int turnoPlayer;
	int cantPlayers;
	GameBoard gameboard = new GameBoard();
	ArrayList<Player> listPlayer = new ArrayList<Player>();

	
	public void startGame(int cantPlayers) {
		this.contTurnos = 0;
		this.turnoPlayer = 0;
		this.cantPlayers = cantPlayers;
		for (int i = 0 ; i < cantPlayers ; i++) {
			Player player = new Player(i);
			listPlayer.add(player);
		}
		
		gameboard.generarCaminos();
			
	}
	
	public void iniciarTurno() throws IOException {
		System.out.println("Inicia el turno nro: " + contTurnos);
		System.out.println("Es el turno del jugador nro: " + turnoPlayer);
		listPlayer.get(turnoPlayer).ejecutarTurno();
		contTurnos++;
		turnoPlayer++;
		if (turnoPlayer >= cantPlayers)
			turnoPlayer = 0;
	}
}
=======
package marioParty;

import java.util.ArrayList;

public class GameController {
	
	int contTurnos;
	int turnoPlayer;
	GameBoard gameboard = new GameBoard();
	ArrayList<Player> listPlayer = new ArrayList<Player>();

	
	
	public int getContTurnos() {
		return contTurnos;
	}

	public void setContTurnos(int contTurnos) {
		this.contTurnos = contTurnos;
	}

	public int getTurnoPlayer() {
		return turnoPlayer;
	}

	public void setTurnoPlayer(int turnoPlayer) {
		this.turnoPlayer = turnoPlayer;
	}

	public GameBoard getGameboard() {
		return gameboard;
	}

	public void setGameboard(GameBoard gameboard) {
		this.gameboard = gameboard;
	}

	public ArrayList<Player> getListPlayer() {
		return listPlayer;
	}

	public void setListPlayer(ArrayList<Player> listPlayer) {
		this.listPlayer = listPlayer;
	}

	public void startGame(int cantPlayers) {
		this.contTurnos = 0;
		this.turnoPlayer = 0;
		
		for (int i = 0 ; i < cantPlayers ; i++) {
			Player player = new Player(i);
			listPlayer.add(player);
		}
		
		gameboard.generarCaminos();
			
	}
	
	public void administrarTurnos(boolean turnoExtra) {
		if(!turnoExtra){
			if(turnoPlayer == listPlayer.size()-1){
				turnoPlayer = 0;
			}
			else
				turnoPlayer++;
		}
			
	}
}
