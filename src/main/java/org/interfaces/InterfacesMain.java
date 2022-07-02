package org.interfaces;

import org.clasesyObjetos.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service1 = new CocheServiceClassicImplement();
        //CocheService service2 = new CocheServiceSportImplement();

        Coche coche = service1.crearCocheDemo();
        Coche coche1 = service1.destruirCoche();

        //Coche coche2 = service2.crearCocheDemo();

    }
}
