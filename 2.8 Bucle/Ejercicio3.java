/*
 * OBJETIVO:
 * Crear un programa Java que muestre los números
 * del 100 al 1 utilizando la sentencia do-while.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 16/10/2026
 */

package ejercicios;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Declaramos una variable entera inicializada en 100.
        int numero = 100;

        // Iniciamos el bucle do-while.
        do {

            // Mostramos el valor actual de la variable.
            System.out.println(numero);

            // Disminuimos el contador en una unidad.
            numero--;

        // Comprobamos que el número sea mayor o igual a 1.
        // Si la condición es verdadera, repetimos el bucle.
        } while (numero >= 1);

    }
}