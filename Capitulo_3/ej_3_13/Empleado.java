package Tareas_unidad_1.Capitulo_3.ej_3_13;

/*(La clase Empleado) Cree una clase llamada Empleado, que incluya tres variables de instancia: un primer
nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double). Su clase debe tener un constructor
que inicialice las tres variables de instancia. Proporcione un método establecer y un método obtener para cada
variable de instancia. Si el salario mensual no es positivo, no establezca su valor. Escriba una aplicación de prueba
llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el
salario anual de cada objeto. Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual
de cada Empleado otra vez. */

public class Empleado {

    private String primNom;
    private String apePat;
    private double salMen;

    public Empleado() {
        this.primNom = "John";
        this.apePat = "Doe";
        this.salMen = 0.0;
    }

    public void establecerPrimNom(String primNom) {
        this.primNom = primNom;
    }

    public String obtenerPrimNom() {
        return primNom;
    }

    public void establecerApePat(String apePat) {
        this.apePat = apePat;
    }

    public String obtenerApePat() {
        return apePat;
    }

    public void establecerSalMen(double salMen) {
        if (salMen > 0)
            this.salMen = salMen;
    }

    public double obtenerSalMen() {
        return salMen;
    }

    public void obtenerDatosEmpleado() {
        System.out.println("Primer Nombre: " + primNom +
                "\nApellido Paterno: " + apePat +
                "\nSalario mensual: $" + salMen);
    }
}