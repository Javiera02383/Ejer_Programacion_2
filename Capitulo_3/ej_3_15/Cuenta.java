/*3.15 (Eliminar código duplicado en el método main) En la clase PruebaCuenta de la figura 3.9, el método main
contiene seis instrucciones (líneas 13-14, 15-16, 28-29, 30-31, 40-41 y 42-43), cada una de las cuales muestra en
pantalla el nombre y saldo de un objeto Cuenta. Estudie estas instrucciones y notará que difieren sólo en el objeto
Cuenta que se está manipulando: cuenta1 o cuenta2. En este ejercicio definirá un nuevo método mostrarCuenta que contiene una copia de esa instrucción de salida. El parámetro del método será un objeto Cuenta y el método imprimirá
en pantalla el nombre y saldo de ese objeto. Después usted sustituirá las seis instrucciones duplicadas en main con
llamadas a mostrarCuenta, pasando como argumento el objeto Cuenta específico a mostrar en pantalla.
Modifique la clase PruebaCuenta de la figura 3.9 para declarar el siguiente método mostrarCuenta después de
la llave derecha de cierre de main y antes de la llave derecha de cierre de la clase PruebaCuenta:
public static void mostrarCuenta(Cuenta cuentaAMostrar)
{
// coloque aquí la instrucción que muestra en pantalla
// el nombre y el saldo de cuentaAMostrar
}
Sustituya el comentario en el cuerpo del método con una instrucción que muestre el nombre y el saldo de
cuentaAMostrar.
Recuerde que main es un método static, por lo que puede llamarse sin tener que crear primero un objeto de
la clase en la que se declara main. También declaramos el método mostrarCuenta como un método static. Cuando
main necesita llamar a otro método en la misma clase sin tener que crear primero un objeto de esa clase, el otro método
también debe declararse como static.
Una vez que complete la declaración de mostrarCuenta, modifique main para reemplazar las instrucciones que
muestran el nombre y saldo de cada Cuenta con llamadas a mostrarCuenta; cada una debe recibir como argumento el
objeto cuenta1 o cuenta2, según sea apropiado. Luego, pruebe la clase PruebaCuenta actualizada para asegurarse de
que produzca la misma salida que se muestra en la figura 3.9. */

public class Cuenta {

	private String nombre;
	private double saldo;

	// Constructor
	public Cuenta(String nombre, double saldo) {

		this.nombre = nombre;

		if (saldo > 0.0)
			this.saldo = saldo;
	}

	public void depositar(double montoDeposito) {
		if (montoDeposito > 0.0)
			this.saldo = saldo + montoDeposito;
	}

	public void retirar(double montoRetiro) {
		if (montoRetiro > 0 && montoRetiro <= saldo) {
			this.saldo = saldo - montoRetiro;
		} else if (montoRetiro > saldo) {
			System.out.println("El monto a retirar excede el saldo de la cuenta.\n");
		} else {
			System.out.println("Valor invalido\n");
		}
	}

	public double obtenerSaldo() {
		return saldo;
	}

	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return nombre;
	}
}