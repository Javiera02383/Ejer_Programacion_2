public class ej_6_24 {

    public static void main(String[] args) {
        int limite = 1000;

        System.out.println("Números perfectos entre 1 y " + limite + ":");
        for (int i = 1; i <= limite; i++) {
            if (esPerfecto(i)) {
                System.out.print(i + ": ");
                mostrarFactores(i);
                System.out.println();
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        int sumaFactores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaFactores += i;
            }
        }

        return sumaFactores == numero;
    }

    public static void mostrarFactores(int numero) {
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
