
/*
 * OBJETIVO:
 * Solicitar al usuario 10 números.
 * Calcular la media de los números positivos,
 * la media de los números negativos y mostrar
 * la cantidad de ceros introducidos.
 *
 * 
 */

package ejercicios;

// Importamos Scanner para introducir datos por teclado.
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer datos.
        Scanner entrada = new Scanner(System.in);

        // Variable para almacenar cada número introducido.
        double numero;

        // Acumuladores de los números positivos y negativos.
        double sumaPositivos = 0;
        double sumaNegativos = 0;

        // Contadores de números positivos, negativos y ceros.
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        // Contador para controlar los 10 números.
        int contador = 1;

        // Variables para almacenar las medias.
        double mediaPositivos;
        double mediaNegativos;

        // El bucle se repetirá hasta introducir 10 números.
        while (contador <= 10) {

            // Solicitamos un número al usuario.
            System.out.print("Introduzca el número " + contador + ": ");
            numero = entrada.nextDouble();

            // Comprobamos si el número es positivo.
            if (numero > 0) {

                // Sumamos el número positivo.
                sumaPositivos = sumaPositivos + numero;

                // Incrementamos el contador de positivos.
                contadorPositivos++;

            } else if (numero < 0) {

                // Sumamos el número negativo.
                sumaNegativos = sumaNegativos + numero;

                // Incrementamos el contador de negativos.
                contadorNegativos++;

            } else {

                // Si el número es cero, aumentamos su contador.
                contadorCeros++;
            }

            // Incrementamos el contador general.
            contador++;
        }

        // Mostramos los resultados.
        System.out.println("-------------------------");

        // Comprobamos si existen números positivos.
        if (contadorPositivos > 0) {

            // Calculamos la media de los positivos.
            mediaPositivos = sumaPositivos / contadorPositivos;

            System.out.println("Media de positivos: " + mediaPositivos);

        } else {

            System.out.println("No se han introducido números positivos.");
        }

        // Comprobamos si existen números negativos.
        if (contadorNegativos > 0) {

            // Calculamos la media de los negativos.
            mediaNegativos = sumaNegativos / contadorNegativos;

            System.out.println("Media de negativos: " + mediaNegativos);

        } else {

            System.out.println("No se han introducido números negativos.");
        }

        // Mostramos la cantidad de ceros introducidos.
        System.out.println("Cantidad de ceros: " + contadorCeros);

        // Cerramos Scanner.
        entrada.close();
    }
}
