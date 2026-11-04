package ejercicios;
/*
 * OBJETIVO: Realizar un programa en Java que solicite al usuario los siguientes datos:


Edad
El usuario quiere acceder a unos estudios para los que se requiere ser mayor de edad. 
Comprobaremos la edad y en caso de ser menor de 18 años mostraremos el siguiente 
mensaje: No tiene la edad requerida para realizar estos estudios.
En caso de cumplir el requisito de edad se le solicitarán los siguientes datos:
 Nombre
 Apellidos


 * */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//Declaramos variables
		int edad;
		String nombre, apellidos;
		
		System.out.print("Bienvenido, introduce tu edad: ");
		edad = entrada.nextInt();
		
		entrada.nextLine(); //Limpia el salto de línea pendiente
		
		/*
		 * Comprobamos que el usuario sea mayor de edad, si es asi se imprime el siguiente mensaje
		 * dentro del if, si no es asi se imprime "No tiene la edad requerida para realizar estos estudios. */
		
		if(edad >=18) {
			
			System.out.print("Introduce tu nombre: ");
			nombre = entrada.nextLine();
			
			System.out.print("Introduce tus apellidos: ");
			apellidos = entrada.nextLine();
			
			System.out.println();
			
			System.out.print("Nombre: " + nombre);
			System.out.println();
			System.out.print("Apellidos: " + apellidos);
			System.out.println();
			System.out.print("edad: " + edad);
			
			System.out.println();
			System.out.println();
			System.out.println("Usted ha sido admitido.");
			
		}else {
			
			System.out.print("No tiene la edad requerida para realizar estos estudios.");
			
		}
		
		entrada.close();
	}

}
