//package Tareas_unidad_1.Capitulo_7.ej_7_10;

import javax.swing.JOptionPane;

public class Vendedores {
    public static void main(String[] args) {
        int numVendedores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vendedores:"));

        double[] ventas = new double[numVendedores];

        for (int i = 0; i < numVendedores; i++) {
            double venta = Double
                    .parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del vendedor " + (i + 1) + ":"));
            ventas[i] = venta;
        }

        int[] contadorRangos = contarVendedoresPorRango(ventas);

        mostrarResultados(contadorRangos);
    }

    public static int[] contarVendedoresPorRango(double[] ventas) {
        int[] contadorRangos = new int[9];

        for (double venta : ventas) {
            double salario = 200 + (0.09 * venta);
            int rango = (int) salario / 100 - 2;
            contadorRangos[rango]++;
        }

        return contadorRangos;
    }

    public static void mostrarResultados(int[] contadorRangos) {
        String tabla = "Rango de salarios   Cantidad de vendedores\n";
        tabla += "$200-299         \t" + contadorRangos[0] + "\n";
        tabla += "$300-399         \t" + contadorRangos[1] + "\n";
        tabla += "$400-499         \t" + contadorRangos[2] + "\n";
        tabla += "$500-599         \t" + contadorRangos[3] + "\n";
        tabla += "$600-699         \t" + contadorRangos[4] + "\n";
        tabla += "$700-799         \t" + contadorRangos[5] + "\n";
        tabla += "$800-899         \t" + contadorRangos[6] + "\n";
        tabla += "$900-999         \t" + contadorRangos[7] + "\n";
        tabla += "$1,000 en adelante      \t" + contadorRangos[8] + "\n";

        JOptionPane.showMessageDialog(null, tabla);
    }
}
