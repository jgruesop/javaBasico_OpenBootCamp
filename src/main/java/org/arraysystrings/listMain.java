package org.arraysystrings;

import java.util.ArrayList;
import java.util.List; //Estar seguro que la List viene de esta libreria

public class listMain {
    public static void main(String[] args) {

        // List es una interfaz, permite trabajar con datos de forma comoda y dinamica.
        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");
        nombres.add("Nombre 5");

        System.out.println(nombres);

        // for each
        for (String nom : nombres){
            System.out.println(nom);
        }

        //Para el uso de list en un array de una clase
        List<Coche> coches = new ArrayList<>();

        //De este modo se agrega valores a una list de una clase
        coches.add(new Coche("Honda"));
        coches.add(new Coche("Suzuki"));
        coches.add(new Coche("KIA"));

        System.out.println(coches);//Para ver el valor en una clase, se debe generar el metodo goString()

        //Manera de imprimir los valores de un list en una clase a través de un for each.
        for (Coche coche : coches){
            System.out.println(coche);
        }
    }
}
