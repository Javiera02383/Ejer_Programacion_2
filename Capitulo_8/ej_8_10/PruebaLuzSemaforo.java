package ej_8_10;

public class PruebaLuzSemaforo {
    public static void main(String[] args) {
        for (LuzSemaforo semaforo : LuzSemaforo.values()) {
            System.out.printf("%s: %s%n", semaforo, semaforo.obtenerDuracion());
        }
    }
}
