package ej_8_4;

import javax.swing.JOptionPane;

public class Rectangulo {
    private double longitud;
    private double anchura;

    public Rectangulo() {
        longitud = 1.0;
        anchura = 1.0;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    public double calcularArea() {
        return longitud * anchura;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            JOptionPane.showMessageDialog(null,
                    "La longitud debe ser un número de punto flotante mayor que 0.0 y menor que 20.0");
        }
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            JOptionPane.showMessageDialog(null,
                    "La anchura debe ser un número de punto flotante mayor que 0.0 y menor que 20.0");
        }
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }
}
