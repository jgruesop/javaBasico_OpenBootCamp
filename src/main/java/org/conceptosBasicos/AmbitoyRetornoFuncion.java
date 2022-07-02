package org.conceptosBasicos;

public class AmbitoyRetornoFuncion {
    public static void main(String[] args) {
        // Existen tres tipos de ambitos para las funciones o metodos
        /*
         * private -> Solo puede ser accedida por la misma clase (POO)
         * protected -> Solo puede ser accedida desde una clase hija (Herencia POO)
         * public -> Puede ser accedida desde cualquier clase (POO)
         */
    }

    // Para que un metodo no devuelva un valor se utiliza VOID
    private static void holaMundo() {
        System.out.println("Hola Mundo!"); //no necesita RETURN
    }


    protected static String Devielvehola(String name) {
        return "Hola "+ name;
    }

    public static int devoverEntreoholaMundo(int number) {
        return number;
    }

}
