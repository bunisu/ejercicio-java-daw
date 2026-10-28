/*Ejercicio 1
Se deberá realizar un programa en java el cual haciendo uso de la entrada estándar solicite los
siguientes datos al usuario:
 Nombre
 Apellidos
 Edad
 Dirección
 Altura
 Peso
Cada uno de los datos se almacenará en una variable del tipo correspondiente.
Por último mostraremos por pantalla los valores correspondientes a cada uno de los datos introducidos
por el usuario, mostrando cada dato en una linea.
Ejemplo: Nombre: Javier
----------------------------------------------------------------------------
Tras leer cualquier dato numérico, bien sea int o double hay un problema con la clase
Scanner si después trato de leer un carácter. Para evitarlo
1) leer primero todos los String y luego los números
2) Tras leer cada dato numérico añadir un ent.nextLine(), de esta forma el buffer
no queda en un salto de línea intermedio y puedo seguir leyendo correctamente
los datos indistintamente del tipo a tratar.*/



package ejercicios;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		String nombre, apellidos, direccion;
		double altura, peso;
		int edad;
	
		
	
		//Entrada por teclado
		Scanner entrada = new Scanner (System.in);
		System.out.print("Bienvenido ingresa los siguientes datos\n");
		System.out.println("");//Añadido para una separación visual
		
		System.out.print("Ingresa tu nombre: "); //Impresión que indica la información que se tiene que introducir
		System.out.println("");//Añadido para una separación visual
		nombre = entrada.nextLine();//Entrada por donde se ponen los datos
		System.out.println("Nombre: " + nombre); //Impresión de los datos puestos
		
		System.out.println("");//Añadido para una separación visual
		
		System.out.print("Ingresa tus apellidos: ");//Impresión que indica la información que se tiene que introducir
		apellidos = entrada.nextLine();//Entrada por donde se ponen los datos
		System.out.println("");//Añadido para una separación visual
		System.out.println("Apellidos: " + apellidos);//Impresión de los datos puestos
		
		System.out.println("");//Añadido para una separación visual
		
		System.out.print("Ingresa tu edad: ");//Impresión que indica la información que se tiene que introducir
		edad = entrada.nextInt();//Entrada por donde se ponen los datos
		System.out.println("");//Añadido para una separación visual
		System.out.println("Edad: " + edad);//Impresión de los datos puestos, aqui solo números enteros
		
		System.out.println("");//Añadido para una separación visual
		
		entrada.nextLine();// Lo he puesto para que el buffer no de problemas
		
		System.out.print("Ingresa tu dirección: ");//Impresión que indica la información que se tiene que introducir
		direccion = entrada.nextLine();//Entrada por donde se ponen los datos
		System.out.println("");//Añadido para una separación visual
		System.out.println("Dirección: " + direccion);//Impresión de los datos puestos
		
		System.out.println("");//Añadido para una separación visual
		
		System.out.print("Ingresa tu altura: ");//Impresión que indica la información que se tiene que introducir
		altura = entrada.nextDouble();//Entrada por donde se ponen los datos
		System.out.println("");//Añadido para una separación visual
		System.out.println("Altura: " + altura);//Impresión de los datos puestos, aqui números con decimales 
		
		System.out.println("");//Añadido para una separación visual
		
		System.out.print("Ingresa tu peso: ");//Impresión que indica la información que se tiene que introducir
		peso = entrada.nextDouble();//Entrada por donde se ponen los datos
		System.out.println("");//Añadido para una separación visual
		System.out.println("Peso: " + peso);//Impresión de los datos puestos, aqui números con decimales
		
		System.out.println("");//Añadido para una separación visual
		
		entrada.close();
		
	}

}
