package marioParty;


public class GameBoard {
	
	private Casillero casilleroInicial;
		
	public Casillero getCasilleroInicial() {
		return casilleroInicial;
	}

	public void setCasilleroInicial(Casillero casillero) {
		this.casilleroInicial = casillero;
	}

	public void generarCaminos() {
		
		Casillero actual = null;
		int i = 29;
		Casillero siguiente = new Casillero(i);
		i--;
		while(i>=0)
		{
			actual = new Casillero(i);
			actual.setSiguiente(siguiente);
			siguiente = actual;
			i--;
		}
		casilleroInicial = actual;
		
	}
	
	
}
