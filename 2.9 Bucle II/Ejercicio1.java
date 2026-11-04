/* OBJETIVO: Escribir un programa Java que muestre por pantalla los 20 primeros números naturales
 
 */


package ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        } while (numero <= 20);
	}

}
