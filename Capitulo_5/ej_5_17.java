import java.util.Scanner;

public class ej_5_17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero_producto;
        int cantidad_producto;
        double total_ventas = 0;
        double precio_producto = 0;

        System.out.println("\nUn vendedor minorista en línea vende cinco productos cuyos precios son: ");
        System.out.println("Producto 1: $2.98");
        System.out.println("Producto 2: $4.50");
        System.out.println("Producto 3: $9.98");
        System.out.println("Producto 4: $4.49");
        System.out.println("Producto 5: $6.87");

        while (true) {
            System.out.print("\nIngrese el número del producto (1-5), ('0' para salir): ");
            numero_producto = entrada.nextInt();

            if (numero_producto == 0) {
                break;
            }

            switch (numero_producto) {
                case 0:
                    break;
                case 1:
                    precio_producto = 2.98;
                    break;
                case 2:
                    precio_producto = 4.50;
                    break;
                case 3:
                    precio_producto = 9.98;
                    break;
                case 4:
                    precio_producto = 4.49;
                    break;
                case 5:
                    precio_producto = 6.87;
                    break;
                default:
                    System.out.println("Número de producto inválido. Introduzca uno nuevo.");
                    continue;
            }

            System.out.print("Ingrese la cantidad vendida: ");
            cantidad_producto = entrada.nextInt();

            double total_producto = precio_producto * cantidad_producto;
            total_ventas += total_producto;
        }

        System.out.println("\nEl total de ventas es: $" + total_ventas);
        entrada.close();
    }
}
