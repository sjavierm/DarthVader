package marioParty;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		GameController gameController = new GameController();
		gameController.startGame(2);
		while(true)
		gameController.iniciarTurno();
	}

}
=======
package marioParty;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		GameController gameController = new GameController();
		gameController.startGame(2);
		Casillero casillero = gameController.gameboard.getCasilleroInicial();
		while(casillero.getSiguiente() != null)
		{
			System.out.println(casillero.getId());
			casillero = casillero.getSiguiente();
		}
		
	}

}