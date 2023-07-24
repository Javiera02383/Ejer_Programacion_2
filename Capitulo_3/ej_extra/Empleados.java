package Capitulo_3.ej_extra;

public class Empleados {
    private String nombre;
    private String apellido;
    private double sueldo;

    public Empleados(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldo() {
        return sueldo;
    }
}
