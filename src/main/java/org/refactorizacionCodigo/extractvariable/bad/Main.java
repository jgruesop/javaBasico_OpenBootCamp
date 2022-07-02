package org.refactorizacionCodigo.extractvariable.bad;

public class Main {

    void printProductPrice(Order order){
        Double totalPrice = order.gertPrice() * order.getQuantity() - order.getOffer() + order.getShipping() * 2;
        System.out.println(totalPrice);
    }
}
