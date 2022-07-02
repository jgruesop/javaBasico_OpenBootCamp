package org.conceptosBasicos;

public class BucleWhile {
    public static void main(String[] args) {
        boolean check = true;
        int contador = 0;

        while (check) {
            System.out.println(contador);
            contador ++;

            if (contador == 10) { check = false;}
        }
    }
}
