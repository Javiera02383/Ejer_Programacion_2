package Tareas_unidad_1.Capitulo_3.ej_3_14;

import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {

        int mes, dia, ano;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el mes: ");
        mes = input.nextInt();

        System.out.print("Ingrese el día: ");
        dia = input.nextInt();

        System.out.print("Ingrese el año: ");
        ano = input.nextInt();

        Fecha fecha = new Fecha(mes, dia, ano);

        System.out.print("La fecha ingresada es: ");
        fecha.mostrarFecha();

        input.close();

    }
}
