
/*
 * OBJETIVO:
 * Crear un programa donde el usuario piense
 * un número del 1 al 100 y el ordenador
 * intente adivinarlo.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 29/10/2026
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        // Declaramos variables.
        int minimo = 1;
        int maximo = 100;
        int numero;
        int respuesta;

        boolean acertado = false;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Piensa un número entre 1 y 100.");
        System.out.println("Voy a intentar adivinarlo.");

        // Repetimos mientras no acertemos.
        while (!acertado && minimo <= maximo) {

            // Calculamos el número que vamos a proponer.
            numero = (minimo + maximo) / 2;

            System.out.println("¿Tu número es " + numero + "?");

            System.out.println("1. Es mayor");
            System.out.println("2. Es menor");
            System.out.println("3. Es igual");

            respuesta = entrada.nextInt();

            if (respuesta == 1) {

                // El número pensado es mayor.
                minimo = numero + 1;

            } else if (respuesta == 2) {

                // El número pensado es menor.
                maximo = numero - 1;

            } else if (respuesta == 3) {

                // El ordenador ha acertado.
                acertado = true;

                System.out.println("¡He adivinado tu número!");

            } else {

                System.out.println("Introduce 1, 2 o 3.");
            }
        }

        if (!acertado) {
            System.out.println("Tus respuestas son contradictorias.");
        }

        entrada.close();
    }
}
