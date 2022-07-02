package org.clasesyObjetos;

public class PolimorfismoMain {
    public static void main(String[] args) {

        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        /***
         * Polimorfismo
         * Es la manera de generar dos variantes al utilizar una clase en especifico pero como si fuera una clase principal
         * Tambien puede definirse como sobrecarga de parametros
         * El polimorfismo esta relacionado con los metodos de una clase
         * Nos permitirá utilizar estructuras de datos o bucles sobre un array o una lista, sin importar que sea diferente
         * o de un tipo en concreto. A todos nos permitirá tratar por igual.         *
         */


        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof Coche){
            System.out.println("Este objeto pertenece a un choche");
        }

        if(coche4 instanceof CocheElectrico){
            System.out.println("Este objeto pertenece a un choche Electrico");
        }

        if(coche4 instanceof CocheHibrido){
            System.out.println("Este objeto pertenece a un choche Electrico");
        }
    }
}
