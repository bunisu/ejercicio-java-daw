
/*
 * OBJETIVO:
 * Sumar independientemente los números pares
 * e impares comprendidos entre 100 y 200
 * y mostrar ambas sumas.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 29/10/2026
 */

package ejercicios;

public class Ejercicio11 {

    public static void main(String[] args) {

        // Declaramos los acumuladores.
        int sumaPares = 0;
        int sumaImpares = 0;

        // Recorremos los números desde 100 hasta 200.
        for (int i = 100; i <= 200; i++) {

            // Comprobamos si el número es par.
            if (i % 2 == 0) {

                // Sumamos los números pares.
                sumaPares = sumaPares + i;

            } else {

                // Sumamos los números impares.
                sumaImpares = sumaImpares + i;
            }
        }

        // Mostramos los resultados.
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}
