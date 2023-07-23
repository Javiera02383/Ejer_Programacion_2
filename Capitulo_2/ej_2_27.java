/* 2.27 (Patrón de damas mediante asteriscos) Escriba una aplicación que muestre un patrón de tablero de damas,
como se muestra a continuación: */

import java.util.Scanner;
 
public class ej_2_27 {
 
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Tablero de Damas ");
        //i: numero de filas 
        //j: numero de columnas
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i) % 2 == 0){
                System.out.print("*  ");
               } else {
                System.out.print("  *"); 
            }
            }
            System.out.println();
        }       

        entrada.close();
    }
}