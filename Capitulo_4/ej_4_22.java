
public class ej_4_22 {
    public static void main(String[] args) {

        int contador = 1;
        System.out.print("Numero" + "\t" + "10*N" + "\t" + "100*N" + "\t" + "1000*N");
        while (contador <= 5) {
            System.out.println();
            System.out.print(contador + "\t" + (contador * 10) + "\t" + (contador * 100) + "\t" + (contador * 1000));
            contador++;
        }
    }
}
