
/*
 * OBJETIVO:
 * Solicitar al usuario un número y mostrar
 * su cuadrado.
 *
 * Repetir el proceso utilizando un bucle while
 * hasta que se introduzca un número negativo.
 *
 *
 */

package ejercicios;

// Importamos Scanner para leer datos por teclado.
import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args) {

        // Creamos el objeto Scanner para introducir datos.
        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables.
        double numero;
        double cuadrado;

        // Solicitamos el primer número al usuario.
        System.out.print("Introduzca un número: ");
        numero = entrada.nextDouble();

        // Repetimos mientras el número no sea negativo.
        while (numero >= 0) {

            // Calculamos el cuadrado del número.
            cuadrado = numero * numero;

            // Mostramos el resultado por pantalla.
            System.out.println("El cuadrado de " + numero
                    + " es: " + cuadrado);

            // Solicitamos otro número al usuario.
            System.out.print("Introduzca otro número: ");
            numero = entrada.nextDouble();
        }

        // Mostramos un mensaje al finalizar el bucle.
        System.out.println("Número negativo introducido.");
        System.out.println("Programa finalizado.");

        // Cerramos Scanner.
        entrada.close();
    }
}
