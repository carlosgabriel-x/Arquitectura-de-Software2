package Vista;

import Controlador.conCitaMedica;
import Controlador.conCitaMedica;
import Modelo.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        conCitaMedica controlador = new conCitaMedica();
        int opcion;

        do {
            System.out.println("==== SISTEMA DE CITAS MÉDICAS ====");
            System.out.println("1. Registrar nueva cita");
            System.out.println("2. Mostrar citas registradas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("\nIngrese el N° de Seguro Social del paciente: ");
                    int seguro = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese los datos del paciente:");
                    System.out.print("Nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();

                    Paciente paciente = new Paciente(seguro, nombreP, edad, tel, dir);
                    System.out.println(" Datos del paciente:");
                    paciente.mostrarDatos();

                    System.out.println("--- LISTA DE MÉDICOS DISPONIBLES ---");
                    for (Medico m : controlador.getListaMedicos()) {
                        System.out.println(m.getIdMedico() + ". " + m.getNombre() + " (" + m.getEspecialidad() + ")");
                    }

                    System.out.print("Seleccione el ID del médico: ");
                    int idMedico = sc.nextInt();
                    sc.nextLine();

                    Medico medicoSeleccionado = controlador.buscarMedicoPorId(idMedico);
                    if (medicoSeleccionado != null) {
                        System.out.println(" Datos del médico seleccionado:");
                        medicoSeleccionado.mostrarDatosMedico();

                        System.out.println("\n--- REGISTRO DE CITA ---");
                        System.out.print("ID de la cita: ");
                        int idCita = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Fecha (dd/mm/aaaa): ");
                        String fecha = sc.nextLine();
                        System.out.print("Hora (hh:mm): ");
                        String hora = sc.nextLine();

                        citaMedica cita = new citaMedica(idCita, fecha, hora, medicoSeleccionado, paciente);
                        controlador.registrarCita(cita);

                        cita.detalleCita();
                    } else {
                        System.out.println(" Médico no encontrado.");
                    }
                }

                case 2 -> controlador.mostrarCitas();

                case 3 -> System.out.println(" Saliendo del sistema...");

                default -> System.out.println(" Opción inválida.");
            }

        } while (opcion != 3);
    }
}