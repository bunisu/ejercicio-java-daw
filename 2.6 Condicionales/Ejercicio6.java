/*
 * OBJETIVO: Este ejercicio supone una variación del ejercicio anterior. Una vez solicitados los datos al
usuario, y almacenada en la correspondiente variable la nota obtenida se harán las siguientes
comprobaciones:
 Si la nota obtenida es menor que 0 o mayor que 10, mostrará un mensaje por pantalla
que dirá: " La nota académica indicada es incorrecta"
 En caso contrario, procederá con el programa tal y como se mostraba anteriormente
 Añadiremos al programa anterior un caso más, en caso de obtener una nota académica
de 10, el valor mostrado será "Matrícula de Honor"


 * */


package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Scanner entrada = new Scanner(System.in);
		
		//Declaramos variables
		
		String nombre;
		String apellidos;
		String cicloFormativo;
		int notaAcademica;
		
		//Declaramos otra variable para guardar resultado
		String calificacion;
		
		  // Solicitar datos
       System.out.print("Introduce tu nombre: ");
       nombre = entrada.nextLine();

       System.out.print("Introduce tus apellidos: ");
       apellidos = entrada.nextLine();

       System.out.print("Introduce tu ciclo formativo: ");
       cicloFormativo = entrada.nextLine();

       System.out.print("Introduce tu nota académica: ");
       notaAcademica = entrada.nextInt();
       
       
       /*Comprueba si pones un número negativo o superior de 10 te lo pone como no valido,
       en el caso de que la notas sea valida te dice a cual te pertenece si es insufiente,
       aprobado, bien, notable, sobresaliente.*/
       
       
       if(notaAcademica < 0 || notaAcademica > 10) {
       	calificacion = "no valida";
		} else if (notaAcademica < 5) {
			
		calificacion = "Insuficiente";
		
		}else if (notaAcademica <= 5){
			
			calificacion = "Aprobado";
			
		} else if (notaAcademica <= 6) {
			
			calificacion = "Bien";
			
		} else if (notaAcademica <= 8) {
			calificacion = "Notable";
		}else if (notaAcademica <= 9) {
			calificacion = "Sobresaliente";
			
		}else {
			calificacion = " Matrícula de Honor ";
		}
		
       //Mostrar ficha
		
		System.out.println();
       System.out.println("========== FICHA DEL ACADÉMICA ==========");
       System.out.println("Nombre: " + nombre);
       System.out.println("Apellidos: " + apellidos);
       System.out.println();
       System.out.println("Ciclo formativo: " + cicloFormativo );
       System.out.println("Nota académica: " + notaAcademica + " (" + calificacion + ") " );
 

       System.out.println();
		
		 System.out.println("=======================================");
		
		entrada.close();
	}

}
