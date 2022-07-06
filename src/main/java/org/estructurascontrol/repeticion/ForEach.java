package org.estructurascontrol.repeticion;

public class ForEach {

    public static void main(String[] args) {

        // Iterar sobre un Array
        String [] nombres = {"Pipe", "Roberta", "Juanito"};

        for ( String nombre: nombres) {
           System.out.print(nombre + " ");
        }

        // Iterar sobre un Array
        int [] numeros = {5, 6, 7, 9};
        int suma = 0;
        for ( int numero : numeros) {
            suma = suma + numero;
        }
        System.out.println("\nLa suma es " + suma);
    }
}
