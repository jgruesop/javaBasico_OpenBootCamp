package org.refactorizacionCodigo.consolidateduplicate.good;

public class Main {
    private double estraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean cetification;

    double calculateExtraSalary(){

        double result = 0;

        if(isElegibleExtraSalary()){
            sendMessage();
        }else {
            result = 0;
        }

        sendMessage(); // Ahora el metodo no se repite
        return result;
    }

    private void sendMessage() {
        // Send Email
        // connect smtp
        System.out.println("Sending message");
    }

    private boolean isElegibleExtraSalary(){
        boolean estudios = seniority < 1 || education < 1; // Categoria
        boolean experiencia = incidents > 10 || !cetification; // categoria
        return estudios || experiencia;
    }
}
