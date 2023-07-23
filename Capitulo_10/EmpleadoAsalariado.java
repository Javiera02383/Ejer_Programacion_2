// Fig. 10.5: EmpleadoAsalariado.java
// La clase concreta EmpleadoAsalariado extiende a la clase abstracta Empleado.

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    // constructor
 public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
 String numeroSeguroSocial, double salarioSemanal)
 {
 super(primerNombre, apellidoPaterno, numeroSeguroSocial);

 if (salarioSemanal < 0.0)
 throw new IllegalArgumentException(
 “El salario semanal debe ser >= 0.0”);

 this.salarioSemanal = salarioSemanal;
 }

 public void establecerSalarioSemanal(double salarioSemanal)
 {
 if (salarioSemanal < 0.0)
 throw new IllegalArgumentException(“El salario semanal debe ser >= 0.0”);

 this.salarioSemanal = salarioSemanal;
 }

    // devuelve el salario
    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos() {
        return obtenerSalarioSemanal();
    }

    // devuelve representación String de un objeto EmpleadoAsalariado
 @Override
 public String toString()
 {
 return String.format(“empleado asalariado: %s%n%s: $%,.2f”,
 super.toString(), “salario semanal”, obtenerSalarioSemanal());
 }
} // fin de la clase EmpleadoAsalariado