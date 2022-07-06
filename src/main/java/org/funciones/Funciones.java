package org.funciones;

public class Funciones {

    public static void main(String[] args) {


        //opción 1: Función sin parámetros y sin tipos de retorno
        showMenu();

        //Opción 2: Funcion sin parametros y con tipos de retorno
        String mensaje = getMen();
        System.out.println(mensaje);

        double price = getPrice();
        System.out.println(price);

        //Opción 3: Función con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootCamp");

        //Opción 4: Función con parámetros y con tipo de retorno
        String nombre = "Jhonatan";
        String apellido = "Grueso";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

    }

    private static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas noches " + nombre + " " + apellido;
    }

    static void imprimirSaludoBuenosDias(String nombre) {
        System.out.println("Buenos días " + nombre);
    }

    static double getPrice(){
        return 10.99;
    }

    /**
     * Void indica que no devuelve nada
     */
     static void showMenu(){

         System.out.println("Bienvenidos al E-commerce de zapatillas:");
         System.out.println("1 - Ver zapatillas");
         System.out.println("2 - Comprar zapatillas");
         System.out.println("3 - Salir");
     }

     static String getMen(){
         return "Bienvenidos al E-commerce de zapatillas: \n1 - Ver zapatillas";
     }
}
