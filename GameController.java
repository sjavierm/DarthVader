package marioParty;

import java.io.IOException;
import java.util.ArrayList;

public class GameController {
	
	int contTurnos;
	int turnoPlayer;
	int cantPlayers;
	GameBoard gameboard = new GameBoard();
	ArrayList<Player> listPlayer = new ArrayList<Player>();

	
	public int startGame(int cantPlayers) {
		this.contTurnos = 0;
		this.turnoPlayer = 0;
		this.cantPlayers = cantPlayers;
		
		if(this.cantPlayers<=0)
			return 0;
		if(this.cantPlayers>4)
			return -1;
		for (int i = 0 ; i < cantPlayers ; i++) {
			Player player = new Player(i);
			listPlayer.add(player);
		}
		//Que pasa si ingresa un cero en cantPlayers
		///Deberia ser un int lo que retorne la funcion
		
		gameboard.generarCaminos();
		return 1;
			
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
