package ej_8_11;

public class Complejos {
    private double parteReal;
    private double parteImaginaria;
    private static final String i = "i"; // Letra i que representa la raiz cuadrada de -1

    public Complejos(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    // Constructor predeterminado, no recibe parametros

    public Complejos() {
        this(0.0, 0.0);
    }

    // Obtiene la parte real del número complejo

    public double obtenerParteReal() {
        return parteReal;
    }

    // Obtiene la parte imaginaria

    public double obtenerParteImaginaria() {
        return parteImaginaria;
    }

    public Complejos suma(Complejos a) {
        return new Complejos(obtenerParteReal() + a.obtenerParteReal(),
                obtenerParteImaginaria() + a.obtenerParteImaginaria());
    }

    public Complejos resta(Complejos a) {
        return new Complejos(obtenerParteReal() - a.obtenerParteReal(),
                obtenerParteImaginaria() - a.obtenerParteImaginaria());
    }

    public String toString() {// Obtiene el número complejo en su totalidad en un objeto String
        return String.format("%f+%f%s", obtenerParteReal(), obtenerParteImaginaria(), i);
    }
}
