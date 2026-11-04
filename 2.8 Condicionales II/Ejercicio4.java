
/*
 * OBJETIVO:
 * Solicitar al usuario números positivos utilizando
 * un bucle while.
 *
 * El programa almacenará la suma de los números
 * y contará cuántos valores positivos se introducen.
 *
 * El bucle finalizará cuando el usuario introduzca 0.
 * Finalmente, mostrará la cantidad de números
 * positivos y la media de los mismos.
 *
 *
 */

package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer datos.
        Scanner entrada = new Scanner(System.in);

        // Variable para almacenar el número introducido.
        double numero;

        // Acumulador para sumar los números positivos.
        double suma = 0;

        // Contador de números positivos introducidos.
        int contador = 0;

        // Variable para almacenar la media.
        double media;

        // Solicitamos el primer número al usuario.
        System.out.print("Introduzca un número positivo (0 para salir): ");
        numero = entrada.nextDouble();

        // Repetimos el bucle mientras el número sea distinto de 0.
        while (numero != 0) {

            // Comprobamos que el número sea positivo.
            if (numero > 0) {

                // Sumamos el número al acumulador.
                suma = suma + numero;

                // Incrementamos el contador en una unidad.
                contador++;

            } else {

                // Avisamos si se introduce un número negativo.
                System.out.println("Error: Introduzca un número positivo.");
            }

            // Solicitamos otro número.
            System.out.print("Introduzca otro número positivo (0 para salir): ");
            numero = entrada.nextDouble();
        }

        // Comprobamos que se haya introducido algún número positivo.
        if (contador > 0) {

            // Calculamos la media de los números positivos.
            media = suma / contador;

            // Mostramos los resultados por pantalla.
            System.out.println("-------------------------");
            System.out.println("Cantidad de números positivos: " + contador);
            System.out.println("Suma total: " + suma);
            System.out.println("Media: " + media);

        } else {

            // Evitamos dividir entre cero.
            System.out.println("No se han introducido números positivos.");
        }

        // Cerramos el objeto Scanner.
        entrada.close();
    }
}
