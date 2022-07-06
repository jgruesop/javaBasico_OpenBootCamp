package org.estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Lunes";

        //Ejemplos de comparación
        boolean resultadoCompararNumero = 5 == 5; //usado para numeros
        boolean resul = dia.equals("Martes"); ///usado para cadenas

        //if else if
        if(dia.equals("Lunes")){
            System.out.println("Animo con la semana Campions.");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        }else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Me besas");

        }else if (dia.equals("Jueves")) {
            System.out.println("Ya es Jueveves Baron");

        }else if (dia.equals("Viernes")) {
            System.out.println("Viernes de locura");

        }else if (dia.equals("Sabado")) {
            System.out.println("Sabado de descaso y mucho estudio");

        }else if (dia.equals("Domingo")) {
            System.out.println("Domingo para dedicarlo a Dios");
        }


    }
}
