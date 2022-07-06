package org.funciones;

/**
 * La sobrecarga premite duplicar un método siempre y cuando tengan diferente numero/tipo parametros.
 */
public class Sobrecarga {

    public static void main(String[] args) {

    }

    static int suma(int num1 , int num2){
        return num1 + num2;
    }

    static int suma(int num1 , int num2, int num3){
        return num1 + num2;
    }

}
