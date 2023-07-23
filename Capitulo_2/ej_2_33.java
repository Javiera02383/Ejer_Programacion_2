/* 2.33 (Calculadora del indice de masa corporal) Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del
usuario en kilogramos y la altura en metros), para que luego calcule y muestre el indice de masa corporal del usuario.
Muestre ademas la siguiente informacion del Departamento de Salud y Servicios Humanos/Instituto Nacional de
Salud para que el usuario pueda evaluar su BMI:
VALORES DE BMI
Bajo peso: menos de 18.5
Normal: entre 18.5 y 24.9
Sobrepeso: entre 25 y 29.9
Obeso: 30 o mas */

import java.util.Scanner;

public class ej_2_33 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double pKilogramos = entrada.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double aMetros = entrada.nextDouble();

        // Calcular BMI
        double bmi = pKilogramos / (aMetros * aMetros);
        System.out.printf("\nSu BMI es: %.2f%n", bmi);

        // Verificar rango en que se encuentra el BMI
        if (bmi < 18.5) {
            System.out.println("Esta en el rango de Bajo peso.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Esta en el rango Normal.");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Esta en el rango Sobrepeso.");
        } else if (bmi >= 30) {
            System.out.println("Esta en el rango Obeso.");
        }

        // Mostrar informacion
        System.out.println("\n--- VALORES DE BMI ---");
        System.out.println(" Bajo peso: menos de 18.5");
        System.out.println(" Normal: entre 18.5 y 24.9");
        System.out.println(" Sobrepeso: entre 25 y 29.9");
        System.out.println(" Obeso: 30 o más");

        entrada.close();
    }

}