
/*
 * OBJETIVO:
 * Calcular A elevado a B sin utilizar
 * operadores ni funciones de potencia.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 29/10/2026
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        // Declaramos variables.
        int A;
        int B;
        long resultado = 1;

        Scanner entrada = new Scanner(System.in);

        // Pedimos la base.
        System.out.print("Introduce la base A: ");
        A = entrada.nextInt();

        // Pedimos el exponente.
        System.out.print("Introduce el exponente B: ");
        B = entrada.nextInt();

        // Comprobamos que el exponente no sea negativo.
        if (B >= 0) {

            // Multiplicamos A por sí mismo B veces.
            for (int i = 1; i <= B; i++) {

                resultado = resultado * A;
            }

            // Mostramos el resultado.
            System.out.println(A + " elevado a " + B
                    + " es: " + resultado);

        } else {

            System.out.println(
                    "El exponente no puede ser negativo.");
        }

        entrada.close();
    }
}
