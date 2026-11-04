
/*
 * OBJETIVO:
 * Crear una aplicación de senderismo que solicite
 * los datos personales de un usuario y registre
 * cinco caminatas.
 *
 * La edad debe ser superior a 17 y menor a 45.
 *
 * Al finalizar, el programa mostrará:
 * - Nombre y apellidos.
 * - Edad.
 * - Número de rutas realizadas.
 * - Distancia media de las últimas 5 rutas.
 * - Distancia más larga.
 * - Ciudad de la ruta más larga.
 *
 * AUTOR: Sohaila Sara Chelbat Peral
 * FECHA: 17/10/2026
 */

package ejercicios;

// Importamos Scanner para leer datos por teclado.
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner.
        Scanner entrada = new Scanner(System.in);

        // Declaramos las variables personales.
        String nombre;
        String apellidos;
        int edad;
        int numeroRutas;
        double distanciaUltimaRuta;

        // Declaramos las variables de las caminatas.
        double distancia;
        int participantes;
        String ciudad;

        // Acumulador de las distancias.
        double sumaDistancias = 0;

        // Variable para almacenar la media.
        double distanciaMedia;

        // Variable para guardar la distancia más larga.
        double distanciaMayor = 0;

        // Variable para guardar la ciudad de la ruta más larga.
        String ciudadMayor = "";

        // Mostramos el título de la aplicación.
        System.out.println("APLICACIÓN DE SENDERISMO");
        System.out.println("-------------------------");

        // Solicitamos el nombre.
        System.out.print("Introduzca su nombre: ");
        nombre = entrada.nextLine();

        // Solicitamos los apellidos.
        System.out.print("Introduzca sus apellidos: ");
        apellidos = entrada.nextLine();

        // Solicitamos la edad.
        System.out.print("Introduzca su edad: ");
        edad = entrada.nextInt();

        // Validamos que la edad esté entre 18 y 44 años.
        while (edad <= 17 || edad >= 45) {

            // Mostramos el mensaje de error.
            System.out.println("Esa edad no es correcta");

            // Volvemos a solicitar la edad.
            System.out.print("Introduzca su edad: ");
            edad = entrada.nextInt();
        }

        // Solicitamos el número de rutas realizadas.
        System.out.print("Número de rutas realizadas: ");
        numeroRutas = entrada.nextInt();

        // Solicitamos la distancia de la última ruta.
        System.out.print("Distancia de la última ruta (km): ");
        distanciaUltimaRuta = entrada.nextDouble();

        // Iniciamos el registro de las cinco caminatas.
        System.out.println();
        System.out.println("REGISTRO DE CAMINATAS");

        // Repetimos el proceso cinco veces.
        for (int i = 1; i <= 5; i++) {

            // Mostramos el número de caminata.
            System.out.println();
            System.out.println("Caminata número " + i);

            // Solicitamos la distancia.
            System.out.print("Distancia (km): ");
            distancia = entrada.nextDouble();

            // Solicitamos el número de participantes.
            System.out.print("Número de participantes: ");
            participantes = entrada.nextInt();

            // Limpiamos el salto de línea pendiente.
            entrada.nextLine();

            // Solicitamos la ciudad.
            System.out.print("Ciudad: ");
            ciudad = entrada.nextLine();

            // Sumamos la distancia al acumulador.
            sumaDistancias = sumaDistancias + distancia;

            // Comprobamos si es la distancia más larga.
            if (i == 1 || distancia > distanciaMayor) {

                // Guardamos la nueva distancia máxima.
                distanciaMayor = distancia;

                // Guardamos la ciudad correspondiente.
                ciudadMayor = ciudad;
            }
        }

        // Calculamos la media de las cinco distancias.
        distanciaMedia = sumaDistancias / 5;

        // Mostramos la ficha final del usuario.
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("FICHA DE SENDERISMO");
        System.out.println("----------------------------------");

        // Mostramos los datos personales.
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Edad: " + edad);

        // Mostramos el número de rutas realizadas.
        System.out.println("Número de rutas realizadas: " + numeroRutas);

        // Mostramos la distancia media.
        System.out.println("Distancia media (5 últimas rutas): "
                + distanciaMedia + " km");

        // Mostramos la distancia más larga.
        System.out.println("Distancia más larga de las últimas 5 rutas: "
                + distanciaMayor + " km");

        // Mostramos la ciudad de la ruta más larga.
        System.out.println("Ciudad de la ruta más larga: " + ciudadMayor);

        System.out.println("----------------------------------");

        // Cerramos Scanner.
        entrada.close();
    }
}
