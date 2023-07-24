package Capitulo_7.ej_7_18;

import java.security.SecureRandom;

public class Craps1 {
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    // Enumeración con constantes que representan el estado del juego

    private enum Estado {
        CONTINUA, GANO, PERDIO
    }

    // Constantes que representan tiros comunes del dado
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public static void main(String[] args) {
        int cantidad = 1000000;
        int[] ganados = new int[1000]; // Arreglo para almacenar la cantidad de juegos ganados en cada tiro
        int[] perdidos = new int[1000]; // Arreglo para almacenar la cantidad de juegos perdidos en cada tiro

        inicializarArreglo(ganados); // Inicializamos los arreglos con ceros
        inicializarArreglo(perdidos);

        for (int i = 0; i < cantidad; i++) {
            juegoCraps(ganados, perdidos); // Ejecutamos el juego de Craps
        }

        mostrarSumaGanadosPerdidos(ganados, perdidos); // Mostramos la cantidad de juegos ganados y perdidos en cada
                                                       // tiro
        System.out.printf("Total de juegos jugados: %,d%n", cantidad);

        double probabilidadGanar = (double) ganados[0] / cantidad;
        System.out.printf("Probabilidad de ganar en Craps: %.2f%n", probabilidadGanar);

        int duracionPromedio = calcularDuracionPromedio(ganados, perdidos);
        System.out.printf("Duración promedio de un juego de Craps: %d%n", duracionPromedio);

        boolean mejoraConDuracion = verificarMejoraConDuracion(ganados, perdidos);
        if (mejoraConDuracion) {
            System.out.println("Las probabilidades de ganar mejoran con la duración del juego.");
        } else {
            System.out.println("Las probabilidades de ganar no mejoran con la duración del juego.");
        }
    }

    // Método para mostrar la cantidad de juegos ganados y perdidos en cada tiro,
    // así como la suma total

    public static void mostrarSumaGanadosPerdidos(int[] ganados, int[] perdidos) {
        int sumaGanados = 0;
        int sumaPerdidos = 0;

        System.out.println("Num juego\tGanados\t\tPerdidos\n");
        for (int contador = 0; contador < ganados.length; contador++) {
            System.out.printf("%,4d\t\t%,3d\t\t%,3d%n", contador, ganados[contador], perdidos[contador]);
            sumaGanados += ganados[contador];
            sumaPerdidos += perdidos[contador];
        }
        System.out.printf("Total de juegos ganados: %,d\tTotal de juegos perdidos: %,d%n", sumaGanados, sumaPerdidos);
    }

    // Método para ejecutar un juego de Craps y llevar la cuenta de cuántos juegos
    // se ganan o pierden en cada tiro

    public static boolean juegoCraps(int[] ganados, int[] perdidos) {
        int gano = 0;
        int perdio = 0;
        boolean juego;
        int miPunto = 0;
        Estado estadoJuego;

        int sumaDeDados = tirarDados();
        switch (sumaDeDados) {
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANO;
                ganados[0]++;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego = Estado.PERDIO;
                perdidos[0]++;
                break;
            default:
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados;
                break;
        }

        while (estadoJuego == Estado.CONTINUA) {
            sumaDeDados = tirarDados();

            if (sumaDeDados == miPunto) {
                estadoJuego = Estado.GANO;
                gano++;
                ganados[gano]++;
            } else if (sumaDeDados == 7) {
                estadoJuego = Estado.PERDIO;
                perdio++;
                perdidos[perdio]++;
            }
        }

        if (estadoJuego == Estado.GANO) {
            juego = true;
        } else {
            juego = false;
        }
        return juego;
    }

    public static int tirarDados() {
        int dado1 = 1 + numerosAleatorios.nextInt(6);
        int dado2 = 1 + numerosAleatorios.nextInt(6);
        int suma = dado1 + dado2;
        return suma;
    }

    public static void inicializarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }

    // Método para calcular la duración promedio de un juego de Craps

    public static int calcularDuracionPromedio(int[] ganados, int[] perdidos) {
        int duracionTotal = 0;
        int totalJuegos = 0;

        for (int i = 0; i < ganados.length; i++) {
            duracionTotal += ganados[i] * i;
            duracionTotal += perdidos[i] * i;
            totalJuegos += ganados[i];
            totalJuegos += perdidos[i];
        }

        if (totalJuegos > 0) {
            return duracionTotal / totalJuegos;
        } else {
            return 0;
        }
    }

    // Método para verificar si las probabilidades de ganar mejoran con la duración
    // del juego

    public static boolean verificarMejoraConDuracion(int[] ganados, int[] perdidos) {
        int ganadosAnteriores = 0;
        int perdidosAnteriores = 0;

        for (int i = 0; i < ganados.length; i++) {
            if (ganados[i] > ganadosAnteriores || perdidos[i] > perdidosAnteriores) {
                return true;
            }
            ganadosAnteriores = ganados[i];
            perdidosAnteriores = perdidos[i];
        }

        return false;
    }
}
