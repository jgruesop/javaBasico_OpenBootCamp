package org.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String día = "Lunes";

        switch (día) {
            case "Lunes":
                System.out.println("Hoy es Lunes! Animo Champion");
                break;
            case "Martes":
                System.out.println("Hoy es Martes con M de Me besas");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles con M de Me besas");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves vamos con toda");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes que tan chevere");
                break;
            case "Sabado":
                System.out.println("Hoy es Sabado con de relax y mucho estudio");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo día de Orcación");
                break;
            default:
                System.out.println("No es un día valido");
        }

    }
}
