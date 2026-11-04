

import java.util.Scanner;

public class Ejercicio1 {
	/*Realizar un programa en Java que solicite al usuario los siguientes datos:
 Nombre
 Apellidos
 Fecha Nacimiento
 Salario bruto
 Años trabajando en la empresa

A partir de estos datos el programa debe de hacer lo siguiente:
 Calcular el salario neto del usuario (salario bruto menos 15% de IRPF)
 Mostrar una ficha al usuario en la que se le indique lo siguiente:
Estimad@ (Nombre Apellidos), su salario bruto es (salario bruto), teniendo en
cuenta un IRPF del 15% su salario neto es (salario neto).
Debido a sus (número de años trabajando en la empresa) años trabajando en la
empresa su salario se incrementará en un 2% por cada año. El aumento es de
(aumento) y el salario total es (salario total).*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables que se le solicita al usuario
		String nombre, apellidos;
	    String fechaNacimiento;
		double salarioBruto;
		int anosEmpresa;
		
		
		//Scanner para introducir los datos por teclado
		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.print("INGRESA LOS SIGUIENTES DATOS: \n");
		System.out.println("");//Añadido para una separación visual en la terminal
		
		System.out.print("Nombre: ");//Imprime lo que queremos que escriba el usuario, en este caso su nombre
		nombre = entrada.nextLine();//Lo he utilizado para que el usuario pueda escribir una variable String, en este caso su nombre
		System.out.println("");//Para crear espacio
		
		System.out.print("Apellidos: ");//Imprime lo que queremos que escriba el usuario, en este caso sus apellidos
		apellidos = entrada.nextLine();//Lo he utilizado para que el usuario pueda escribir una variable String, en este caso sus apellidos
		System.out.println("");//Para crear espacio
		
		System.out.print("Fecha Nacimiento: ");//Imprime lo que queremos que escriba el usuario, en este caso su fecha de nacimiento
		fechaNacimiento = entrada.nextLine();//Lo he utilizado para que el usuario pueda escribir una variable String, en este caso su fecha de nacimiento
		System.out.println("");//Para crear espacio
		
	
		System.out.print("Salario bruto: ");//Imprime lo que queremos que escriba el usuario, en este caso su salario bruto
		salarioBruto = entrada.nextDouble();//Lo he utilizado para que el usuario pueda escribir una variable double, en este caso su salario bruto
		System.out.println("");//Para crear espacio
		
		System.out.print("Años trabajando en la empresa: ");//Imprime lo que queremos que escriba el usuario, en este caso los años trabajado en la empresa
		anosEmpresa = entrada.nextInt();//Lo he utilizado para que el usuario pueda escribir una variable int, en este los años que lleva en la empresa
		System.out.println("");//Para crear espacio
		
		//Calcular el salario neto del usuario (salario bruto menos 15% de IRPF)
		
		//Variable para crear el salario neto
		  
		double salarioNeto;
		
		//Operación para que salga el salario neto
		salarioNeto = salarioBruto - (salarioBruto * 0.15);
		
		//Impresión para que el usuario vea el salario neto
		System.out.println("Tu salarío neto es: " + salarioNeto + "€");
		
		//Variable para crear aumento 2%
		double aumento;
		
		//Operación incremento por años trabajados aumento 2% 
		aumento = 0.02 * anosEmpresa;
		
		//Variable para importe aumento + operación para saber el salario total
		double importeAumento = salarioBruto * aumento;
		
		//Variable para crear salario total
		double salarioTotal;
		
		//Operación salario total añadiendo aumento
		salarioTotal= salarioBruto + importeAumento;
		System.out.println("");//Para crear espacio
		
		//Mostrar ficha con los datos pedidos
		System.out.println("Estimad@ " + nombre +" "+ apellidos + ", su salario bruto es " + salarioBruto + "€, teniendo en\r\n"
				+ "cuenta un IRPF del 15% su salario neto es " + salarioNeto + "€." + " Debido a sus  " + anosEmpresa + " años trabajando en la\r\n"
						+ "empresa su salario se incrementará en un 2% por cada año. El aumento es de " + importeAumento + "€ el salario total es " + salarioTotal + "€");
		entrada.close(); //Se cierra el Scanner
