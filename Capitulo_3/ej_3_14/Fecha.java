package Capitulo_3.ej_3_14;

public class Fecha {

    // tres variables de instancia
    private int mes;
    private int dia;
    private int ano;

    // constructor que inicialice las tres variables de instancia
    public Fecha(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    // setMes, establecer
    public void setMes(int mes) {
        if (mes <= 12 && mes > 0) {

            this.mes = mes;
        } else {
            System.out.printf("Ingresa un valor valido");
        }
    }

    // getMes, obtener
    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void mostrarFecha() {
        System.out.printf("%02d/%02d/%d", mes, dia, ano);
    }
}
