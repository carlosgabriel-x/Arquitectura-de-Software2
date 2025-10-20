package Modelo;

import java.time.LocalDate;

public class citaMedica {
    private int idCita;
    private String fecha;
    private String hora;
    private int consultorio;
    private Medico medico;
    private Paciente paciente;

    public citaMedica(int idCita, String fecha, String hora, Medico medico, Paciente paciente) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getIdCita() {
        return idCita;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getConsultorio() {
        return consultorio;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void generarCita() {
        System.out.println("Cita generada correctamente para " + paciente.getNombre());
    }

    public void cancelarCita() {
        System.out.println("Cita con ID " + idCita + " ha sido cancelada.");
    }

    public void detalleCita() {
        System.out.println("=== Detalle de la Cita ===");
        System.out.println("ID: " + idCita);
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Médico: " + medico.getNombre());
        System.out.println("Especialidad: " + medico.getEspecialidad());
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Consultorio: " + consultorio);
    }

   
}
