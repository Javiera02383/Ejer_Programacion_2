import java.util.Scanner;

public class ej_5_25 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int filas = 4;
        System.out.print("\nImprimir un rombo en pantalla");

        while (filas % 2 == 0 || filas < 1 || filas > 19) {

            System.out.print("\nIntroduzca un entero impar para la dimensión del rombo (1-19): ");
            filas = entrada.nextInt();
        }

        for (int i = 1; i <= ((filas / 2) + 1); i++) {

            for (int k = 1; k <= filas / 2 - i + 1; k++)
                System.out.printf(" ");
            for (int j = (filas / 2) - i + 2; j <= (filas / 2) + i; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }

        for (int l = 1; l <= filas / 2; l++) {
            for (int m = 1; m <= l; m++) {

                System.out.printf(" ");
            }
            for (int n = l + 1; n <= filas - l; n++)
                System.out.printf("*");
            System.out.println();
        }
        entrada.close();
    }
}