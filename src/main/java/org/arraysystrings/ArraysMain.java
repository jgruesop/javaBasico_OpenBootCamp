package org.arraysystrings;

import com.sun.security.jgss.GSSUtil;

public class ArraysMain {

    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";

        String[] nombres = new String[3];
        String[] nombres2 = new String[]{"jhonatan", "juan", "mathias", "pedro"};
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        //forma uno
        for (String nom : nombres){
            System.out.println(nom);
        }

        // forma dos
        for (int i = 0; i <= nombres.length; i++){
            System.out.println(nombres2[i]);
        }
    }
}
