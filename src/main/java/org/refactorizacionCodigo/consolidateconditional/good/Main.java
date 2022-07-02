package org.refactorizacionCodigo.consolidateconditional.good;

public class Main {

    private double estraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean cetification;

    double calculateSalary(){

        double result = 0;
        if(!isElegibleExtraSalary()){

        }
        // Calculate estra salary
        result += 5;
        return result;

    }

    private boolean isElegibleExtraSalary(){
        boolean estudios = seniority < 1 || education < 1; // Categoria
        boolean experiencia = incidents > 10 || !cetification; // categoria
        return estudios || experiencia;
    }

}
