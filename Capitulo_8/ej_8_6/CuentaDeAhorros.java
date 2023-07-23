package ej_8_6;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoInicial) {
        this.saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public String getSaldoAhorros() {
        return String.format("%.2f", saldoAhorros);
    }
}
