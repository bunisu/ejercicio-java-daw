/*OBJETIVO: Escribir un programa Java que muestre los números desde el 1 hasta un número N que se
introducirá por teclado.

 *AUTOR:Sohaila Sara Chelbat Peral
 * 
 * Fecha: 20/10/2026
 * 
 * */


package ejercicios;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		
	// Declaramos variables
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el número N: ");
		numero = entrada.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}

		entrada.close();

	}

}
