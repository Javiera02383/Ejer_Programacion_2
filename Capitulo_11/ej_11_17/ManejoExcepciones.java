package Capitulo_11.ej_11_17;

import java.io.IOException;

// Definición de la clase ExcepcionA que hereda de la clase Exception
class ExcepcionA extends Exception {
    public ExcepcionA(String mensaje) {
        super(mensaje);
    }
}

// Definición de la clase ExcepcionB que hereda de la clase ExcepcionA
class ExcepcionB extends ExcepcionA {
    public ExcepcionB(String mensaje) {
        super(mensaje);
    }
}

public class ManejoExcepciones {
    public static void main(String[] args) {
        try {
            // Bloque 1: Lanzando ExcepcionA
            throw new ExcepcionA("ExcepcionA: Esta es una excepción de tipo ExcepcionA.");

        } catch (Exception excepcion) {
            System.out.println("Bloque catch (Exception): " + excepcion.getMessage());
        }

        try {
            // Bloque 2: Lanzando ExcepcionB
            throw new ExcepcionB("ExcepcionB: Esta es una excepción de tipo ExcepcionB.");

        } catch (Exception excepcion) {
            System.out.println("Bloque catch (Exception): " + excepcion.getMessage());
        }

        try {
            // Bloque 3: Lanzando NullPointerException
            String texto = null;
            int longitud = texto.length(); // Esto generará NullPointerException.

        } catch (Exception excepcion) {
            System.out.println("Bloque catch (Exception): " + excepcion.getMessage());
        }

        try {
            // Bloque 4: Lanzando IOException
            throw new IOException("IOException: Error al leer el archivo.");

        } catch (Exception excepcion) {
            System.out.println("Bloque catch (Exception): " + excepcion.getMessage());
        }
    }
}
