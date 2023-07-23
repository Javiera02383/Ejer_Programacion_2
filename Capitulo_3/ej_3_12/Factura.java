/*(La clase Factura) Cree una clase llamada Factura que una ferretería podría utilizar para representar una
factura para un artículo vendido en la tienda. Una Factura debe incluir cuatro piezas de información como variables
de instancia: un número de pieza (tipo String), la descripción de la pieza (tipo String), la cantidad de artículos de ese
tipo que se van a comprar (tipo int) y el precio por artículo (double). Su clase debe tener un constructor que inicialice
las cuatro variables de instancia. Proporcione un método establecer y un método obtener para cada variable de
instancia. Además, proporcione un método llamado obtenerMontoFactura, que calcule el monto de la factura (es
decir, que multiplique la cantidad de artículos por el precio de cada uno) y después devuelva ese monto como un valor
double. Si la cantidad no es positiva, debe establecerse en 0. Si el precio por artículo no es positivo, debe establecerse
en 0.0. Escriba una aplicación de prueba llamada PruebaFactura, que demuestre las capacidades de la clase Factura. */

public class Factura {

	private String numPza;
	private String descPza;
	private int qtyPzas;
	private double precPza;

	// Constructor
	public Factura() {
		this.numPza = "A0000";
		this.descPza = "Vacio";
		this.qtyPzas = 0;
		this.precPza = 0.0;
	}

	public void establecerNumPza(String numPza) {
		this.numPza = numPza;
	}

	public String obtenerNumPza() {
		return numPza;
	}

	public void establecerDescPza(String descPza) {
		this.descPza = descPza;
	}

	public String obtenerDescPza() {
		return descPza;
	}

	public void establecerQtyPzas(int qtyPzas) {
		if (qtyPzas > 0) {
			this.qtyPzas = qtyPzas;
		} else {
			System.out.println(" VALOR ERRONEO ");
		}
	}

	public int obtenerQtyPzas() {
		return qtyPzas;
	}

	public void establecerPrecPza(double precPza) {
		if (precPza > 0) {
			this.precPza = precPza;
		} else {
			System.out.println(" VALOR ERRONEO ");
		}
	}

	public double obtenerPrecPza() {
		return precPza;
	}

	public void obtenerMontoFactura() {
		System.out.printf("El monto de la factura es: $%.2f", qtyPzas * precPza);
	}

	public void obtenerDatosFactura() {
		System.out.println("Numero de pieza: " + numPza +
				"\nDescripcion: " + descPza +
				"\nCantidad de pzas : " + qtyPzas +
				"\nPrecio x pza: " + precPza);
	}
}