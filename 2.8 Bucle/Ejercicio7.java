
/*
 * OBJETIVO:
 * Crear un juego para adivinar un número entero
 * aleatorio comprendido entre 0 y 50.
 *
 * El programa solicitará números al usuario
 * e indicará si el número secreto es mayor
 * o menor que el número introducido.
 *
 * El juego finalizará cuando el usuario acierte.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 16/10/2026
 */

package ejercicios;

// Importamos Scanner para leer datos por teclado.
import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[] args) {

        // Creamos el objeto Scanner para introducir datos.
        Scanner entrada = new Scanner(System.in);

        // Generamos un número aleatorio entero entre 0 y 50.
        int N = (int) (Math.random() * 51);

        // Variable para almacenar el número introducido.
        int numero;

        // Mostramos un mensaje de bienvenida.
        System.out.println("JUEGO: ADIVINA EL NÚMERO");
        System.out.println("Adivina un número entre 0 y 50.");

        // Solicitamos el primer número al usuario.
        System.out.print("Introduzca un número: ");
        numero = entrada.nextInt();

        // Repetimos mientras el usuario no acierte.
        while (numero != N) {

            // Comprobamos si el número introducido es menor.
            if (numero < N) {

                // Indicamos que el número secreto es mayor.
                System.out.println("Mayor");

            } else {

                // Indicamos que el número secreto es menor.
                System.out.println("Menor");
            }

            // Solicitamos otro número para continuar jugando.
            System.out.print("Introduzca otro número: ");
            numero = entrada.nextInt();
        }

        // Mostramos un mensaje cuando el usuario acierta.
        System.out.println("¡Enhorabuena! Has acertado.");
        System.out.println("El número secreto era: " + N);

        // Cerramos Scanner.
        entrada.close();
    }
}
