package ej_8_14;

import java.util.Arrays;

public class Fecha {

    private int mes;

    private int dia;

    private int anio;
    // Contiene los dias que tiene cada mes
    private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final int[] diasPorMesB = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    // Contiene los nombres de cada mes
    private static final String[] meses = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    public Fecha(int mes, int dia, int anio) {
        if (mes <= 0 || mes > 12)// revisa que el mes este en el rango
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1 - 12");

        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))// revisa si dia esta en el rango para mes
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");

        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))// revisa si es año
                                                                                              // bisiesto, cuando mes es
                                                                                              // 2 y dia es 29
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y año especificados");

        if (anio < 0)// revisa si dia esta en rango positivo
            throw new IllegalArgumentException("año (" + anio + ") fuera de rango, el año debe ser mayor a cero");

        this.mes = mes;
        this.dia = dia;
        this.anio = anio;

        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
    }

    // Calcula el mes dado el dia y el año (en caso que sea bisiesto)

    public Fecha(int dias, int anio) {
        if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {// si es bisiesto
            if (dias < 0 || dias > 366)
                throw new IllegalArgumentException(
                        "La cantidad de dias en año bisiesto no puede ser mayor a 366 ni menor a 0");
        } else {
            if (dias < 0 || dias > 365)
                throw new IllegalArgumentException(
                        "La cantidad de dias en año no bisiesto no puede ser mayor a 365 ni menor a 0");
        }

        mes = 1;
        if ((anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0)))) {// si año es bisiesto
            while (dias > diasPorMesB[mes]) {
                dias -= diasPorMesB[mes];
                mes++;
            }
        } else {// si no es bisiesto
            while (dias > diasPorMes[mes]) {
                dias -= diasPorMes[mes];
                mes++;
            }
        }
        dia = dias;
        this.anio = anio;
    }

    // Recibe el mes como un String mientras el dia y el año como enteros

    public Fecha(String m, int dia, int anio) {
        int mes = Arrays.binarySearch(meses, m);
        if (mes < 1)
            throw new IllegalArgumentException("El mes esta mal escrito");

        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");

        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y año especificados");

        if (anio < 0)
            throw new IllegalArgumentException("año (" + anio + ") fuera de rango, el año debe ser mayor a cero");

        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    // True si es año bisiesto, falso para cuando no lo es

    public boolean esBisiesto() {
        boolean div4 = anio % 4 == 0; // primer condicion de año bisiesto
        boolean anioSecular = anio % 100 == 0; // debe ser falso para que sea biciesto
        boolean div400 = anio % 400 == 0; // condicion unica para años seculares
        return div400 || (div4 && !anioSecular);
    }

    // Hace el cambio de dia con base en la cantidad de dias del mes.
    public void siguienteDia() {
        if (esBisiesto() && mes == 2 && dia == diasPorMes[mes])
            dia++;
        else if (dia == diasPorMes[mes] || (mes == 2 && dia == 29)) {
            dia = 1;
            siguienteMes();
        } else
            dia++;
    }

    // cambio de mes, si el mes es 12 cambia de año

    public void siguienteMes() {
        if (mes == 12) {
            mes = 1;
            siguienteAnio();
        } else
            mes++;
    }

    // cambio de año

    public void siguienteAnio() {
        anio++;
    }

    // formato "Mes DD, AAAA"

    public String letrasNumeros() {
        return String.format("%s %d, %d", meses[mes], dia, anio);
    }

    // formato "DDD AAAA"
    public String diaDelAnio() {
        int dias = 0;
        if ((anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0)))) {// si año es bisiesto
            for (int actual = 1; actual < mes; actual++) {
                dias += diasPorMesB[actual];
            }

        } else {// si no es bisiesto
            for (int actual = 1; actual < mes; actual++) {
                dias += diasPorMes[actual];
            }
        }
        dias += dia;
        return String.format("%3d %d", dias, anio);
    }

    // formato mm/dd/aaaa

    public String toString() {
        return String.format("%2d/%2d/%2d", mes, dia, anio);
    }
}
