
package Modelo;

public class Medico {
    private int idMedico;
    private String nombre;
    private String especialidad;
    private int consultorio;
    private String horario;

    public Medico(int idMedico, String nombre, String especialidad, int consultorio, String horario, String __1400) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.consultorio = consultorio;
        this.horario = horario;
    }

   

    

    public int getIdMedico() {
        return idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public String getHorario() {
        return horario;
    }

    public void mostrarDatosMedico() {
        System.out.println("Médico: " + nombre + " | Especialidad: " + especialidad + " | Consultorio: " + consultorio + " | Horario: " + horario);
    }
}
