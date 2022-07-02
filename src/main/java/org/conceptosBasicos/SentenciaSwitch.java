package org.conceptosBasicos;

public class SentenciaSwitch {
    public static void main(String[] args) {

        String wather = "sunny";

        switch(wather){
            case "sunny":
                System.out.println("El tiempo es soleado.");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado.");
                break;
            default:
                System.out.println("No se ha podido identificar el clima.");
        }

    }
}
