/* OBJETIVO: Escribir un programa que muestre números pares entre 1 y 200.
 * REQUISITO: contador y sumar de 2 en 2.
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA:20/10/2026
 */


package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		  // Declaramos una variable entera que comienza en 2.
        int contador = 2;

        // El bucle se ejecutará mientras numero sea menor o igual a 200.
        while (contador <= 200) {

            // Mostramos el valor actual de la variable.
            System.out.println(contador);

            // Incremento del contador del 2 en 2.
            contador += 2;
        }


	}

}
