
/*
 * OBJETIVO:
 * Leer una secuencia de números no nulos hasta
 * introducir un 0 y mostrar si se ha leído algún
 * número negativo, cuántos positivos y negativos.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 26/10/2026
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Declaramos las variables.
        int numero;
        int positivos = 0;
        int negativos = 0;
        boolean encontradoNegativo = false;

        Scanner entrada = new Scanner(System.in);

        // Pedimos el primer número.
        System.out.print("Introduce un número (0 para terminar): ");
        numero = entrada.nextInt();

        // Repetimos mientras el número no sea 0.
        while (numero != 0) {

            // Comprobamos si el número es positivo.
            if (numero > 0) {

                positivos++;

            } else {

                // Contamos los números negativos.
                negativos++;

                // Indicamos que hemos encontrado uno.
                encontradoNegativo = true;
            }

            // Pedimos el siguiente número.
            System.out.print("Introduce otro número (0 para terminar): ");
            numero = entrada.nextInt();
        }

        // Mostramos los resultados.
        if (encontradoNegativo) {

            System.out.println("Se ha leído algún número negativo.");

        } else {

            System.out.println("No se ha leído ningún número negativo.");
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        entrada.close();
    }
}
