
/*
 * OBJETIVO:
 * Calcular el mínimo número de billetes
 * necesarios para una cantidad de euros
 * introducida por el usuario.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 29/10/2026
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        // Declaramos las variables.
        int euros;
        int billetes;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cantidad de euros: ");
        euros = entrada.nextInt();

        // Comprobamos que sea positiva y múltiplo de 5.
        if (euros > 0 && euros % 5 == 0) {

            // Billetes de 500 euros.
            billetes = euros / 500;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 500 €");
            }
            euros = euros % 500;

            // Billetes de 200 euros.
            billetes = euros / 200;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 200 €");
            }
            euros = euros % 200;

            // Billetes de 100 euros.
            billetes = euros / 100;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 100 €");
            }
            euros = euros % 100;

            // Billetes de 50 euros.
            billetes = euros / 50;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 50 €");
            }
            euros = euros % 50;

            // Billetes de 20 euros.
            billetes = euros / 20;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 20 €");
            }
            euros = euros % 20;

            // Billetes de 10 euros.
            billetes = euros / 10;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 10 €");
            }
            euros = euros % 10;

            // Billetes de 5 euros.
            billetes = euros / 5;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 5 €");
            }

        } else {

            System.out.println(
                "La cantidad debe ser positiva y múltiplo de 5.");
        }

        entrada.close();
    }
}
