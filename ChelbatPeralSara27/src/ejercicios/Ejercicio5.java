
/*
 * OBJETIVO:
 * Crear una calculadora que solicite al usuario dos valores
 * numéricos y permita seleccionar una operación mediante
 * un menú de opciones.
 *
 * Operaciones disponibles:
 * 1. Suma
 * 2. Resta
 * 3. Multiplicación
 * 4. División
 *
 * El programa mostrará el resultado de la operación elegida.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 15/10/2026
 */

package ejercicios;

// Importamos Scanner para introducir datos por teclado.
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer los datos.
        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables que almacenarán los números.
        double num1, num2;

        // Variable para guardar la opción seleccionada.
        int opcion;

        // Variable para almacenar el resultado.
        double resultado;

        // Solicitamos el primer número al usuario.
        System.out.print("Introduzca el valor 1: ");
        num1 = entrada.nextDouble();

        // Solicitamos el segundo número al usuario.
        System.out.print("Introduzca el valor 2: ");
        num2 = entrada.nextDouble();

        // Mostramos el menú de operaciones disponibles.
        System.out.println();
        System.out.println("Indique la operación que quiere realizar:");
        System.out.println("(1) Suma");
        System.out.println("(2) Resta");
        System.out.println("(3) Multiplicación");
        System.out.println("(4) División");

        // Guardamos la opción introducida por el usuario.
        System.out.print("Seleccione una opción: ");
        opcion = entrada.nextInt();

        System.out.println("-------------------------");

        // Evaluamos la opción mediante switch.
        switch (opcion) {

            case 1:
                // Sumamos los dos valores.
                resultado = num1 + num2;

                // Mostramos el resultado de la suma.
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                // Restamos el segundo valor al primero.
                resultado = num1 - num2;

                // Mostramos el resultado de la resta.
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                // Multiplicamos los dos valores.
                resultado = num1 * num2;

                // Mostramos el resultado de la multiplicación.
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                // Comprobamos que el divisor no sea cero.
                if (num2 != 0) {

                    // Dividimos el primer valor entre el segundo.
                    resultado = num1 / num2;

                    // Mostramos el resultado de la división.
                    System.out.println("Resultado: " + resultado);

                } else {

                    // Mostramos un error si el divisor es cero.
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;

            default:
                // Se ejecuta si la opción no está entre 1 y 4.
                System.out.println("Error: Opción incorrecta.");
                break;
        }

        // Cerramos Scanner al finalizar el programa.
        entrada.close();
    }
}
