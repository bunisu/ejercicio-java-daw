/*Ejercicio 4
Se deberá realizar un programa que realice los siguientes pasos:
 Crea un tipo enumerado con los valores siguientes: pequeña, mediana, grande, extragrande.
 Crea cuatro variables del tipo enumerado anterior y asígnales a cada uno en valor dentro
de los posibles.
 Muestra por consola el valor de cada una de las variables y un texto que explique el valor.*/


package ejercicios;

public class Ejercicio4 {
	 //Tipo enumerado
    enum Tamano {   PEQUENA, MEDIANA, GRANDE, EXTRAGRANDE}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//Variables
		        Tamano tallaS = Tamano.PEQUENA;
		        Tamano tallaM = Tamano.MEDIANA;
		        Tamano tallaL = Tamano.GRANDE;
		        Tamano tallaXL = Tamano.EXTRAGRANDE;

		        // Impresión
		        System.out.println("Variable 1: " + tallaS + " - Corresponde al tamaño de menor dimensión o infantil.");
		        System.out.println("Variable 2: " + tallaM + " - Corresponde al tamaño estándar o promedio.");
		        System.out.println("Variable 3: " + tallaL + " - Corresponde al tamaño superior al promedio.");
		        System.out.println("Variable 4: " + tallaXL + " - Corresponde al tamaño máximo disponible.");
		  

	}

}
