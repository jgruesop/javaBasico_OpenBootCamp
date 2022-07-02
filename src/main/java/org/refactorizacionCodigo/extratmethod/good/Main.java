package org.refactorizacionCodigo.extratmethod.good;

public class Main {

    void printHTML(){
        printHeat();
        printBody();
        extracted();
    }

    private void extracted() {
        System.out.println("This is the foorte");
        System.out.println("Script");
        System.out.println("copyright");
        System.out.println("");
    }

    private void printHeat() {
    }

    private void printBody() {
    }
}
