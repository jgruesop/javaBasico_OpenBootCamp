package org.clasesyObjetos;

public class CocheElectrico extends Coche {

    /**
     * Esta clase usa el concepto de Herencia de clase, la cual consiste en heredad los
     * atributos y metodos de una clase padre. De esta forma evita la duplicada de atributos
     * y metodos.
     */

    String motorElectrico;

    public CocheElectrico(){
    }

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    /**
     *
     * @param color
     * @param fabricante
     * @param modelo
     * @param peso
     * @param largo
     * @param motorElectrico
     *
     * Haciendo uso de super() permitirá tomar todos los atributos de la clase padre y resutilizarlos,
     * esto se hace con el obectivo de no duplicar código, ya que esta información se encuentrá
     * creada en el constructor de la clase padre llamadda CrearClases.
     */
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }


    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 3;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
