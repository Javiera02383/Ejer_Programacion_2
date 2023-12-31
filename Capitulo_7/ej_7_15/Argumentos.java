/*(Argumentos de línea de comandos) Modifique la figura 7.2,
de manera que el tamaño del arreglo se especifique 
mediante el primer argumento de línea de comandos.
Si no se suministra un argumento de línea de comandos,
use 10 como el valor predeterminado del arreglo. */

public class Argumentos {
	int[] arreglo;
	int t;

	public Argumentos(int tamano) {
		t = tamano;
	}

	public void procesar() {
		arreglo = new int[t];

		System.out.println("\nTamaño recibido por linea de comandos: ");
		System.out.printf("%6s%12s\n", "Indice:", "Valor:");

		for (int i = 0; i < arreglo.length; i++) {
			System.out.printf("%6d%12d\n", i, arreglo[i]);
		}
	}
}