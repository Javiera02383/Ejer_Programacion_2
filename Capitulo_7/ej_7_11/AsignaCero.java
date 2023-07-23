/*Escriba instrucciones que realicen las siguientes
operaciones con arreglos unidimensionales:
a) Asignar cero a los 10 elementos del arreglo cuentas de tipo entero.
b) Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero.
c) Imprima los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas. */

import java.util.Scanner;

public class AsignaCero {
    public static void main(String[] args) {
        System.out.println("*****     Programa de arreglos     *****");
        System.out.println("*****       Menú de Opciones       *****");
        System.out.println("1- Asigna cero a los 10 elementos de un arreglo cuentas de tipo entero");
        System.out.println("2- Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero");
        System.out.println(
                "3- Imprima los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas");
        System.out.println("Escriba una opción del 1 al 3");

        Scanner entrada = new Scanner(System.in);
        int menuopcion = entrada.nextInt();

        while (menuopcion <= 0 || menuopcion > 3) {
            System.out.println("\nError, debe ingresar un numero entre 1 y 3");
            menuopcion = entrada.nextInt();
        }

        if (menuopcion == 1) {

            System.out.println("\nEsta opción asigna cero a los 10 elementos de un arreglo cuentas de tipo entero");

            int[] cuentas = new int[10];

            System.out.printf("%s%8s\n", "Indice", "Valor");

            for (int contador = 0; contador < cuentas.length; contador++)
                System.out.printf("%5d%8d\n", contador, cuentas[contador]);
        } else if (menuopcion == 2) {
            System.out.println("Este programa suma uno a cada uno de los 15 elementos del arreglo bono de tipo entero");
            int[] bono = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

            for (int element : bono) {
                bono[element] += 1;
            }
            for (int value : bono) {
                System.out.println(bono[+value]);
            }
        } else if (menuopcion == 3) {
            System.out.println(
                    "Esta programa imprime los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas");
            int[] mejoresPuntuaciones = { 0, 1, 2, 3, 4 };

            for (int value : mejoresPuntuaciones) {
                System.out.println(mejoresPuntuaciones[value]);
            }
        }
        entrada.close();
    }

}