
import java.util.Scanner; // Importa la clase Scanner del paquete java.util

// Clase Punto, para representar los puntos en cada figura
class Punto {
    private double x; // Variable de instancia privada para la coordenada x
    private double y; // Variable de instancia privada para la coordenada y

    public Punto(double x, double y) { // Constructor que recibe las coordenadas x e y
        this.x = x;
        this.y = y;
    }

    public double getX() { // Método getter para obtener la coordenada x
        return x;
    }

    public double getY() { // Método getter para obtener la coordenada y
        return y;
    }
}

// Clase Cuadrilatero (superclase)
class Cuadrilatero {
    private Punto punto1; // Variable de instancia privada para el primer punto
    private Punto punto2; // Variable de instancia privada para el segundo punto
    private Punto punto3; // Variable de instancia privada para el tercer punto
    private Punto punto4; // Variable de instancia privada para el cuarto punto

    public Cuadrilatero(Punto punto1, Punto punto2, Punto punto3, Punto punto4) { // Constructor que recibe los cuatro
                                                                                  // puntos
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public Punto getPunto1() { // Método getter para obtener el primer punto
        return punto1;
    }

    public Punto getPunto2() { // Método getter para obtener el segundo punto
        return punto2;
    }

    public Punto getPunto3() { // Método getter para obtener el tercer punto
        return punto3;
    }

    public Punto getPunto4() { // Método getter para obtener el cuarto punto
        return punto4;
    }

    public double calcularArea() {
        // Implementa el Calculo del Area especifico del cuadrilatero
        return 0.0; // Area del cuadrilátero se devuelve como 0.0
    }
}

// Clase Trapezoide (subclase de Cuadrilatero)
class Trapezoide extends Cuadrilatero {

    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) { // Constructor que recibe los cuatro
                                                                                // puntos y los pasa al constructor de
                                                                                // la superclase
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Calculo Area del trapecio
        double baseMayor = Math.abs(getPunto1().getX() - getPunto2().getX());
        double baseMenor = Math.abs(getPunto3().getX() - getPunto4().getX());
        double altura = Math.abs(getPunto1().getY() - getPunto3().getY());
        return (baseMayor + baseMenor) * altura / 2;
    }
}

// Clase Paralelogramo (subclase de Cuadrilatero)
class Paralelogramo extends Cuadrilatero {
    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) { // Constructor que recibe los cuatro
                                                                                   // puntos y los pasa al constructor
                                                                                   // de la superclase
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Calculo Area del paralelogramo
        double base = Math.abs(getPunto1().getX() - getPunto2().getX());
        double altura = Math.abs(getPunto1().getY() - getPunto3().getY());
        return base * altura;
    }
}

// Clase Rectángulo (subclase de Paralelogramo)
class Rectangulo extends Paralelogramo {
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) { // Constructor que recibe los cuatro
                                                                                // puntos y los pasa al constructor de
                                                                                // la superclase
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Calculo Area del rectángulo
        double base = Math.abs(getPunto1().getX() - getPunto2().getX());
        double altura = Math.abs(getPunto1().getY() - getPunto3().getY());
        return base * altura;
    }
}

// Clase Cuadrado (subclase de Rectángulo)
class Cuadrado extends Rectangulo {
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) { // Constructor que recibe los cuatro
                                                                              // puntosy los pasa al constructor de la
                                                                              // superclase
        super(punto1, punto2, punto3, punto4);
    }

    @Override
    public double calcularArea() {
        // Calculo Area del cuadrado
        double lado = Math.abs(getPunto1().getX() - getPunto2().getX());
        return lado * lado;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los puntos para el Trapezoide (x1 y1 x2 y2 x3 y3 x4 y4):");
        Punto punto1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Punto punto2 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Punto punto3 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Punto punto4 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Trapezoide trapezoide = new Trapezoide(punto1, punto2, punto3, punto4);

        System.out.println("Ingrese los puntos para el Paralelogramo (x1 y1 x2 y2 x3 y3 x4 y4):");
        punto1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto2 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto3 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto4 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Paralelogramo paralelogramo = new Paralelogramo(punto1, punto2, punto3, punto4);

        System.out.println("Ingrese los puntos para el Rectángulo (x1 y1 x2 y2 x3 y3 x4 y4):");
        punto1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto2 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto3 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto4 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Rectangulo rectangulo = new Rectangulo(punto1, punto2, punto3, punto4);

        System.out.println("Ingrese los puntos para el Cuadrado (x1 y1 x2 y2 x3 y3 x4 y4):");
        punto1 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto2 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto3 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        punto4 = new Punto(scanner.nextDouble(), scanner.nextDouble());
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3, punto4);

        // Calcular y mostrar Area de cada objeto
        System.out.println("Area del Trapezoide: " + trapezoide.calcularArea());
        System.out.println("Area del Paralelogramo: " + paralelogramo.calcularArea());
        System.out.println("Area del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Area del Cuadrado: " + cuadrado.calcularArea());

        scanner.close();
    }
}
