package Capitulo_3.ej_extra;

public class CuentaEmpleados {
    private Empleados empleado;
    private double saldo;

    public CuentaEmpleados(Empleados empleado, double saldo) {
        this.empleado = empleado;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void pagarSueldo() {
        double sueldo1 = empleado.getSueldo() * 0.9; // Se deduce el 10% del sueldo
        saldo += sueldo1;

    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

}
