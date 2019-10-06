package test;

import org.junit.Test;

import junit.framework.Assert;
import marioParty.Casillero;
import marioParty.GameController;

@SuppressWarnings("deprecation")
public class mapaTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testMapa() {
		int i = 0;
		GameController gameController = new GameController();
		gameController.startGame(2);
		Casillero casillero = gameController.getGameboard().getCasilleroInicial();
		while(casillero.getSiguiente() != null)
		{
			Assert.assertEquals(i,casillero.getId());
			System.out.println(casillero.getId());
			casillero = casillero.getSiguiente();
			i++;
		}
		Assert.assertEquals(i,casillero.getId());
		
	}

}
