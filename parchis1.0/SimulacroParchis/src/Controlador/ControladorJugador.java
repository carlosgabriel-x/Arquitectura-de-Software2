
package Controlador;
   


import Modelo.CrearSala;
import Modelo.Jugador;

import Vista.VistaParchis;


public class ControladorJugador {
    private Jugador jugador;
    private VistaParchis vista;

    public ControladorJugador(Jugador jugador, VistaParchis vista) {
        this.jugador = jugador;
        this.vista = vista;
    }
    
        
    public void iniciar() {
        int opcion = 0;
       
        while(opcion != 3) { 
           
            vista.mostrarMenu();
            opcion = vista.leerOpcion();
            String buscarL = "buscarlobby";
    
        
            
        
        switch (opcion) {
            case 1:
                vista.mostrarMensaje("Bienvenido al Loby");
                
                String nombreSala = vista.nombresala();
                String cont = vista.contsala();

                    CrearSala sala = new CrearSala(nombreSala, cont);

                vista.mostrarMensaje("Sala '" + sala.getNombresala()+ "' creada exitosamente!");
                
                break;
            case 2:
                String nombre = vista.pedirNombre();
                jugador.setNombre(nombre);
                
                String color = vista.pedirColor();
                jugador.setColor(color);
                break;
            case 3:
                vista.mostrarMensaje("Hasta luego");
                break;
        }
        }
    }
}
    


    

