package Capitulo_7.ej_7_20;

import javax.swing.JOptionPane;

public class Ventas {
    private double[][] ventas;

    public Ventas() {
        ventas = new double[5][5]; // 5 productos y 4 vendedores
    }

    public void registrarVentas(int vendedor, int producto, double valorVentas) {
        ventas[producto - 1][vendedor - 1] += valorVentas;
    }

    public void mostrarVentasTotales() {
        StringBuilder tabla = new StringBuilder();

        // Encabezado de la tabla
        tabla.append("       Vendedor 1   Vendedor 2   Vendedor 3   Vendedor 4\n");

        // Filas de ventas por producto
        for (int producto = 0; producto < 5; producto++) {
            tabla.append("P ").append(producto + 1).append("\t        ");
            for (int vendedor = 0; vendedor < 4; vendedor++) {
                tabla.append(ventas[producto][vendedor]).append("\t                  ");
            }
            tabla.append("\n");
        }

        // Mostrar la tabla en un cuadro de mensaje
        JOptionPane.showMessageDialog(null, tabla.toString(), "Ventas Totales", JOptionPane.INFORMATION_MESSAGE);
    }
}
