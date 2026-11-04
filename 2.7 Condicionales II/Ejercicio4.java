
/*
 * OBJETIVO:
 * Solicitar al usuario las notas de cuatro asignaturas de tipo double.
 * Calcular y mostrar la nota media obtenida.
 * Mostrar la nota media redondeada hacia arriba y hacia abajo.
 * Comprobar si la nota media supera el 8 para determinar
 * si puede acceder a estudios superiores.
 *
 * AUTOR: Sohaila Sara Chelbat Peral.
 * FECHA: 15/10/2026
 */

package ejercicios;

// Importamos Scanner para introducir datos por teclado.
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer los datos del usuario.
        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables de tipo double.
        double nota1, nota2, nota3, nota4;
        double media;

        // Solicitamos al usuario las notas de las cuatro asignaturas.
        System.out.print("Introduce la nota de la primera asignatura: ");
        nota1 = entrada.nextDouble();

        System.out.print("Introduce la nota de la segunda asignatura: ");
        nota2 = entrada.nextDouble();

        System.out.print("Introduce la nota de la tercera asignatura: ");
        nota3 = entrada.nextDouble();

        System.out.print("Introduce la nota de la cuarta asignatura: ");
        nota4 = entrada.nextDouble();

        // Calculamos la nota media sumando las cuatro notas
        // y dividiendo el resultado entre el número de asignaturas.
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Mostramos la nota media original.
        System.out.println();
        System.out.println("========== RESULTADOS ACADÉMICOS ==========");
        System.out.println("La nota media obtenida es: " + media);

        // Redondeamos la nota media hacia arriba con Math.ceil().
        System.out.println("Nota media redondeada hacia arriba: "
                + Math.ceil(media));

        // Redondeamos la nota media hacia abajo con Math.floor().
        System.out.println("Nota media redondeada hacia abajo: "
                + Math.floor(media));

        System.out.println();

        // Comprobamos si la nota media es superior a 8.
        // Si supera el 8, puede acceder a estudios superiores.
        if (media > 8) {

            System.out.println(
                "Enhorabuena. Puede acceder a estudios superiores.");

        } else {

            // Si la media es igual o inferior a 8,
            // no cumple el requisito de acceso.
            System.out.println(
                "La nota media obtenida no es suficiente "
                + "para acceder a los estudios deseados.");
        }

        System.out.println("==========================================");

        // Cerramos el Scanner para liberar recursos.
        entrada.close();
    }
}
