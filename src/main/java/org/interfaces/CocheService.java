package org.interfaces;

import org.clasesyObjetos.Coche;

/**
 * En la INTERFACE se pueden declarar como una coleccion de metodos abstractos y propiedades constantes, y despues una
 * clase las puede implementarla, esta sería ideal en una BD de un CRUD, porque podríamos recuperar o modificar la información
 * desde alli. Es un tipo de contrato que indica que hay que hacer, y desde una clase definir como lo va a hacer o utilizar.
 * Desde una sola interface se podria obtener multiplies maneras de ser implemtadas.
 *
 * Los metodos de una interface no pueden tener cuerpo.
 *
 * Las clases hijas que requieren el uso de las interfaces, están obligadas a implementar un cuerpo sobre los metodos
 * existentes en la Interface.
 *
 * Otra diferencia entre una clase abstracta y una interface recae en su implementación ya que una clase hija solo podrá
 * heredar de una clase abstracta, por otro lado podrá hacer uso de la n cantidad de interfaces que necesite.
 *
 */

public interface CocheService {

    public Coche crearCocheDemo();

    public Coche destruirCoche();

}
