
package simulacroparchis;

import Controlador.ControladorJugador;
import Modelo.Jugador;
import Vista.VistaParchis;


public class SimulacroParchis {

    
    public static void main(String[] args) {
   
        Jugador jugador = new Jugador("");
        VistaParchis vista = new VistaParchis();
        ControladorJugador controlador = new ControladorJugador(jugador, vista);

        controlador.iniciar();
    }
}

    
    

