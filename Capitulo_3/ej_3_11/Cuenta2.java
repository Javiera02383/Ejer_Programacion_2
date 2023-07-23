package Tareas_unidad_1.Capitulo_3.ej_3_11;

/* Fig. 3.8: Cuenta.j
// La clase Cuenta con una variable de instancia double llamada saldo y un constructor
// además de un método llamado deposito que realiza validación.*/
public class Cuenta2 {
    private String nombre; // variable de instancia
    private double saldo; // variable de instancia

    // Constructor de Cuenta que recibe dos parámetros
    public Cuenta2(String nombre, double saldo) {
        this.nombre = nombre; // asigna nombre a la variable de instancia nombre

        // valida que el saldo sea mayor que 0.0; de lo contrario,
        // la variable de instancia saldo mantiene su valor inicial predeterminado de
        // 0.0
        if (saldo > 0.0) // si el saldo es válido
            this.saldo = saldo; // lo asigna a la variable de instancia saldo
    }

    // método que deposita (suma) sólo una cantidad válida al saldo
    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) // si el montoDeposito es válido
            saldo = saldo + montoDeposito; // lo suma al saldo
    }

    // método que devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }

    // método que establece el nombre
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    // método que devuelve el nombre
    public String obtenerNombre() {
        return nombre; // devuelve el valor de name a quien lo invocó
    } // fin del método obtenerNombre

    // método que retira dinero de un objeto Cuenta. Asegúrese de que el monto a
    // retirar no exceda el saldo de Cuenta.
    // Si lo hace, el saldo debe permanecer sin cambio y el método debe imprimir un
    // mensaje que indique El monto a retirar excede el saldo de la cuenta
    public void retirar(double montoRetiro) {

        if (montoRetiro > 0.0 && montoRetiro <= saldo) { // si el montoRetiro es válido y el montoRetiro es menor o
                                                         // igual al saldo
            this.saldo = saldo - montoRetiro; /* lo resta al saldo */
        } else if (montoRetiro > saldo) {
            System.out.printf("ERROR-El monto a Retirar excede el saldo de la cuenta \n");
        } else {
            System.out.printf("ERROR");
        }

    } // fin del método obtenerNombre

} // fin de la clase Cuenta
