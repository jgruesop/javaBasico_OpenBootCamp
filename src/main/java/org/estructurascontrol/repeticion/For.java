package org.estructurascontrol.repeticion;

public class For {

    public static void main(String[] args) {

        int tabla = 8;
        System.out.println("Tabla del " + tabla);
        for (int i = 1; i <= 10; i ++) {
            System.out.println(tabla + " X " + i + " = " + i * tabla);
        }

        // Iterar sobre un Array
        String [] nombre = {"Pipe", "Roberta", "Juanito"};
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("La posición del Array nombres es: " + i + " tiene el nombre: " + nombre[i]);
        }

        // Iterar sobre un Array
        int [] numeros = {5, 6, 7, 9};
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum = sum + numeros[i];
        }
        System.out.println("El resultado de la sumatoria del array es " + sum);
    }
}
