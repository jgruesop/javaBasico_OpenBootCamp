package org.arraysystrings;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        //Un map se especifica por tener clave = valor

        //Crear un map de tipo String
        Map<String, String> personas = new HashMap();

        personas.put("1235468H","Nombre Apellido 1");
        personas.put("1235468L","Nombre Apellido 2");
        personas.put("1235468M","Nombre Apellido 3");

        System.out.println(personas);


        //Crear un map de tipo clase
        Map<String, Coche> coches = new HashMap<>();

        coches.put("16548M", new Coche("KIA Picanto"));

        System.out.println(coches);

        //Iterar sobre las claves
        for (String key : personas.keySet()){
            System.out.println(key);
        }

        //Iterar sobre los valores
        for (String value : personas.values()){
            System.out.println(value);
        }

        //Iterar sobre el mapa obteniendo la clave como el valor al mismo tiempo
        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }
    }
}
