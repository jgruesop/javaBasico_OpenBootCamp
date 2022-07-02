package org.clasesyObjetos;

public class CrearObjetosCoche {
    public static void main(String[] args) {

        /**
         * En el main podemos crear objetos de una clase, los cuales permiten instanciar o utilizar los
         * atributos y metodos que posee una clase en particular, a la cual queramos manipular y entregar
         * datos.
         */

        //String coche = "alfa romeo";
        //Coche cocheObjt = new Coche(); En las clases abstractas no se puede instanciar

        //Coche cocheObjt1 = new Coche("rojo", "Suzuki", "hero", 1430.45, 5.4);
        //cocheObjt1.acelerar(50);
        ///System.out.println(cocheObjt1);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Rojo";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "Civic";

        System.out.println(cocheElectrico);


        CocheElectrico cocheElectrico1 = new CocheElectrico("negro", "KIA","Picanto", 235.55, 7.2,"TXA");

        System.out.println(cocheElectrico1);
        cocheElectrico1.acelerar(30);
        System.out.println(cocheElectrico1);

    }
}
