package org.excepciones;

import java.util.Scanner;

/**
 * throws es el encargado de la asignatura de la excepción.
 * throw es quien lanzará la excepción.
 */
public class ThrowThrowsMain {
    public static void main(String[] args) {

        try{
            leerNombre();
        }catch (NameFormatException e){
            e.printStackTrace();
        }
    }

    /**
     * Ejercicio:
     * Metodo que lee nombres de la consola y verifica que tengan longitud igual o mayor que 8 caracteres.
     *
     * @throws NameFormatException
     */
    private static void leerNombre() throws NameFormatException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un nombre: ");

        while (sc.hasNext()){
            System.out.print("Introduce un nombre: ");
            String nombre = sc.nextLine();
            if (nombre.length() < 8) {
                sc.close();
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }
        }
    }
}
