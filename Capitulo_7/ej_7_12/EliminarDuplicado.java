/* 7.12 Eliminación de duplicados) Use un arreglo unidimensional para resolver el
siguiente problema: escriba una aplicación que reciba como entrada cinco números,
cada uno de los cuales debe estar entre 10 y 100, inclusive. A medida que se lea
cada número, muéstrelo solamente si no es un duplicado de un número que ya se haya
leído. Prepárese para el “peor caso”, en el que los cinco números son diferentes. 
Use el arreglo más pequeño que sea posible para resolver este problema. Muestre el
conjunto completo de valores únicos introducidos, después de que el usuario 
introduzca cada nuevo valor.*/

import java.util.Scanner;

public class EliminarDuplicado {

	private enum Imprimir {
		SI, NO
	};

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] arreglo = new int[5];

		System.out.println("APLICACION QUE RECIBE COMO ENTRADA CINCO NUMEROS, ENTRE 10 Y 100, Y QUE MUESTRA " +
				"SOLO LOS VALORES NO REPETIDOS\n");

		// for que llena el arreglo e imprime a medida que se leen los numeros
		// ingresados por 1ra vez
		for (int i = 0; i < arreglo.length; i++) {// for principal 1

			System.out.printf("Introduce un numero entre 10 y 100 %n%s",
					"----> ");
			int n = entrada.nextInt();
			arreglo[i] = n;

			while (n < 10 || n > 100) {
				System.out.printf("Valor erroneo, intoruduce un numero entre 10 y 100 %n%s",
						"----> ");
				n = entrada.nextInt();
				arreglo[i] = n;
			}

			if (i == 0)// Al estar el primer numero ingresado en el indice cero se imprime sin
						// evaluacion
				System.out.println("\n" + arreglo[i] + " Numero valido, no duplicado\n");

			else if (i != 0) {

				Imprimir estado = Imprimir.SI;

				for (int j = 0; j < i; j++) { // for para comparar los elementos antes introducidos
					if (arreglo[i] == arreglo[j]) {
						estado = Imprimir.NO;
						break;// Si se encuentra un numero igual se rompe el ciclo en donde lo haya encontrado
					}
				}

				if (estado == Imprimir.SI)
					System.out.println("\n" + arreglo[i] + " Numero valido, no duplicado\n");

			} // Fin de else if 1

		} // Fin de for principal 1

		System.out.print("Valores unicos introducidos: ");

		// for que imprime en conjunto los valores unicos introducidos
		for (int i = 0; i < arreglo.length; i++) { // for principal 2

			if (i == 0)
				System.out.printf("%d ", arreglo[i]);

			else if (i != 0) {

				Imprimir estado = Imprimir.SI;

				for (int j = 0; j < i; j++) {
					if (arreglo[i] == arreglo[j]) {
						estado = Imprimir.NO;
						break;
					}
				}

				if (estado == Imprimir.SI)
					System.out.printf("- %d ", arreglo[i]);

			} // Fin de else if 2

		} // Fin de for principal 2
		entrada.close();
	}// Fin de metodo main

}// Fin de clase
