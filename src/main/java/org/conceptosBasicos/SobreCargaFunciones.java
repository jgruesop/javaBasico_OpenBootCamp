package org.conceptosBasicos;

public class SobreCargaFunciones {
    public static void main(String[] args) {

        /*
         * Utilizamos sobre carga de funciones, para separar el codigo
         * y que este en vez de hacer muchos calculos solo pueda hace los
         * minimos posibles, para que halla sobre carga estos debe ser llamados de
         * la misma manera pero con sus respectivos paramnetros.
         *
         */

        holaMundo();

        String hola = holamundo("Jhonatan");
        System.out.println(hola);

        String nombre = holamundo("jhonatan", "Grueso");
        System.out.println(nombre);

        int number = holaMundo(5, 10);
        System.out.println(number);

        holaMundo(65565);




    }
    private static void holaMundo() {
        System.out.println("Hola Mundo!"); //no necesita RETURN
    }


    protected static String holamundo(String name) {
        return "Hola "+ name;
    }

    protected static String holamundo(String name, String lastname) {
        return "Hola "+ name + " "+ lastname;
    }

    public static int holaMundo(int number, int number2) {
        return number + number2;
    }

    public static void holaMundo(Integer number) {
        System.out.println(number);
    }
}
