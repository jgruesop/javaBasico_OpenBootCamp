package org.conceptosBasicos;

public class SentenciasIfElse {
    public static void main(String[] args) {

        boolean check = 5 < 10;
        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int number1 = 12;
        int number2 = 11;
        int number3 = 110;

        int mayor = number1;

        if (mayor > number2 && mayor > number3) {
            System.out.println("number 1 es mayor que number 2 y 3");
        }else if (number2 > number3 && number2 > mayor ){
            System.out.println("number 2 es mayor que number 1 y 3");
        }else {
            System.out.println("number 3 es mayor que number 1 y 2");
        }


    }
}
