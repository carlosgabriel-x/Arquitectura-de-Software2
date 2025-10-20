
package Controlador;

import Modelo.Medico;
import Modelo.citaMedica;
import java.util.ArrayList;


public class conCitaMedica {
 
    private ArrayList<Medico> listaMedicos = new ArrayList<>();
    private ArrayList<citaMedica> listaCitas = new ArrayList<>();

    public conCitaMedica() {
        // simulamos que ya existen médicos registrados
        listaMedicos.add(new Medico(1, "Dra. Gómez", "Pediatría", 101, "Lunes a Viernes", "9:00 - 14:00"));
        listaMedicos.add(new Medico(2, "Dr. Ramírez", "Cardiología", 102, "Martes y Jueves", "10:00 - 15:00"));
        listaMedicos.add(new Medico(3, "Dra. Ortega", "Dermatología", 103, "Lunes, Miércoles, Viernes", "8:00 - 13:00"));
    }

    public ArrayList<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public void registrarCita(citaMedica cita) {
        listaCitas.add(cita);
    }

    public void mostrarCitas() {
        if (listaCitas.isEmpty()) {
            System.out.println("️ No hay citas registradas.");
        } else {
            System.out.println(" LISTADO DE CITAS:");
            for (citaMedica c : listaCitas) {
                c.detalleCita();
            }
        }
    }

    public Medico buscarMedicoPorId(int id) {
        for (Medico m : listaMedicos) {
            if (m.getIdMedico() == id) {
                return m;
            }
        }
        return null;
    }
    
    
    
}
