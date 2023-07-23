package ej_8_14;

public class PruebaFecha {

    public static void main(String[] args) {
        Fecha f1 = new Fecha(2, 28, 2020);
        Fecha f2 = new Fecha("Enero", 12, 2020);
        Fecha f3 = new Fecha(365, 2019);
        System.out.printf("%s%n%s%n%s%n%n", f1, f1.letrasNumeros(), f1.diaDelAnio());
        System.out.printf("%s%n%s%n%s%n%n", f2, f2.letrasNumeros(), f2.diaDelAnio());
        System.out.printf("%s%n%s%n%s%n%n", f3, f3.letrasNumeros(), f3.diaDelAnio());

    }
}
