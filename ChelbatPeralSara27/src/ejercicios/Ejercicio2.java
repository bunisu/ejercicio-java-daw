/*
 * OBJETO:El siguiente programa será una mejora del anterior. Aprovecharemos el código realizado
anteriormente, pero añadiremos una nueva comprobación.
Veamos el punto al que nos referimos:
 Si los años de experiencia superan los 2 y ha trabajado en más de 3 proyectos
será contratado. Mostraremos un mensaje "Enhorabuena. Ha sido
contratado"
 Si el trabajador tiene más de 5 años de experiencia o ha trabajado en más de 5
proyectos se le asignará como salario anual: 30.000 euros. En caso opuesto
25.000. Se le mostrará por pantalla un mensaje indicádonle el salario a percibir.

AUTOR: Sohaila Sara Chelbat Peral
FECHA:14/10/2026
*/


package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
			
			//Declaramos variables
			
			String nombre;
			String apellidos;
			int edad, anosExperiencia, proyectos;
			double salario;
			
			  // Solicitar datos
	        System.out.print("Introduce tu nombre: ");
	        nombre = entrada.nextLine();

	        System.out.print("Introduce tus apellidos: ");
	        apellidos = entrada.nextLine();
	        
	        System.out.print("Introduce tu edad: ");
	        edad = entrada.nextInt();

	        System.out.print("Introduce el salario deseado: ");
	        salario = entrada.nextDouble();
	        
	        //Comprueba los requisitos iniciales de salario o edad
	        
	        if (salario > 30000 || edad > 45) {
	        	
	        	   System.out.println("");
	        	
	        	System.out.println("Lo sentimos pero no cumple nuestro perfil");
	        	
	        }else {//Comprueba los requisitos de años de experiencia y proyectos
	        	
	        	   System.out.print("Introduce tus años de experiencia: ");
	        	   anosExperiencia = entrada.nextInt();
	        	   
	        	   System.out.print("Introduce tu número de proyectos realizados: ");
	        	   proyectos = entrada.nextInt();
	        	   
	        	   System.out.println("");
	        	
	        	if (anosExperiencia > 2 && proyectos > 3) {
	        		
	        		System.out.print("Enhorabuena. Ha sido contratado. "); //Sí  los cumple esta contratado
	        		
	        		if(anosExperiencia > 5 || proyectos > 5) {
	        			 
	        			System.out.print("Su salario anual es de 30.000 euros");
	        			
	        		}else {
	        			
	        			System.out.print(" Su salario anual será de 25.000€");
	        		}
	        	} else {
	        		System.out.print("Lo sentimos pero no cumple nuestro perfil."); //Si no es rechazado.
	        	}
	        }
	        
	        entrada.close();

	}

}
