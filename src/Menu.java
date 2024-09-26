
import java.util.Scanner;


/**
 *
 * @author Aron
 */
public class Menu {
    private Empresa empresa;
    private Scanner scanner;
   
    
    public Menu() {
        empresa = new Empresa();
        scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        boolean salir = false;
        
        while(!salir) {
            System.out.println("---- Menú ----");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar empleado");
            System.out.println("3. Eliminar empleado");
            System.out.println("4. Buscar EMpleado");
            System.out.println("5. Salir.");
            System.out.println("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion) {
                case 1 -> {
                    agregar();
                }
                case 2 -> {
                    listarEmpleado();
                }
                case 3 -> {
                    eliminarEmpleado();
                }
                case 4 -> {
                    buscarEmpleado();
                }
                case 5 -> {
                    System.out.println("Estás saliendo el programa...");
                    salir = true;
                }
                
            }     
        }
    }
    private void agregar() {
        System.out.println("Ingreses RUT del empleado: ");
        String rut = scanner.nextLine();
        
        if (empresa.buscarEmpleado(rut)) {
            System.out.println("El empleado ya existe.");
        }
    
        System.out.println("Ingrese nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();
        
        System.out.println("Ingrese genero del empleado (M/F): ");
        char genero = scanner.nextLine().charAt(0);
        
        System.out.println("Ingrese años de experiancia: ");
        int anio = scanner.nextInt();
        
        System.out.println("Ingrese edad del empleado: ");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese ID del puesto: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Ingrese puesto del empleado: ");
        String nombrePuesto = scanner.nextLine();
        
        
        Puesto puesto = new Puesto(codigo, nombrePuesto);
        Empleado empleado = new Empleado(rut, nombreEmpleado, genero, anio, edad, puesto);
        
        empresa.agregar(empleado);
        System.out.println("Empleado agregado exitosamente!");
    }
  
    private void listarEmpleado() {
        empresa.listarEmpleados();
    }
 
    private void eliminarEmpleado() {
        System.out.println("Ingrese el RUT del empleado que necesita eliminar: ");
        String rut = scanner.nextLine();
        
        if (empresa.eliminarEmpleado(rut)) {
            System.out.println("Empleado eliminado correctamente.");
        } else {
            System.out.println("No se encontro ningun empleado con ese RUT.");
        }
    }
    private void buscarEmpleado() {
        System.out.println("Ingrese RUT del empleado que busca: ");
        String rut = scanner.nextLine();
        
        if (empresa.buscarEmpleado(rut)) {
            System.out.println("El empleado: " + rut + " si existe" );
        } else {
            System.out.println("El empleado: " + rut + " no existe" );
        }
    }
}
