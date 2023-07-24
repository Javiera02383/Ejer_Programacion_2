package Capitulo_11.ej_11_20;

public class ej_11_20 {

    public static void unMetodo2() throws Exception {
        System.out.println("unMetodo2: Lanzando excepción desde unMetodo2.");
        throw new Exception("Excepción lanzada desde unMetodo2.");
    }

    public static void unMetodo() throws Exception {
        try {
            unMetodo2();
        } catch (Exception e) {
            System.out.println("unMetodo: Capturando excepción desde unMetodo2 y re-lanzándola.");
            throw e; // Volvemos a lanzar la excepción capturada.
        }
    }

    public static void main(String[] args) {
        try {
            unMetodo();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método main:");
            e.printStackTrace(); // Imprimir el rastreo de la pila de la excepción.
        }
    }
}
