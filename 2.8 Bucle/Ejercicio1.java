
/*
 * OBJETIVO:
 * Crear un programa Java que muestre los números
 * del 1 al 100 utilizando la sentencia while.
 *
 */

package ejercicios;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Declaramos una variable entera que comienza en 1.
        int numero = 1;

        // El bucle se ejecutará mientras numero sea menor o igual a 100.
        while (numero <= 100) {

            // Mostramos el valor actual de la variable.
            System.out.println(numero);

            // Incrementamos la variable en una unidad.
            numero++;
        }

    }
}
