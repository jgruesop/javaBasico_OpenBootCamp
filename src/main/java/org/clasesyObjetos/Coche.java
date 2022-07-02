package org.clasesyObjetos;

/**
 * Cuando una clase es ABSTRACTA normalmente hace referencia a las clases padres, las cuales no podran ser instanciadas,
 * directamente, la manera de instanciarse será a traves de las clases hijas.
 *
 * Recordar que una clase es abstracta, siempre y cuando las hijas requieran el uso de un metodo abstracto.
 *
 * las clases abstractas pueden poseer atributos, métodos, constructores, etc ... La principal diferencia entre una
 * clases convencional y una clase abstracta es que la clase abstracta debe poseer por lo menos un método abstracto.
 * Ok, pero ahora, ¿ Qué es un método abstracto? Verás, un método abstracto no es más que un método vacío, un método
 * el cual no posee cuerpo, por ende no puede realizar ninguna acción. La utilidad de un método abstracto es definir
 * qué se debe hacer pero no el cómo se debe hacer.
 */

public abstract class Coche {
    /**
     * Esta es la clase padre de la cual las clses hijas heredan todos los atributos y metodos.
     */

    // Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructores


    public Coche() {
    }

    /**
     * Un CONSTRUCTOR se reconoce asi mismo porque posee el mismo nombre de la clase
     *
     * @param color
     * @param fabricante
     * @param modelo
     * @param peso
     * @param largo
     */
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }


    // Comportamiento o metodos

    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
