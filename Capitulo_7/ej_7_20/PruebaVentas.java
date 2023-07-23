package Tareas_unidad_1.Capitulo_7.ej_7_20;

import javax.swing.JOptionPane;

public class PruebaVentas {
    public static void main(String[] args) {
        // Crear objeto de la clase Ventas
        Ventas ventas = new Ventas();

        // Pedir al usuario que ingrese los datos de ventas
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            for (int producto = 1; producto <= 5; producto++) {
                String input = JOptionPane
                        .showInputDialog("Ingrese el valor total de ventas para el vendedor " + vendedor
                                + " y el producto " + producto + ":");
                double valorVentas = Double.parseDouble(input);
                ventas.registrarVentas(vendedor, producto, valorVentas);
            }
        }

        // Mostrar los resultados en formato tabular
        ventas.mostrarVentasTotales();
    }
}
