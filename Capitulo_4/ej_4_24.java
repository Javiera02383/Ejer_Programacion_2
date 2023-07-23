//(Validar la entrada del usuario) Modifique el programa de la figura 4.12 para validar sus entradas. Para
//cualquier entrada, si el valor introducido es distinto de 1 o 2, debe seguir iterando hasta que el usuario introduzca un
//valor correcto.

import java.util.Scanner;

public class ej_4_24 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // inicialización de las variables en declaraciones
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

        System.out.print("Analisis de los resultados de examen de 10 estudiantes\n");

        // procesa 10 estudiantes, usando ciclo controlado por contador
        while (contadorEstudiantes <= 10) {
            // pide al usuario la entrada y obtiene el valor
            System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            int resultado = entrada.nextInt();

            while (resultado != 1 && resultado != 2) {
                {
                    System.out.print("Ingrese un valor valido. Escriba el resultado (1 = aprobado, 2 = reprobado): ");
                    resultado = entrada.nextInt();
                }
            }

            // if...else anidado en la instrucción while
            if (resultado == 1)
                aprobados = aprobados + 1;
            else
                reprobados = reprobados + 1;
            // i ncrementa contadorEstudiantes, para que el ciclo termine en un momento dado
            contadorEstudiantes = contadorEstudiantes + 1;
        }

        // fase de terminación; prepara y muestra los resultados
        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

        // determina si más de 8 estudiantes aprobaron
        if (aprobados > 8)
            System.out.println("Bono para el instructor!");

        entrada.close();
    }
}