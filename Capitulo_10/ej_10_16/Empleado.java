
public abstract class Empleado implements PorPagar { // CAMBIO-IMPLEMENTAR 'PorPagar'
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    // constructor
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    // método obtenerMontoPago que invoca al método ingresos //CAMBIO
    public double obtenerMontoPago() {
        return ingresos();
    }

    // devuelve representación String de un objeto Empleado
    @Override
    public String toString() {
        return String.format("%s %s%nnúmero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }

    // metodo abstracto sobreescrito por las subclases concretas
    public abstract double ingresos();// aquí no hay implementación
}
