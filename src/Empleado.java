/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aron
 */
public class Empleado {
    private String rut, nombreEmpleado;
    private char genero;
    private int anio, edad;
    private Puesto puesto;

    public Empleado() {
        puesto = new Puesto();
    }

    public Empleado(String rut, String nombreEmpleado, char genero, int anio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombreEmpleado = nombreEmpleado;
        this.genero = genero;
        this.anio = anio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombreEmpleado=" + nombreEmpleado + ", genero=" + genero + ", anio=" + anio + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
    
    
}
