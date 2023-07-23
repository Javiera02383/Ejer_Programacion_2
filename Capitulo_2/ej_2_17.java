/* 2.17 (Aritmética: menor y mayor) Escriba una aplicación que reciba tres enteros del usuario y muestre la suma,
promedio, producto, menor y mayor de esos números. Utilice las técnicas que se muestran en la figura 2.15 [nota: el
cálculo del promedio en este ejercicio debe dar como resultado una representación entera del promedio. Por lo tanto,
si la suma de los valores es 7, el promedio debe ser 2, no 2.3333...]. */



import java.util.Scanner;
 
public class ej_2_17 {
 
    public static void main(String[] args) {
 
        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        
        int x; // primer número introducido
        int y; // segundo número introducido
        int z; // tercer número introducido
       
        System.out.println("Introduce el primer número");
        x = entrada.nextInt();
        
        System.out.println("Introduce el segundo número");
        y = entrada.nextInt();

        System.out.println("Introduce el tercer número");
        z = entrada.nextInt();
 
        System.out.println("--------");
        
        // Suma
        int suma = x + y + z;
        System.out.println("Suma: " + suma);
        
        // Promedio
        int promedio = suma / 3;
        System.out.println("Promedio: " + promedio);
        
        // Producto
        int producto = x * y * z;
        System.out.println("Producto: " + producto);
        
        // Menor
        int menor = Math.min(x, Math.min(y, z));
        System.out.println("Menor: " + menor);
        
        // Mayor
        int mayor = Math.max(x, Math.max(y, z));
        System.out.println("Mayor: " + mayor);
        
        entrada.close();
    }
}