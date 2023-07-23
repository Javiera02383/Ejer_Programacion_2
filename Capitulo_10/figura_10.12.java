// Fig. 10.12: Factura.java
// La clase Factura implementa a PorPagar.

public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    // constructor
 public Factura(String numeroPieza, String descripcionPieza, int cantidad,
 double precioPorArticulo)
 {
 if (cantidad < 0) // valida la cantidad
 throw new IllegalArgumentException (“Cantidad debe ser >= 0”);

if (precioPorArticulo < 0.0) // valida el precioPorArticulo
 throw new IllegalArgumentException(
 “El precio por articulo debe ser >= 0”);

 this.cantidad = cantidad;
this.numeroPieza = numeroPieza;
 this.descripcionPieza = descripcionPieza;
 this.precioPorArticulo = precioPorArticulo;
 } // fin del constructor

    // obtiene el número de pieza
    public String obtenerNumeroPieza() {
        return numeroPieza; // debe validar
    }

    // obtiene la descripción
    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }

    // establece la cantidad
 public void establecerCantidad(int cantidad)
 {
if (cantidad < 0) // valida la cantidad
 throw new IllegalArgumentException (“Cantidad debe ser >= 0”);

 this.cantidad = cantidad;
 }

    // establece el precio por artículo
 public void establecerPrecioPorArticulo(double precioPorArticulo)
 {
 if (precioPorArticulo < 0.0) // valida el precioPorArticulo
 throw new IllegalArgumentException(
 “El precio por articulo debe ser >= 0”);

 this.precioPorArtculo = precioPorArticulo;
 }

    // obtiene el precio por artículo
    public double obtenerPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // devuelve representación String de un objeto Factura
 @Override
 public String toString()
 {
 return String.format(“%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f”,
 “factura”, “numero de pieza”, obtenerNumeroPieza(),
obtenerDescripcionPieza(),
 “cantidad”, obtenerCantidad(), “precio por articulo”, obtenerPrecioPor-Articulo());
 }

    // método requerido para realizar el contrato con la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo(); // calcula el costo total
    }
} // fin de la clase Factura