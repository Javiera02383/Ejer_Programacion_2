public class ej_5_13 {
    public static void main(String args[]) {

        for (int i = 1; i <= 20; i++) {
            long factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            System.out.printf("%2d! = %d%n", i, factorial);
        }
    }
}
