package org.refactorizacionCodigo.consolidateconditional.bad;

public class Main {

    private double estraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean cetification;

    double calculateExtraSalary(){
        double resul = 0;
        if(seniority < 1){

            return 0;
        }
        if(education < 1){

            return 0;
        }
        if(incidents > 10){

            return 0;
        }
        if(!cetification ){

            return 0;
        }

        // Calculate extra salary
        //..
        return resul;

    }
}
