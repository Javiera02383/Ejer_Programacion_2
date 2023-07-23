/* 2.30 (Separación de los digitos en un entero) Escriba una aplicación que reciba del usuario un numero compuesto
por cinco digitos, que separe ese numero en sus digitos individuales y los imprima, cada uno separado de los demas
por tres espacios. Por ejemplo, si el usuario escribe el numero 42339, el programa debe imprimir
4 2 3 3 9
Suponga que el usuario escribe el numero correcto de digitos. ¿Que ocurre cuando escribe un numero con mas
de cinco digitos? ¿Que ocurre cuando escribe un numero con menos de cinco digitos? [Sugerencia: es posible hacer este
ejercicio con las tecnicas que aprendió en este capitulo. Necesitara utilizar las operaciones de división y residuo para
seleccionar cada digito. */

import java.util.Scanner;

public class ej_2_30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Escriba un numero de 5 digitos: ");
        int numero = entrada.nextInt();
                   
        // Obtener los digitos individuales
        int digito1 = numero / 10000;
        int digito2 = (numero % 10000) / 1000;
        int digito3 = (numero % 1000) / 100;
        int digito4 = (numero % 100) / 10;
        int digito5 = numero % 10;
                
        System.out.println(digito1 + "   " + digito2 + "   " + digito3 + "   " + digito4 + "   " + digito5);

        entrada.close();
    }
}
