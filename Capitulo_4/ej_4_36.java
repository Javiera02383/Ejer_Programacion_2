
import java.util.Scanner;

public class ej_4_36 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] lados = new int[3];

        System.out.println("Ingrese los tres lados del triángulo: ");

        for (int i = 0; i < 3; i++) {
            System.out.print("Medida del lado " + (i + 1) + " del triángulo: ");
            lados[i] = entrada.nextInt();
        }

        int l1 = lados[0];
        int l2 = lados[1];
        int l3 = lados[2];

        boolean esRectangulo = (l1 * l1 == l2 * l2 + l3 * l3) ||
                (l2 * l2 == l1 * l1 + l3 * l3) ||
                (l3 * l3 == l1 * l1 + l2 * l2);

        if (esRectangulo) {
            System.out.println("\nLos lados ingresados pueden representar los lados de un triángulo rectángulo.");
        } else {
            System.out.println("\nLos lados ingresados no pueden representar los lados de un triángulo rectángulo.");
        }
        entrada.close();
    }
}