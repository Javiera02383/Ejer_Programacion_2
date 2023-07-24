package Capitulo_11.ej_11_21;

public class ej_11_21 {

    public static void metodoA() {
        try {
            metodoB();
        } catch (NullPointerException e) {
            System.out.println("metodoA: Capturando NullPointerException en el bloque catch de métodoA.");
        } catch (ArithmeticException e) {
            System.out.println("metodoA: Capturando ArithmeticException en el bloque catch de métodoA.");
        }
    }

    public static void metodoB() {
        try {
            metodoC();
        } catch (ArithmeticException e) {
            System.out.println("metodoB: Capturando ArithmeticException en el bloque catch de métodoB.");
            throw e; // Lanzando la excepción nuevamente hacia el método que llamó a metodoB.
        }
    }

    public static void metodoC() {
        try {
            int resultado = 5 / 0; // Generando una ArithmeticException (división entre cero).
        } catch (ArithmeticException e) {
            System.out.println("metodoC: Capturando ArithmeticException en el bloque catch de métodoC.");
            throw e; // Lanzando la excepción nuevamente hacia el método que llamó a metodoC.
        }
    }

    public static void main(String[] args) {
        try {
            metodoA();
        } catch (NullPointerException e) {
            System.out.println("Excepción capturada en el método main: NullPointerException.");
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en el método main: ArithmeticException.");
        }
    }
}
