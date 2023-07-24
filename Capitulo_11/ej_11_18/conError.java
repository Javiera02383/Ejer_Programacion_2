package Capitulo_11.ej_11_18;

public class conError {

    public static void main(String[] args) {
        try {
            // Lanzando una excepción de subclase ExcepcionB
            throw new ExcepcionB("Esta es una excepción de tipo ExcepcionB.");
        } catch (ExcepcionA e) {
            System.out.println("Bloque catch (ExcepcionA): " + e.getMessage());
        } catch (ExcepcionB e) {
            System.out.println("Bloque catch (ExcepcionB): " + e.getMessage());
        }
    }
}

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
