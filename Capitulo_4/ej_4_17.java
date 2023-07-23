import java.util.Scanner;

public class ej_4_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Registro de Kilometraje de Gasolina");
        System.out.println("Ingrese '0' para salir");

        while (true) {
            System.out.print("\nIngrese los Kilómetros conducidos: ");
            int kilometros = entrada.nextInt();

            if (kilometros == 0) {
                break;
            }

            System.out.print("\nIngrese los Litros usados: ");
            int litros = entrada.nextInt();

            double kilometrosPorLitro = (double) kilometros / litros;

            System.out.printf("\nKilómetros por litro en este viaje: %.2f\n", kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;

            double promedioKilometrosPorLitro = (double) totalKilometros / totalLitros;

            System.out.printf("Kilómetros por litro en todos los viajes: %.2f\n", promedioKilometrosPorLitro);
        }

        System.out.println("¡Gracias por usar la aplicación!");
        entrada.close();
    }
}
