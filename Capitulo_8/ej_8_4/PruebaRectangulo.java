package ej_8_4;

import javax.swing.JOptionPane;

public class PruebaRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();

        String input = JOptionPane.showInputDialog("Ingrese la longitud del rectángulo:");
        double longitud = Double.parseDouble(input);
        rectangulo.setLongitud(longitud);

        input = JOptionPane.showInputDialog("Ingrese la anchura del rectángulo:");
        double anchura = Double.parseDouble(input);
        rectangulo.setAnchura(anchura);

        double perimetro = rectangulo.calcularPerimetro();
        double area = rectangulo.calcularArea();

        JOptionPane.showMessageDialog(null, "Perímetro del rectángulo: " + perimetro);
        JOptionPane.showMessageDialog(null, "Area del rectángulo: " + area);
    }
}
