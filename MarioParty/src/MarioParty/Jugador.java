package MarioParty;

public class Jugador {
   private int CodJugador;
	 private String Nombre;
	 private boolean turno=false;
	 private int coordX;
	 private int coordY;
	 private boolean activarPoder=false;
	 ///private int cantidadPuntaje;
	 ///private int cantidadMonedas;
	 private int saludInicial;
	 ///private int cantVidas;
	 ///private String habilidad;
	 ///private int cantRecorridosCamino;
	 private int cantMovimientoARealizar;

  
    public int lanzarDado() {
        
        return (int)(Math.random()*6+1);
    }
 
    public int realizarTurno() {
        
    	if(turno==false) {
    		turno=true;
    		cantMovimientoARealizar=lanzarDado();
    		//habria que controlar si hay camino para moverse
    		//sino finalizo el tiempo de la partida
    		//si ya no hubo un ganador
    		//si no perdio todas las vidas antes de realizar turno
    		
    		return cantMovimientoARealizar;
    	}
        	
        else
        	return 0;
    }

   
    public void seleccionarCaminoAContinuar() {
        
    }

    
    public void accionJugador(int tiempoLimite) {
    
    }


    public void atacar() {
        
    }

 
    public void descansar() {
        
    }

  
    public void recibirDanio(int danio) {
       
    }


}
