import java.util.Scanner;
public class Ejercicio4 {
/*Realizar un programa en Java que solicite al usuario un valor, lo almacene en una variable de
tipo double.
A partir de dicho dato aplicarle las siguientes funciones de la clase Math y mostrar los valores
por pantalla (ceil, floor, round) explicando el resultado obtenido.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		double num;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce un número con decimales: ");
		num = entrada.nextDouble();
		
		//Mostrar resultado
		
		System.out.println("Ceil devuelve al entero mayor o igual: " + Math.ceil(num));
		System.out.println("Floor devuelve al entero  menor o igual: " + Math.floor(num));
		System.out.println("Round  devuelve  al entero más próximo: " + Math.round(num));
		System.out.print("FIN DEL PROGRAMA");
		
		
		entrada.close();
		
		
	}

}
