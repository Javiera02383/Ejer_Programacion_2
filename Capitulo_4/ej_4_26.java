public class ej_4_26 {
    // Ejercicio 4.26 misterio3.java

    public static void main(String[] args) {
        int fila = 10;

        while (fila >= 1) {
            int columna = 1;

            while (columna <= 10) {
                System.out.print(fila % 2 == 1 ? "<" : ">");
                ++columna;
            }
            --fila;
            System.out.println();
        }
    }
}// Fin de la clase misterio

// >>>>>>>>>>
// <<<<<<<<<<
// >>>>>>>>>>
// <<<<<<<<<<
// >>>>>>>>>>
// <<<<<<<<<<
// >>>>>>>>>>
// <<<<<<<<<<
// >>>>>>>>>>
// <<<<<<<<<<
