
/*
 * OBJETIVO:
 * Leer 100 números no nulos y mostrar
 * si se ha introducido algún número negativo.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Declaramos variables.
        int numero;
        boolean negativo = false;

        Scanner entrada = new Scanner(System.in);

        // Pedimos 100 números.
        for (int i = 1; i <= 100; i++) {

            System.out.print("Introduce el número " + i + ": ");
            numero = entrada.nextInt();

            // No aceptamos el cero.
            while (numero == 0) {

                System.out.println("El número no puede ser 0.");

                System.out.print("Introduce otro número: ");
                numero = entrada.nextInt();
            }

            // Comprobamos si el número es negativo.
            if (numero < 0) {
                negativo = true;
            }
        }

        // Mostramos el resultado al finalizar.
        if (negativo) {

            System.out.println("Se ha introducido algún número negativo.");

        } else {

            System.out.println("No se ha introducido ningún número negativo.");
        }

        entrada.close();
    }
}


