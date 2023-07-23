package Tareas_unidad_1.Capitulo_7.ej_7_19;

import javax.swing.JOptionPane;

public class PruebaAerolinea {

    public static void main(String[] args) {
        boolean[] asientos = new boolean[10]; // Arreglo para representar los asientos, inicializados como vacíos

        while (true) {
            int opcion = obtenerOpcionSeleccionada();
            int asiento = asignarAsiento(asientos, opcion);

            if (asiento != -1) {
                imprimirPaseAbordar(asiento, opcion);
                if (!Ocupados(asientos)) {
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra reserva?");
                    if (respuesta != JOptionPane.YES_OPTION) {
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Ya no hay asientos disponibles.\nEl proximo vuelo sale en 3 horas.\nPresione Aceptar para salir del programa.");

                int resp = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
                if (resp == JOptionPane.OK_OPTION) {
                    System.exit(0); // Sale del programa
                } else {
                    // Aquí puedes agregar más código para continuar con la ejecución del programa
                    // si el usuario no desea salir
                    System.exit(0);
                }
            }

        }
    }

    public static boolean Ocupados(boolean[] asientos) {
        for (boolean ocupado : asientos) {
            if (!ocupado) {
                return false; // Hay al menos un asiento disponible
            }
        }
        return true; // Todos los asientos están ocupados
    }

    public static int obtenerOpcionSeleccionada() {
        String mensaje = "Por favor, escriba '1' para Primera Clase o '2' para Económico:";
        String opcionStr = JOptionPane.showInputDialog(null, mensaje);

        try {
            int opcion = Integer.parseInt(opcionStr);
            if (opcion == 1 || opcion == 2) {
                return opcion;
            }
        } catch (NumberFormatException e) {
        }
        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, seleccione (1 o 2)");

        return obtenerOpcionSeleccionada();
    }

    public static int asignarAsiento(boolean[] asientos, int opcion) {
        int asiento;
        if (opcion == 1) {
            asiento = asignarAsientoPrimeraClase(asientos);
            if (asiento == -1) {
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "No hay asientos disponibles en 'Primera Clase'. ¿Aceptar 'Económico'?");
                if (respuesta == JOptionPane.YES_OPTION) {
                    asiento = asignarAsientoEconomico(asientos);
                }
            }
        } else {
            asiento = asignarAsientoEconomico(asientos);
            if (asiento == -1) {
                int respuesta = JOptionPane.showConfirmDialog(null,
                        "No hay asientos disponibles en 'Económico'. ¿Aceptar 'Primera Clase'?");
                if (respuesta == JOptionPane.YES_OPTION) {
                    asiento = asignarAsientoPrimeraClase(asientos);
                }
            }
        }
        return asiento;
    }

    public static int asignarAsientoPrimeraClase(boolean[] asientos) {
        for (int i = 0; i < 5; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return i + 1; // Número de asiento en Primera Clase (1 a 5)
            }
        }
        return -1; // No hay asientos disponibles en Primera Clase
    }

    public static int asignarAsientoEconomico(boolean[] asientos) {
        for (int i = 5; i < 10; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return i + 1; // Número de asiento en Económico (6 a 10)
            }
        }
        return -1; // No hay asientos disponibles en Económico
    }

    public static void imprimirPaseAbordar(int asiento, int opcion) {
        String seccion = (opcion == 1) ? "Primera Clase" : "Económico";
        String mensaje = "¡Pase de abordar!\n" + "Se le ha asignado el asiento número: " + asiento + "\n" + "Sección: "
                + seccion;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
