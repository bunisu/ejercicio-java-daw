package ejercicios;
import java.util.Scanner;
/*OBJETIVO:Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
 Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
 Mostrar por pantalla al usuario un mensaje informando del resultado.


*/



public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		int num1  , num2 ;
		
		Scanner entrada = new Scanner(System.in); // para leer los datos introducidos por teclado
		
		System.out.println("INTRODUCE EL PRIMER NÚMERO: ");
		num1 = entrada.nextInt(); // lee y almacena el primer número
		
		System.out.println("INTRODUCE EL SEGUNDO NÚMERO: ");
		num2 = entrada.nextInt();// lee y almacena el segundo número
		
		/* Utilizo  una estructura condicional if - else 
		 * para para comparar  los dos números y mostrar un unico resultado
		 * dependiendo de si num1 es mayor, menor o igual que num2*/
		
		if (num1 > num2) {  // Comprueba si  num1 es mayor que  num2
			
			System.out.println( num1 + " es mayor que " + num2);
		
			
		}else if (num1 < num2) { // Comprueba si num1 es menor que num2
			
			System.out.println( num2 + " es mayor que " + num1);
			
		}else { // Si no es mayor ni menor, ambos  son iguales
		
			System.out.println("Los dos número son iguales");
			
		}
		
		entrada.close();
	}
		
		
}

