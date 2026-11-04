
/*
 * OBJETIVO:
 * Calcular y mostrar la suma y el producto
 * de los 10 primeros números naturales.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 26/10/2026
 */

package ejercicios;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Declaramos las variables.
        int suma = 0;
        int producto = 1;

        // Recorremos los números del 1 al 10.
        for (int i = 1; i <= 10; i++) {

            // Acumulamos la suma.
            suma = suma + i;

            // Acumulamos el producto.
            producto = producto * i;
        }

        // Mostramos los resultados.
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
    }
}
