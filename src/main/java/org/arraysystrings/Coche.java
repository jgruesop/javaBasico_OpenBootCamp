package org.arraysystrings;

public class Coche {

    String nombre = "";

    public Coche() {
    }

    public Coche(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
