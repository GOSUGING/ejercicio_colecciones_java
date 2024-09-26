
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aron
 */
public class Empresa {
    private ArrayList<Empleado> listaEmpleados;
    
    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }
    
    //agregar
    
    public boolean agregar(Empleado emple) {
        return listaEmpleados.add(emple);
    }
    
    //buscar
     public boolean buscarEmpleado(String rut) {
         for (Empleado emple : listaEmpleados) {
             if (emple.getRut().equals(rut)) {
                 return true;
             }    
         }
         return false;
     }
    
    // listar empleados
     
     public void listarEmpleados() {
         for (Empleado emple : listaEmpleados) {
             System.out.println(emple.toString());
         }
     }
     
     // eliminar empleado
     
     public boolean eliminarEmpleado(String rut) {
         for (Empleado emple : listaEmpleados) {
             if(emple.getRut().equals(rut)) {
                 listaEmpleados.remove(emple);
                 return true;
             }             
         }
         return false;
     }
}
