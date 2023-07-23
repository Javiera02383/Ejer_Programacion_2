public class ej_6_34 {

    public static void main(String[] args) {
        System.out.println("Decimal\tBinario\tOctal\tHexadecimal");
        System.out.println("------------------------------------");

        for (int decimal = 1; decimal <= 256; decimal++) {
            String binario = Integer.toBinaryString(decimal);
            String octal = Integer.toOctalString(decimal);
            String hexadecimal = Integer.toHexString(decimal).toUpperCase();

            System.out.printf("%d\t%s\t%s\t%s%n", decimal, binario, octal, hexadecimal);
        }
    }
}
