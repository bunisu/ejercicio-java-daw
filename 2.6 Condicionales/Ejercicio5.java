/*OBJETIVO:
 * Realizar un programa en Java que solicite al usuario una serie de datos:
 Nombre
 Apellidos
 Ciclo Formativo
 Nota académica (entero)
Una vez conocida la nota devolverá un mensaje al usuario en formato de ficha, mostrando
todos los datos así como la nota obtenida en formato palabra (Insuficiente, aprobado, bien,
notable o sobresaliente)


 * */


package ejercicios;
import java.util.Scanner;
public class Ejercicio5 {

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
		}else {
			calificacion = "Sobresaliente";
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
