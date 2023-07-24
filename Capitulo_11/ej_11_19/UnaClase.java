package Capitulo_11.ej_11_19;

import java.lang.Exception;

public class UnaClase {
    private int num;

    public UnaClase(int num) throws Exception {
        if (num < 0) {
            throw new Exception("El número debe ser mayor o igual a cero");
        }
    }
}
