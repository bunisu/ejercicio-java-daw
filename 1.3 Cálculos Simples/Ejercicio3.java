import java.util.Scanner;

public class Ejercicio3 {
/*Realizar un programa en Java que, dadas dos variables num1 y num2 cuyos valores se pedirán
al usuario, intercambie los valores de num1 y num2, y los muestre por pantalla.
Nota: las variables tienen que cambiar de valor*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		int num1;
		int num2;
		int auxiliarNum;
	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Ingresa un número: ");
		num1 = entrada.nextInt();
		
		System.out.print("Ingresa otro número: ");
		num2 = entrada.nextInt();
		
		//Intercambio
		auxiliarNum = num1;
		num1 = num2;
	    num2 = auxiliarNum;
		
		
		//Mostrar resultado
		System.out.println ("El primer número que introduciste ahora vale: " + num1);
		System.out.println ("El segundo número que introduciste ahora vale: " + num2);
		System.out.print("FIN DEL PROGRAMA");
		
		entrada.close();
	}

}
