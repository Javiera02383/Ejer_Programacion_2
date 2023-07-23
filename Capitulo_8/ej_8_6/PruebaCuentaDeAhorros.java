package ej_8_6;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04); // tasa de interés al 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        System.out.println("Saldos iniciales:");
        System.out.println("Ahorrador 1: L. " + ahorrador1.getSaldoAhorros());
        System.out.println("Ahorrador 2: L. " + ahorrador2.getSaldoAhorros());

        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            System.out.println("\nMes " + i + ":");
            System.out.println("Ahorrador 1: L. " + ahorrador1.getSaldoAhorros());
            System.out.println("Ahorrador 2: L. " + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05); // tasa de interés al 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("\nDespués de un mes con una tasa de interés de 5%:");

        System.out.println("Ahorrador 1: L. " + ahorrador1.getSaldoAhorros());
        System.out.println("Ahorrador 2: L. " + ahorrador2.getSaldoAhorros());
    }
}
