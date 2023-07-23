package Tareas_unidad_1.Capitulo_3.ej_extra;

import javax.swing.JOptionPane;

public class PruebaExtra {
    public static void main(String[] args) {

        // Solicitar datos básicos del empleado
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del empleado:");
        double sueldo = Double.parseDouble(JOptionPane
                .showInputDialog("Ingrese el sueldo de " + nombre + " " + apellido + ":"));

        // Crear instancia de Empleados y CuentaEmpleados
        Empleados empleado = new Empleados(nombre, apellido, sueldo);
        CuentaEmpleados cuenta = new CuentaEmpleados(empleado, 0.0);

        // Menú de opciones
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menú:\n"
                    + "1. Mostrar cuenta del empleado\n"
                    + "2. Pagar sueldo y deducir seguro médico\n"
                    + "3. Retirar de la cuenta\n"
                    + "4. Depositar en la cuenta\n"
                    + "5. Salir\n\n"
                    + "Ingrese una opción:"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Cuenta del empleado:\n"
                            + "Nombre: " + empleado.getNombre() + " " + empleado.getApellido() + "\n"
                            + "Saldo: L. " + cuenta.getSaldo());
                    break;
                case 2:
                    cuenta.pagarSueldo();
                    JOptionPane.showMessageDialog(null, "Se ha pagado el sueldo al empleado: " + empleado.getNombre()
                            + " " + empleado.getApellido() + " y deducido el 10% del seguro médico.");

                    break;
                case 3:
                    double cantidadRetiro = Double
                            .parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                    boolean retiroExitoso = cuenta.retirar(cantidadRetiro);
                    if (retiroExitoso) {
                        JOptionPane.showMessageDialog(null, "Se ha retirado L." + cantidadRetiro + " de la cuenta.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay suficiente saldo en la cuenta.");
                    }
                    break;
                case 4:
                    double cantidadDeposito = Double
                            .parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                    cuenta.depositar(cantidadDeposito);
                    JOptionPane.showMessageDialog(null, "Se ha depositado L." + cantidadDeposito + " en la cuenta.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 5);
    }
}
