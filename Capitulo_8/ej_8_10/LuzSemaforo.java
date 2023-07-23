package ej_8_10;

public enum LuzSemaforo {

    ROJO(3),
    VERDE(1),
    AMARILLO(2);

    private int duracion; // Constructor - Duración de la constante del semaforo

    LuzSemaforo(int duracion) {
        if (duracion < 0)
            throw new IllegalArgumentException("La duración debe ser >= 0");
        this.duracion = duracion;
    }

    // Devuelve la duración del semaforo
    public int obtenerDuracion() {
        return duracion;
    }
}