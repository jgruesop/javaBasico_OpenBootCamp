package org.estructurascontrol.repeticion;

public class While {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 10) {
            String nombre = "prueba";
            contador++;
            if (contador == 5) {
               // break; // Rompe el bloque
                continue; // Continua el bucle sin importar las sentencia de control
            }
            System.out.println("Valor del contador " + contador);

        }
        //System.out.println(nombre);//La variable nombre esta fuera del ambito donde se creo es decir dentro del while

    }
}
