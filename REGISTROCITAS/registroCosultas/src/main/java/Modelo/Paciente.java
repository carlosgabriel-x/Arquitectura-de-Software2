package Modelo;

public class Paciente {
    private int nSeguroSocial;
    private String nombre;
    private int edad;
    private String telefono;
    private String direccion;

    public Paciente(int nSeguroSocial, String nombre, int edad, String telefono, String direccion) {
        this.nSeguroSocial = nSeguroSocial;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getnSeguroSocial() {
        return nSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrarDatos() {
        System.out.println("Paciente: " + nombre + " | Edad: " + edad + " | Teléfono: " + telefono + " | Dirección: " + direccion);
    }
}
