import java.util.Scanner;

public class ejercicio2 {
/*Escribir un programa en Java que transforme en euros la cantidad que se introduce como dato
en pesetas (1 euro son 166,386 pesetas) y viceversa. Primero solicitar la cantidad en euros y
transformarlo en pesetas mostrando el resultado por pantalla. A continuación hacer lo propio
pero al revés, pidiendo pesetas y pasándolo a euros.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		
		double euro;
		double peseta;
		double valorConversion = 166.386;
		
		
		
	
		
		Scanner entrada = new Scanner(System.in);
		
		//Se solicita la cantidad en euros
		System.out.print("Introduzca la cantidad en euro: ");
		euro = entrada.nextDouble();
		
		//Operación para pasar de euro a pesetas
		 double conversionPeseta = euro * valorConversion;
		
		//Hace la conversión en pesetas
		System.out.println("Esta cantidad en pesetas es: "  + conversionPeseta + " ptas.");
		
		//Se solicita la cantidad en pesetas
		System.out.print("Introduzca la cantidad en pesetas: ");
		peseta = entrada.nextDouble();
		
		//Operación para pasar de pesetas a euros
		double conversionEuro = peseta /valorConversion;
		
		
		//Hace la conversión a euros
		System.out.println("Esta cantidad en euros es: "  + conversionEuro + " €.");
	
		System.out.println ("FIN DEL PROGRAMA ");
	
		entrada.close();
		
	}

}
