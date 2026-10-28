/*Ejercicio 2
Se deberá realizar un programa que solicite al usuario datos relativos a un equipo de fútbol. Haciendo
uso para ello de las variables que sean necesarias:
 En primer lugar solicitará el nombre del equipo
 Solicitará el año de fundación
 Solicitará el nombre del estadio
 Solicitará el nombre del capitán
 Mostrará por pantalla los datos de la siguiente manera:
**********************************************************************************************
******* Nombre del Equipo: Torremolinos ***********************************************
******* Fundado en: 2016 ****************************************************************
******* Estadio: Campus******************************************************************
****** Capitán: Javi M*************************************************************
  */

package ejercicios;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreEquipo,nombreEstadio, nombreCapitan;
		int anoFundacion;
		
		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.print("Escribe los siguientes datos de tu equipo de fútbol: \n");
		System.out.println("");//Añadido para una separación visual en la terminal
		
		System.out.print("Nombre del equipo: ");
		nombreEquipo = entrada.nextLine();
		System.out.println("");
		
		System.out.print("Fundado en: ");
		anoFundacion = entrada.nextInt();
		System.out.println("");
		
		entrada.nextLine(); //Añadido para quitar el problema del buffer
		System.out.print("Estadio: ");
		nombreEstadio = entrada.nextLine();
		System.out.println("");
		
		System.out.print("Capitán: ");
		nombreCapitan = entrada.nextLine();
		System.out.println("");
		
		//IMPRESIÓN
		System.out.print("*******************************************************************************\n");
		System.out.println("**********" + "Nombre del equipo: " + nombreEquipo + "*************************");
		System.out.println("**********" + "Fundado en:  " + anoFundacion + "*******************************");
		System.out.println("**********" + "Estadio:  " + nombreEstadio+ "**********************************");
		System.out.println("**********" + "Capitán " + nombreCapitan + "************************************");
		
		entrada.close();
	}

}
