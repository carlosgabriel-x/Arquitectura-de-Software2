package Vista;


import java.util.Scanner;




public class VistaParchis {
    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("--------------PARCHIS----------------");
        System.out.println("Menu");
        System.out.println("1) crear sala");
        System.out.println("2) Nombre de jugador ");
        System.out.println("3) Salir");
        System.out.print("Elige un número: ");
    }

    public int leerOpcion() {
        return sc.nextInt();
    }

    public String pedirNombre() {
        sc.nextLine(); // limpiar buffer
        System.out.print("Ingresa tu nombre: ");
        return sc.nextLine();
    }

    public String pedirColor() {
        System.out.print("Ingresa tu color: ");
        return sc.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public String nombresala() {
        sc.nextLine();
         System.out.println("Ingrese el nombre de la sala:");
         String nombresala = sc.nextLine();
        return nombresala;
    }
    
    public String contsala() {
        System.out.println("Ingrese la contraseña de la sala:");
        String contsala = sc.nextLine();
        return contsala;
}

    
    

}



   

        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

