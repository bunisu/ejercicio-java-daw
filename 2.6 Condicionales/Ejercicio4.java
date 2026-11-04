package ejercicios;

/*
 * OBJETIVO: Un supermercado quiere premiar a los clientes que mayor desembolso hacen en sus tiendas.
Para ello lleva un control de las compras que realiza cada cliente. Si éstas superan en total la
cantidad de 300 euros en un mes se les entrega un vale descuento de 50 euros.
Solicita al usuario los siguientes valores:

 Nombre
 Apellidos
 ImporteGastado1
 ImporteGastado2
 ImporteGastado3
 ImporteGastado4

Realizar las siguientes acciones:
 Sumar los importes gastados por el usuario
 Calcular la media del importe gastado (ImporteGastado1+ImpGast.2.../4)
 Comprobar si el importe en suma es mayor o igual que 300 euros, si es indicar al
usuario que tiene un vale descuento de 50 euros, en caso contrario indicad que no es
así.
 Mostrar toda la información en una ficha.
 * 
 * 
 * 
 * */


import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        String nombre, apellidos;

        double importeGastado1;
        double importeGastado2;
        double importeGastado3;
        double importeGastado4;

        double sumaTotal;
        double mediaImporte;

        // Solicitar datos personales
        System.out.print("Introduce nombre del cliente: ");
        nombre = entrada.nextLine();

        System.out.print("Introduce apellidos del cliente: ");
        apellidos = entrada.nextLine();

        // Solicitar los cuatro importes
        System.out.print("Importe gastado 1: ");
        importeGastado1 = entrada.nextDouble();

        System.out.print("Importe gastado 2: ");
        importeGastado2 = entrada.nextDouble();

        System.out.print("Importe gastado 3: ");
        importeGastado3 = entrada.nextDouble();

        System.out.print("Importe gastado 4: ");
        importeGastado4 = entrada.nextDouble();

        // Calcular la suma total
        sumaTotal = importeGastado1 + importeGastado2
                  + importeGastado3 + importeGastado4;

        // Calcular la media
        mediaImporte = sumaTotal / 4;

        //  Mostrar ficha con todos los datos
        
        System.out.println();
        System.out.println("========== FICHA DEL CLIENTE ==========");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println();
        System.out.println("Importe Gastado1: " + importeGastado1 + " euros");
        System.out.println("Importe Gastado2: " + importeGastado2 + " euros");
        System.out.println("Importe Gastado3: " + importeGastado3 + " euros");
        System.out.println("Importe Gastado4: " + importeGastado4 + " euros");

        System.out.println();
        System.out.println("Importe Total: " + sumaTotal  + " euros");
        System.out.println("Importe Medio: " + mediaImporte + " euros");

        System.out.println();

        // Comprobar descuento
        if (sumaTotal >= 300) {
        	
            System.out.println(
                "Tiene un vale descuento de 50 euros.");

        } else {

            System.out.println(
                "Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de\r\n"
                + "descuento");

        }
        
        System.out.println("=======================================");

        entrada.close();
    }
}


