
import java.security.SecureRandom;
import java.util.Scanner;

public class ej_6_29 {
    private enum Moneda {
        CARA, CRUZ
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int caras = 0;
        int cruces = 0;

        System.out.println("Bienvenido al lanzamiento de monedas!");

        while (true) {
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("1. Lanzar moneda");
            System.out.println("2. Salir");
            System.out.print(">");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                Moneda resultado = tirar(random);
                if (resultado == Moneda.CARA) {
                    caras++;
                } else {
                    cruces++;
                }
                System.out.println("\nResultado: " + resultado);
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("\nOpción inválida. Intente de nuevo.");
            }
        }

        System.out.println("\nResultados finales:");
        System.out.println("Caras: " + caras);
        System.out.println("Cruces: " + cruces);

        entrada.close();
    }

    public static Moneda tirar(SecureRandom random) {
        int lado = random.nextInt(2); // Genera un número aleatorio 0 o 1
        return (lado == 0) ? Moneda.CARA : Moneda.CRUZ;
    }
}
