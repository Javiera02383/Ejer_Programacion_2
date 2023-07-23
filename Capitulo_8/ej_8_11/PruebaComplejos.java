package ej_8_11;

import javax.swing.JOptionPane;

public class PruebaComplejos {
    public static void main(String[] args) {
        String parteRealA = JOptionPane.showInputDialog("Introduce la parte real del número complejo a:");
        String parteImaginariaA = JOptionPane.showInputDialog("Introduce la parte imaginaria del número complejo a:");
        double realA = Double.parseDouble(parteRealA);
        double imaginariaA = Double.parseDouble(parteImaginariaA);
        Complejos a = new Complejos(realA, imaginariaA);

        String parteRealB = JOptionPane.showInputDialog("Introduce la parte real del número complejo b:");
        String parteImaginariaB = JOptionPane.showInputDialog("Introduce la parte imaginaria del número complejo b:");
        double realB = Double.parseDouble(parteRealB);
        double imaginariaB = Double.parseDouble(parteImaginariaB);
        Complejos b = new Complejos(realB, imaginariaB);

        // Muestra los dos números Complejos
        JOptionPane.showMessageDialog(null, "El número complejo a es: " + a);
        JOptionPane.showMessageDialog(null, "El número complejo b es: " + b);

        // Suma de a mas b
        Complejos c = a.suma(b);
        JOptionPane.showMessageDialog(null, "La suma de complejos a + b = c: " + a + " + " + b + " = " + c);

        // Resta de a menos b
        Complejos d = a.resta(b);
        JOptionPane.showMessageDialog(null, "La resta de complejos a - b = d: " + a + " - " + b + " = " + d);
    }
}
