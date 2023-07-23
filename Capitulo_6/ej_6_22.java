import java.util.Scanner;

public class ej_6_22 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Conversiones de Temperatura\n");

        while (true) {

            String mensaje = "\nSeleccione una equivalencia%n%s%n%s%n%s%n%s";
            System.out.printf(mensaje, " 1. Celsius a Fahrenheit", " 2. Fahrenheit a Celsius", " 3. Salir", "\n > ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("\nIngrese la temperatura a convertir a Fahrenheit: ");
                int temp = entrada.nextInt();
                System.out.printf("\nTemperatura en Fahrenheit: %.2f\u00B0%n", fahrenheit(temp));
            } else if (opcion == 2) {
                System.out.print("\nIngrese la temperatura a convertir a Celsius: ");
                int temp = entrada.nextInt();
                System.out.printf("\nTemperatura en Celsius: %.2f\u00B0%n", centigrados(temp));
            } else if (opcion == 3) {
                System.out.println("Gracias por usar el programa");
                break;
            } else {
                System.out.println("ERROR - Ingrese un valor valido\n");
            }
        }
        entrada.close();
    }

    public static double fahrenheit(double temp) {
        return 9.0 / 5.0 * temp + 32;
    }

    public static double centigrados(double temp) {
        return 5.0 / 9.0 * (temp - 32);
    }
}
