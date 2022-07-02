package org.excepciones;

public class TryCatchFinally {
    public static void main(String[] args) {

        //El try se utiliza normalmente al ejecutar codigo hacia una base de datos
        //El catch captura el error causado en el try
        //El finally se ejecuta si o si, es efectivo cuando se requiere cerrar una conexión a una BD
        try{
            int resul = 5 / 0;
        }catch (ArithmeticException e){
            e.printStackTrace(); //Si esta linea no existiera no mostraría el error que causa la división por cero, pero es necesario dejarlo.
        }finally {
            System.out.println("Cierre de los recursos");
        }

        System.out.println("El programa continua aun con el error presente");
    }
}
