package org.interfaces;

import org.clasesyObjetos.Coche;
import org.clasesyObjetos.CocheHibrido;

public class CocheServiceSportImplement implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche de carreras");
        return new CocheHibrido();
    }

    @Override
    public Coche destruirCoche() {
        System.out.println("Modificando una pieza en el tablero de control del coche");
        return null;
    }
}
