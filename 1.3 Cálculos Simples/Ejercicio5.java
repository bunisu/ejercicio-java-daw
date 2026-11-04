import java.util.Scanner;
public class Ejercicio5 {
/*Realiza un programa en Java que solicite dos números al usuario y calcule lo siguiente:
 Qué número es menor, y lo muestre por pantalla.
 Calcule el valor del primer número elevado al segundo y lo muestre por pantalla.
 Calcule la raíz cuadrada del primer número y la muestre por pantalla.
 Calcule un valor random del segundo número y lo muestre por pantalla.
Nota: solo se pueden usar funciones de la clase Math*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		double num1;
		double num2;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		num1 = entrada.nextDouble();

		System.out.print("Introduce el segundo número: ");
		num2 = entrada.nextDouble();
		
		//Mostrar resultado
		
		System.out.println("Número menor:  " + Math.min(num1,num2)); //Calcula el número menor
		System.out.println("Primer número elevevado al segundo: " + Math.pow(num1, num2)); //Calcula el primer número elevado por el segundp
		System.out.println("La raíz cuadrada de tú primer número es: " + Math.sqrt(num1)); //Calcula la raíz cuadadrada
		System.out.println("Devuelve un número aleatorio: " + (Math.random() * num2));//Calcule un valor random del segundo número 
		System.out.print("FIN DEL PROGRAMA");
		
		entrada.close();
	}
}
