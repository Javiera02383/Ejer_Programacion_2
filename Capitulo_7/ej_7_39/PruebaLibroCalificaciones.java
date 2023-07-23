package Tareas_unidad_1.Capitulo_7.ej_7_39;

import java.util.Scanner;

public class PruebaLibroCalificaciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero_estudiantes = 3;
        int numero_examenes = 3;
        LibroCalificaciones libroCalificaciones = new LibroCalificaciones(
                "Programacion", numero_estudiantes, numero_examenes);

        for (int i = 0; i < numero_estudiantes; i++) {
            for (int j = 0; j < numero_examenes; j++) {
                System.out.printf("Ingresa la calificacion del examen %d del alumno %d: ", j + 1, i + 1);
                int calificacion = entrada.nextInt();
                libroCalificaciones.establecerCalificacion(i, j, calificacion);
            }
        }

        System.out.printf("\nBienvenido al libro de calificaciones para%n%s%n%n",
                libroCalificaciones.obtenerNombreDelCurso());
        libroCalificaciones.procesarCalificaciones();
        entrada.close();
    }
}