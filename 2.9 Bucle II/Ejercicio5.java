/*OBJETIVO: Escribe un programa Java que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial:
 * AUTOR:Sohaila Sara Chelbat Peral
 * FECHA:22/10/2026
 * */




package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Declaramos variables.
        int numero;
        long factorial = 1;
        int i;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        numero = entrada.nextInt();

        // Comprobamos que el número no sea negativo.
        if (numero >= 0) {

            System.out.print(numero + "! = ");

            if (numero == 0) {
                System.out.print("1");
            } else {

                // Calculamos y mostramos el factorial.
                for (i = numero; i >= 1; i--) {

                    factorial = factorial * i;

                    System.out.print(i);

                    if (i > 1) {
                        System.out.print(" x ");
                    }
                }
            }

            // Mostramos el resultado final.
            if (numero > 0) {
                System.out.println(" = " + factorial);
            } else {
                System.out.println();
            }

        } else {

            System.out.println("El número no puede ser negativo.");
        }

        entrada.close();
    }
}
