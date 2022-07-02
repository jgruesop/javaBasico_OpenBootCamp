package org.conceptosBasicos;

public class UsoContinueyBreak {
    public static void main(String[] args) {

        /**
         * Para continue y break tambien puede aplicarse en for() del mismo modo que la
         * sentencia  if(), se aclara que debe tener lineas debajo del conrinue o break
         * para tener sentido el flujo de ejecución.
         */

        int count = 0;

        while (count < 10) {
            count ++;

            if (count == 6){
                continue; //Salta la condición if y continua con la ejecución del bucle while
            }

            System.out.println("numero " + count);
        }
        System.out.println("Fin while() Usando el continue");

        count = 0;
        while (count < 10) {
            count ++;

            if (count == 6){
                break; //Rompe el flujo de ejecución del bucle while al cumplir la sentencia if
            }

            System.out.println("numero " + count);
        }
        System.out.println("Fin while()");
    }
}
