import java.text.DecimalFormat;
import java.util.Scanner;

public class SML {
    public static void main(String[] args) {
        final int LEE = 10;
        final int ESCRIBE = 11;
        final int ENTER = 12;
        final int ENTERSTRING = 13;
        final int SHOWSTRING = 14;
        final int CARGA = 20;
        final int ALMACENA = 21;
        final int SUMA = 30;
        final int RESTA = 31;
        final int DIVIDE = 32;
        final int MULTIPLICA = 33;
        final int BIFURCA = 40;
        final int BIFURCANEG = 41;
        final int BIFURCACERO = 42;
        final int ALTO = 43;

        int instruccion = 0;
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");

        int acumulador = 0;
        int[] memoria = new int[100]; // Cambiado el tipo de datos a int[]
        int posicion = 0, indice = 0;
        int operacion;
        boolean alto = false;

        System.out.println("LENGUAJE DE MAQUINA SIMPLETRON\n"
                + "¡Bienvenido a Simpletron Machine Language!\n"
                + "Por favor, ingrese una instruccion a la vez\n"
                + "\nIngrese su codigo a continuacion:\n-99 + ENTER = EJECUTAR\n");

        // Ingresa los valores en la memoria
        int posicionMemoria = 0;

        while (instruccion != -99) {
            System.out.printf(df.format(posicionMemoria) + " ? ");
            instruccion = entrada.nextInt();

            operacion = instruccion / 100;
            int registroInstruccion = instruccion % 100;

            if (registroInstruccion >= 0 && registroInstruccion < 100 && (operacion == LEE || operacion == ESCRIBE
                    || operacion == CARGA || operacion == ALMACENA || operacion == SUMA || operacion == RESTA
                    || operacion == DIVIDE || operacion == MULTIPLICA || operacion == BIFURCA || operacion == BIFURCANEG
                    || operacion == BIFURCACERO || operacion == ALTO || operacion == ENTER || operacion == ENTERSTRING
                    || operacion == SHOWSTRING)) {

                memoria[posicion] = instruccion;
                posicion++;
                posicionMemoria++;

            } else {
                System.out.println("Indice u operacion invalida");
            }
        }

        System.out.println("¡Carga del programa completa!");
        System.out.println("Iniciando la ejecucion del programa...");

        // Recorre la memoria ejecutando los comandos
        for (int i = 0; i < 100 && !alto; i++) { // 'i' es el contador de las instrucciones
            instruccion = memoria[i];
            operacion = instruccion / 100;
            indice = instruccion % 100;

            boolean bif = false;

            if (operacion == LEE) {
                System.out.print("Ingrese un numero entero: ");
                memoria[indice] = entrada.nextInt();
            } else if (operacion == ESCRIBE) {
                System.out.println("Salida: " + memoria[indice]);
            } else if (operacion == CARGA) {
                acumulador = memoria[indice];
            } else if (operacion == ALMACENA) {
                memoria[indice] = acumulador;
            } else if (operacion == SUMA) {
                acumulador += memoria[indice];
            } else if (operacion == RESTA) {
                acumulador -= memoria[indice];
            } else if (operacion == DIVIDE) {
                int valor = memoria[indice];
                if (valor != 0) {
                    acumulador /= valor;
                } else {
                    System.out.println("Error: division por cero");
                    alto = true;
                }
            } else if (operacion == MULTIPLICA) {
                acumulador *= memoria[indice];
            } else if (operacion == BIFURCA) {
                i = indice;
                bif = true;

            } else if (operacion == BIFURCANEG) {
                if (acumulador < 0) {
                    i = indice;
                    bif = true;
                }
            } else if (operacion == BIFURCACERO) {
                if (acumulador == 0) {
                    i = indice;
                    bif = true;
                }
            } else if (operacion == ALTO) {
                System.out.println("Ejecucion finalizada.");
                alto = true;
            }
            if (!bif) {
                i++;
            }
        }
        entrada.close();
    }
}
