package org.metodosdelaclasestring;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class StringMain {

    public static void main(String[] args) {

        // La clase String

        /**
         * Metodos para trabajar con cadenas de caracteres o Strings
         *
         * length()
         * startsWith("")
         * endsWith("")
         * indexOf("")
         * subString(1,5)
         * trim()
         * equals()
         * compareTo
         */

        String mensaje = "  Hola mundo"; //Si el tipo de comillas es simple hace referencia a un tipo char. Para un caracter se usa comillas

        System.out.println(mensaje.length()); //10 caracteres
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY); // imprmie varios espacios al prinicipio:    HOLA MUNDO
        System.out.println(mensajeMAY.trim()); //HOLA MUNDO    :Quita los espacios del inicio y al final del texto
        mensajeMAY =  mensajeMAY.trim();

        String otro = "HOLA MUNDO";
        if (mensajeMAY.equals(otro)){
            System.out.println("verdadero");
        }//verdadero

        String otro1 = "hola mundo";
        if (mensajeMAY.equalsIgnoreCase(otro1)){ //El metodo ignora si el String contine mayusculas o minusculas
            System.out.println("verdadero");
        }//verdadero



    }
}
