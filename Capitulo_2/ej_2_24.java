/* 2.24 (Enteros menor y mayor) Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros
mayor y menor en el grupo. Use solamente las técnicas de programación que aprendió en este capítulo. */

import java.util.Scanner;
 
public class ej_2_24 {
 
    public static void main(String[] args) {
 
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        System.out.println("Introduce el Primer entero:");
        n1 = entrada.nextInt();

        System.out.println("Introduce el Segundo entero:");
        n2 = entrada.nextInt();

        System.out.println("Introduce el Tercer entero:");
        n3 = entrada.nextInt();

        System.out.println("Introduce el Cuarto entero:");
        n4 = entrada.nextInt();

        System.out.println("Introduce el Quinto entero:");
        n5 = entrada.nextInt();

        int menor = n1;

        if (n2<menor)
        menor = n2;
        if (n3<menor)
        menor = n3;
        if (n4<menor)
        menor = n4;
        if (n5<menor)
        menor = n5;


        int mayor = n1;

        if (n2>mayor)
        mayor = n2;
        if (n3>mayor)
        mayor = n3;
        if (n4>mayor)
        mayor = n4;
        if (n5>mayor)
        mayor = n5;

        System.out.printf("El menor de los numeros es: %d%n", menor);
        System.out.printf("El mayor de los numeros es: %d%n", mayor);
    
        entrada.close();

    }
}