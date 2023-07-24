package Capitulo_3.ej_3_13;

import java.util.Scanner;

public class PruebaEmpleado {

        public static void main(String[] args) {

                String nombre;
                String apellido;
                double salario;

                Empleado empleado1 = new Empleado();
                Empleado empleado2 = new Empleado();

                Scanner input = new Scanner(System.in);

                System.out.println("DATOS INICIALES");
                empleado1.obtenerDatosEmpleado();

                System.out.println("\nREGISTRO EMPLEADO 1");

                System.out.print("Ingrese primer nombre: ");
                nombre = input.nextLine();
                empleado1.establecerPrimNom(nombre);
                System.out.printf("Nombre asignado: %s", empleado1.obtenerPrimNom());

                System.out.print("\nIngrese Apellido Paterno: ");
                apellido = input.nextLine();
                empleado1.establecerApePat(apellido);
                System.out.printf("Apellido asignado: %s", empleado1.obtenerApePat());

                System.out.print("\nIngrese salario mensual: ");
                salario = input.nextDouble();
                empleado1.establecerSalMen(salario);
                System.out.printf("Salario mensual asigando: $%.2f", empleado1.obtenerSalMen());
                input.nextLine();// se utiliza para limpiar el buffer del teclado por var int

                System.out.println("\n\nREGISTRO EMPLEADO 2");

                System.out.print("Ingrese primer nombre: ");
                nombre = input.nextLine();
                empleado2.establecerPrimNom(nombre);
                System.out.printf("Nombre asignado: %s", empleado2.obtenerPrimNom());

                System.out.print("\nIgrese Apellido Paterno: ");
                apellido = input.nextLine();
                empleado2.establecerApePat(apellido);
                System.out.printf("Nombre asigando: %s", empleado2.obtenerApePat());

                System.out.print("\nIngrese salario mensual: ");
                salario = input.nextDouble();
                empleado2.establecerSalMen(salario);
                System.out.printf("Salario mensual asigando: $%.2f", empleado2.obtenerSalMen());

                System.out.println("");

                System.out.printf("\nSalario anual de %s %s: $%.2f", empleado1.obtenerPrimNom(),
                                empleado1.obtenerApePat(),
                                empleado1.obtenerSalMen() * 12);
                System.out.printf("\nSalario anual de %s %s: $%.2f", empleado2.obtenerPrimNom(),
                                empleado2.obtenerApePat(),
                                empleado2.obtenerSalMen() * 12);
                System.out.print("\n\nSE APLICA AUMENTO SALARIAL DEL 10%, ");
                System.out.println("los nuevos salarios son:");
                System.out.printf("\nSalario anual de %s %s: $%.2f", empleado1.obtenerPrimNom(),
                                empleado1.obtenerApePat(),
                                (empleado1.obtenerSalMen() * 1.10) * 12);
                System.out.printf("\nSalario anual de %s %s: $%.2f", empleado2.obtenerPrimNom(),
                                empleado2.obtenerApePat(),
                                (empleado2.obtenerSalMen() * 1.10) * 12);
                input.close();
        }
}