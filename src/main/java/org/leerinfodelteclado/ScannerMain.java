package org.leerinfodelteclado;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        //De este modo se puede leer archivos y escribir datos en archivos.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introudce un nombre: ");
        String nombre = teclado.nextLine(); //Lee un cadena de carateres

        System.out.print("Introduce un numero: ");
        int numero = teclado.nextInt(); // Leer un número entero


        //Para escribir o mostrar datos por pantalla
        System.out.println("El nombre introducido fue: " + nombre);
        System.out.println("El numero introducido fue: " + numero);
    }
}
