
import java.util.Scanner;

public class PruebaFactura {

	public static void main(String[] args) {

		String numero,
				descripcion;
		int cantidad;
		double precio;

		Scanner input = new Scanner(System.in);

		System.out.println("====DATOS INICIALES====");

		Factura1 factura1 = new Factura1();

		factura1.obtenerDatosFactura();

		System.out.print("\nIngrese numero de pieza: ");
		numero = input.nextLine();
		factura1.establecerNumPza(numero);
		System.out.println("Numero de pieza: " + factura1.obtenerNumPza());

		System.out.print("\nIngrese descripcion de pieza: ");
		descripcion = input.nextLine();
		factura1.establecerDescPza(descripcion);
		System.out.println("Descripcion: " + factura1.obtenerDescPza());

		System.out.print("\nIngrese cantidad de piezas: ");
		cantidad = input.nextInt();
		factura1.establecerQtyPzas(cantidad);
		System.out.println("Cantidad: " + factura1.obtenerQtyPzas());

		System.out.print("\nIngrese precio de pieza: ");
		precio = input.nextDouble();
		factura1.establecerPrecPza(precio);
		System.out.println("Precio x pza: " + factura1.obtenerPrecPza());

		System.out.println("");// salto de linea
		factura1.obtenerMontoFactura();
		input.close();
	}
}