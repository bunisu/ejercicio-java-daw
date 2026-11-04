
/*
 * OBJETIVO: Haciendo uso de un switch case, solicitar al usuario
 * una nota en valor entero e indicar la calificación correspondiente.
 * Las notas válidas están comprendidas entre 0 y 10.
 * En caso contrario, se indicará que la nota introducida es incorrecta.
 *
 * AUTOR: Sohaila Sara Chelbat Peral.
 * FECHA: 15/10/2026
 */

package ejercicios;

// Importamos la clase Scanner para leer datos introducidos por teclado.
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para recoger los datos del usuario.
        Scanner entrada = new Scanner(System.in);

        // Declaramos una variable entera para almacenar la nota.
        int nota;

        // Solicitamos al usuario que introduzca su nota académica.
        System.out.print("Introduce tu nota: ");
        nota = entrada.nextInt();

        // Evaluamos la nota introducida mediante un switch.
        switch (nota) {

            // Si la nota está entre 0 y 4, el alumno está suspenso.
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;

            // Si la nota es 5, la calificación es Aprobado.
            case 5:
                System.out.println("Aprobado");
                break;

            // Si la nota es 6, la calificación es Bien.
            case 6:
                System.out.println("Bien");
                break;

            // Si la nota es 7 u 8, la calificación es Notable.
            case 7:
            case 8:
                System.out.println("Notable");
                break;

            // Si la nota es 9 o 10, la calificación es Sobresaliente.
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;

            // Si la nota no está entre 0 y 10, mostramos un error.
            default:
                System.out.println(
                    "La nota que has introducido no es válida.");
                break;
        }

        // Cerramos el Scanner para liberar los recursos utilizados.
        entrada.close();
    }
}
