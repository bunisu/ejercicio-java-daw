/*OBJETIVO: Escribe un programa Java que lee una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 
 * */


package ejercicios;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Declaramos las variables.
        int nota;
        boolean encontrado = false;

        Scanner entrada = new Scanner(System.in);

        // Pedimos la primera nota.
        System.out.print("Introduce una nota (-1 para terminar): ");
        nota = entrada.nextInt();

        // Repetimos hasta que el usuario introduzca -1.
        while (nota != -1) {

            // Comprobamos que la nota sea válida.
            if (nota >= 0 && nota <= 10) {

                // Comprobamos si hemos encontrado un 10.
                if (nota == 10) {
                    encontrado = true;
                }

            } else {
                System.out.println("La nota debe estar entre 0 y 10.");
            }

            // Pedimos la siguiente nota.
            System.out.print("Introduce otra nota (-1 para terminar): ");
            nota = entrada.nextInt();
        }

        // Mostramos el resultado.
        if (encontrado) {
            System.out.println("Sí, se ha introducido alguna nota de 10.");
        } else {
            System.out.println("No se ha introducido ninguna nota de 10.");
        }

        entrada.close();
	}

}
