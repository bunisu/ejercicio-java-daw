
/*
 * OBJETIVO:
 * Escribir un programa Java que lea 100 números
 * no nulos e indique cuántos son positivos
 * y cuántos negativos.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 26/10/2026
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Declaramos las variables.
        int numero;
        int positivos = 0;
        int negativos = 0;

        Scanner entrada = new Scanner(System.in);

        // Solicitamos los 100 números.
        for (int i = 1; i <= 100; i++) {

            System.out.print("Introduce el número " + i + ": ");
            numero = entrada.nextInt();

            // Comprobamos que el número no sea 0.
            while (numero == 0) {

                System.out.println("El número no puede ser 0.");

                System.out.print("Introduce otro número: ");
                numero = entrada.nextInt();
            }

            // Contamos los números positivos y negativos.
            if (numero > 0) {

                positivos++;

            } else {

                negativos++;
            }
        }

        // Mostramos los resultados.
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);

        entrada.close();
    }
}
