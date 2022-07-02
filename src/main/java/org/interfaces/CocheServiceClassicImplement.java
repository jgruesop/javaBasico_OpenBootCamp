package org.interfaces;

import org.clasesyObjetos.Coche;
import org.clasesyObjetos.CocheElectrico;

public class CocheServiceClassicImplement implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche Clasico");
        return new CocheElectrico();
    }

    @Override
    public Coche destruirCoche() {
        System.out.println("Destruyendo Coche");
        return new CocheElectrico();
    }
}
