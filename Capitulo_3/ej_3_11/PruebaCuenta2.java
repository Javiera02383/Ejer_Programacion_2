package Tareas_unidad_1.Capitulo_3.ej_3_11;

// Fig. 3.9: PruebaCuenta.java
// Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;

public class PruebaCuenta2 {
        public static void main(String[] args) {
                Cuenta2 cuenta1 = new Cuenta2("Jane Green", 50.00);
                Cuenta2 cuenta2 = new Cuenta2("John Blue", 100.53);

                // muestra el saldo inicial de cada objeto
                System.out.printf("Saldo de %s: $%.2f%n",
                                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
                System.out.printf("Saldo de %s: $%.2f%n%n",
                                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

                // crea un objeto Scanner para obtener la entrada de la ventana de comandos
                Scanner entrada = new Scanner(System.in);

                System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador (promt)
                double montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
                System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                                montoDeposito);
                cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1

                System.out.print("Escriba el monto a depositar para cuenta2: "); // indicador (promt)
                montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
                System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
                                montoDeposito);
                cuenta2.depositar(montoDeposito); // suma al saldo de cuenta1

                // muestra los saldos
                System.out.printf("---Saldo de %s: $%.2f%n---",
                                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
                System.out.printf("---Saldo de %s: $%.2f%n%n---",
                                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

                // Modifique la clase PruebaCuenta (figura 3.9) para probar el método retirar

                System.out.print("Escriba el monto a retirar para cuenta1: "); // indicador (promt)
                double montoRetiro = entrada.nextDouble(); // obtiene entrada del usuario
                System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n", montoRetiro);
                cuenta1.retirar(montoRetiro); // resta al saldo de cuenta1

                System.out.print("Escriba el monto a retirar para cuenta2: "); // indicador (promt)
                montoRetiro = entrada.nextDouble(); // obtiene entrada del usuario
                System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n", montoRetiro);
                cuenta2.retirar(montoRetiro); // resta al saldo de cuenta2

                // muestra los saldos
                System.out.printf("---Saldo de %s: $%.2f%n---",
                                cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
                System.out.printf("---Saldo de %s: $%.2f%n%n---",
                                cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

                entrada.close();
        } // fin de main
} // fin de la clase PruebaCuenta
