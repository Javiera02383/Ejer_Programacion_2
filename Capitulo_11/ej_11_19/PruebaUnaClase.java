package Capitulo_11.ej_11_19;

import java.lang.Exception;

public class PruebaUnaClase {
    public static void main(String[] args) {
        try {
            new UnaClase(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}