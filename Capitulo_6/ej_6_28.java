import java.util.Scanner;

public class ej_6_28 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = entrada.nextDouble();

        int puntos = puntosCalidad(promedio);

        System.out.println("Puntos de calidad: " + puntos);

        entrada.close();
    }

    public static int puntosCalidad(double promedio) {
        if (promedio >= 90 && promedio <= 100) {
            return 4;
        } else if (promedio >= 80 && promedio <= 89) {
            return 3;
        } else if (promedio >= 70 && promedio <= 79) {
            return 2;
        } else if (promedio >= 60 && promedio <= 69) {
            return 1;
        } else {
            return 0;
        }
    }
}
