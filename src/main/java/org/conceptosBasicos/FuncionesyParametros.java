package org.conceptosBasicos;

public class FuncionesyParametros {
    public static void main(String[] args) {

        holaMundo(); // Forma de invocar una función
        String hola = holaMundo("Jhonatan");
        System.out.println(hola);
        int numero = devoverEntreoholaMundo(55);
        System.out.println(numero);
    }


    private static void holaMundo() {
        System.out.println("Hola Mundo!"); //no necesita RETURN
    }

    //Sobre cargar una función
    private static String holaMundo(String name) {
        return "Hola "+ name;
    }

    private static int devoverEntreoholaMundo(int number) {
        return number;
    }

}
