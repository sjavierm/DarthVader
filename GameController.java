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
		/*
		Lo que hice fue agregarle la parte para que vea si ingreso 0 o mas de 4 jugadores
		Despues habria que buscar la manera para ver si mostramos un mensaje de error o algo
		por estilo en esos dos casos
		*/
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
