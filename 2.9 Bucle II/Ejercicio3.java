/*/* OBJETIVO: Escribir un programa que muestre números pares entre 1 y 200.
REQUISITO: contador sumando de 1 en 1.
AUTOR: Sohaila Sara Chelbat Peral
FECHA:20/10/2026 
 * */

package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		  // Declaramos una variable entera que comienza en 2.
        int contador = 1;

        // El bucle se ejecutará mientras numero sea menor o igual a 200.
        while (contador <= 200) {
        	
        	if (contador %2 ==0) { // Mostramos el número par
            // Mostramos el valor actual de la variable.
            System.out.println(contador);
        }

            // Incremento del contador del 1 en 1.
            contador ++;
        }

	}

}
