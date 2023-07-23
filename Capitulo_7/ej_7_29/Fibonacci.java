import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de n:"));

        long fibonacci = fibonacci(n);
        JOptionPane.showMessageDialog(null, "El numero de Fibonacci en la posicion " + n + " es:  " + fibonacci);

        long maxFibonacci = findMaxFibonacci();
        JOptionPane.showMessageDialog(null,
                "El numero de Fibonacci mas grande que puede imprimirse es: " + maxFibonacci);
    }

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long prev1 = 1;
            long prev2 = 1;
            long current = 0;

            for (int i = 3; i <= n; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }

            return current;
        }
    }

    public static long findMaxFibonacci() {
        long prev = 0;
        long current = 1;
        long maxFibonacci = current;

        while (true) {
            long next = prev + current;

            if (next < current) {
                break; // Se ha excedido el límite del tipo de dato long
            }

            maxFibonacci = current;
            prev = current;
            current = next;
        }

        return maxFibonacci;
    }

}