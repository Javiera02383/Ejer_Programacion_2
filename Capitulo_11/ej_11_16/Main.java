package Capitulo_11.ej_11_16;

// Programa para demostrar que el bloque catch para el tipo ExcepcionA atrapa excepciones de los tipos ExcepcionB y ExcepcionC

public class Main {

    public static void main(String[] args) {
        try {
            throw new ExcepcionB("Excepcion B");
        } catch (ExcepcionA e) {
            e.printStackTrace();
        }

        try {
            throw new ExcepcionC("Excepcion C");
        } catch (ExcepcionA e) {
            e.printStackTrace();
        }
    }
}