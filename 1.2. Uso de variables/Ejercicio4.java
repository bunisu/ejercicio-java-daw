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
