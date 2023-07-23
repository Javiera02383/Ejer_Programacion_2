import java.util.Scanner;

public class ej_5_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-- Buscar el valor menor --");
        System.out.print("Ingrese la cantidad de valores a comparar: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el primer valor: ");
        int menor = entrada.nextInt();

        for (int i = 1; i < cantidad; i++) {
            System.out.print("Ingrese el siguiente valor: ");
            int valor = entrada.nextInt();

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("El valor menor es: " + menor);
        entrada.close();
    }
}