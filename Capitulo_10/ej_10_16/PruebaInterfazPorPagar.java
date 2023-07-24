// Fig. 10.15: PruebaInterfazPorPagar.java
// Programa de prueba de la interfaz PorPagar que procesa objetos
// Factura y Empleado mediante el polimorfismo.
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        // Crea arreglo PorPagar con 4 elementos
        PorPagar[] objetosPorPagar = new PorPagar[6];

        // Llena el arreglo con objetos que implementan la interfaz PorPagar
        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        // CAMBIO 10.15
        objetosPorPagar[2] = (PorPagar) new EmpleadoAsalariado("Jhon", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = (PorPagar) new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        objetosPorPagar[4] = (PorPagar) new EmpleadoPorComision("Sue", "Jones", "333-33-33330", 10000, 0.6);
        objetosPorPagar[5] = (PorPagar) new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        // Muestra los empleados y facturas
        // procesa en forma genérica cada elemento en el arreglo objetosPorPagar
        System.out.println("____________________________________");
        for (PorPagar porPagarActual : objetosPorPagar) {
            // imprime porPagarActual y su monto de pago apropiado
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago());
        }
        System.out.println("____________________________________");
        System.out.println("CAMBIOS"); // CAMBIOS 10.15
        System.out.println("____________________________________");

        // una representación de cadena de cada objetoPorPagar
        // procesa en forma generica cada elemento en el arreglo objetosPorPagar
        for (PorPagar porPagarActual : objetosPorPagar) {
            // si un objeto es unEmpleadoBaseMasComision,aumente su salariobase por un 10%
            if (porPagarActual instanceof EmpleadoBaseMasComision) { // verdadero si, el objeto al que apunta la
                                                                     // variable PORPAGARACTUAL, es claramente una
                                                                     // instancia de la clase PorPagarActual, que hereda
                                                                     // de EmpleadoBaseMasComision
                ((EmpleadoBaseMasComision) porPagarActual).establecerSalarioBase(
                        (((EmpleadoBaseMasComision) porPagarActual).obtenerSalarioBase() * .1) +
                                ((EmpleadoBaseMasComision) porPagarActual).obtenerSalarioBase());
            }
            // imprima el monto del pago para cada objeto PorPagar.
            System.out.printf("%n%s %n%s: $%,.2f%n",
                    porPagarActual.toString(), "pago vencido", porPagarActual.obtenerMontoPago());
            System.out.println("-----------------------------");
        }
    }
}
