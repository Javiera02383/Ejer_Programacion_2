// Fig. 10.12: Factura.java
// La clase Factura implementa a PorPagar.

public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0) // valida la cantidad
            throw new IllegalArgumentException("Cantidad debe ser >= 0");

        if (precioPorArticulo < 0.0) // valida el precioPorArticulo
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0.0");

        this.cantidad = cantidad;
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.precioPorArticulo = precioPorArticulo;
    }

    // obtiene el número de pieza
    public String obtenerNumeroPieza() {
        return numeroPieza; // debe validar
    }

    // obtiene la descripción
    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    // establece la cantidad
    public void establecerCantidad(int cantidad) {
        if (cantidad < 0) // valida la cantidad
            throw new IllegalArgumentException("La cantidad debe ser >= 0");

        this.cantidad = cantidad;
    }

    // obtener cantidad
    public int obtenerCantidad() {
        return cantidad;
    }

    // establece el precio por artículo
    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por articulo debe ser >= 0.0");

        this.precioPorArticulo = precioPorArticulo;
    }

    // obtiene el precio por artículo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Devuelve una representación String del objeto
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "factura", "numero de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
                "cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo());
    }

    // Devuelve el monto total de pago
    @Override
    public double obtenerMontoPago() {// < metodo requerido para realizar el contraro con la interfaz PorPagar
        return obtenerCantidad() * obtenerPrecioPorArticulo();// < Calcula el costo total
    }
}
