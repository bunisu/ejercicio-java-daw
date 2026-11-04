
/*
 * OBJETIVO:
 * Crear un programa Java que muestre los números
 * del 1 al 100 utilizando la sentencia do-while.
 *
 *
 */

package ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaramos una variable entera inicializada en 1.
        int numero = 1;

        // Iniciamos el bucle do-while.
        do {

            // Mostramos el número actual por pantalla.
            System.out.println(numero);

            // Incrementamos el contador en una unidad.
            numero++;

        // Comprobamos si el número es menor o igual a 100.
        // Si es verdadero, el bucle vuelve a ejecutarse.
        } while (numero <= 100);

    }
}
