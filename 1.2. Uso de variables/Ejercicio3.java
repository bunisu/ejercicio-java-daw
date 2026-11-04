/* Ejercicio 3
Se deberá realizar un programa que realice los siguientes pasos:
 Crea dos variables de tipo int, num1 y num2, inicializa ambas variables a 1.
 Crea dos variables de tipo char, char1 y char2, asígnales un valor también.
 Crea dos variables de tipo String Cargo y Nombre, inicializa ambas con tus datos. (El
cargo lo puedes inventar)
 Muestra por pantalla el valor de las variables num1 y num2 con un texto que lo
acompañe.
 Muestra por pantalla el siguiente mensaje, haciendo uso de las variables nombre y
cargo:
Bienvenido, <cargo> <nombre>.
Ejemplo: Bienvenido, capitán Gómez,
donde “capitán” es el cargo y “Gómez” es el nombre.*/


package ejercicios;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Variables
		int num1= 1, num2 = 1;
		
		char char1 = 'a';
		char char2 = 'b';
		
		String cargo = "Abogado";
		String nombre = "Sanchéz";
		
		//Impresión int + char con frase
		System.out.println("En el examen la respuesta  " + char1  + "era " + num1 + " al igual que en la " + char2 + " que tambien ve dio " + num2);
		
		System.out.println(); //Para crear espacio
		
		
		//Impresión cargo + nombre
		System.out.println("Bienvenido, " + cargo + nombre );
		
		

	}

}
