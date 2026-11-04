/*
 * OBJETIVO:Realizar un programa en Java que ayudará a un equipo de Recursos Humanos a realizar una
serie de entrevistas al usuario:
 En primer lugar se solicitarán al usuario los siguientes datos:
o Nombre, apellidos, edad y salario deseado
 Si el salario deseado supera los 30.000 euros o la edad es superior a 45 años el
candidat@ queda descartado. Mostramos un mensaje indicándolo y termina el
programa. " Lo sentimos pero no cumple nuestro perfil"
 En caso contrario continuamos con la entrevista, preguntando los siguientes
datos:
o Años de experiencia
o Proyectos trabajados anteriormente
 Si los años de experiencia superan los 2 y ha trabajado en más de 3 proyectos
será contratado. Mostraremos un mensaje "Enhorabuena. Ha sido
contratado"
 En caso contrario mostrar un mensaje: . " Lo sentimos pero no cumple
nuestro perfil"

AUTOR: Sohaila Sara Chelbat Peral
FECHA:14/10/2026
 * */


package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

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
	        		
	        		System.out.print("Enhorabuena. Ha sido contratado."); //Sí  los cumple esta contratado
	        	} else {
	        		System.out.print("Lo sentimos pero no cumple nuestro perfil."); //Si no es rechazado.
	        	}
	        }
	        
	        entrada.close();
	        
	}

}
