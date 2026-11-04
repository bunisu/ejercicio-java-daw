package ejercicios;

import java.util.Scanner;

/*OBJETIVO: Realizar un programa en Java que solicite al usuario los siguientes datos:
 Nombre
 Edad
 Nota académica

El usuario quiere acceder a unos estudios para los que se requieren dos condiciones, por un
lado ser mayor de 18 años y además haber obtenido una nota académica mayor de 7. 

Comprobar si los datos introducidos cumplen ambas condiciones. De ser así mostrar un
mensaje por pantalla: "<Nombre>, usted ha sido admitido en el curso, cumple las
condiciones requeridas". En caso contrario mostrar el siguiente mensaje "<Nombre>, lo
sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos"

AUTOR:Sohaila Sara Chelbat Peral
FECHA: 08/10/2026
*/

public class Ejercicio2 {

	public static void main(String[] args) {
		
		
	
		//Declaración de variables
		
		String nombre;
		int edad;
		double nota;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Bienvenido introduce tu nombre: "); // Solicita nombre
		nombre = entrada.nextLine();
		
		System.out.print("Introduce tu edad: "); // Solicita edad
		edad = entrada.nextInt();
		
		System.out.print("Introduce tu nota acádemica: "); // Solicita nota academica
		nota = entrada.nextDouble();
		
		/*
		 * Comprueba si el usuario cumple ambos requisitos:
		 * tener más de 18 años y una nota superior a 7.
		 * 
		 * Si cumple los dos, será admitido; en caso contrario, muestra un mensaje de rechazo.
		 * */
		if (edad > 18 && nota > 7) {           
			
			System.out.println(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas.");
		}else {
			
			System.out.println(nombre + ", lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos.");
		}
		
		
		entrada.close();

	}

}
                    