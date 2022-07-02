package org.refactorizacionCodigo.extractvariable.good;

import org.refactorizacionCodigo.extractvariable.good.Order;

public class Main {
    void printProductPrice(Order order){

        //1. Presio total de los productos
        Double quantityPrice = order.gertPrice() * order.getQuantity();

        //2. Descuento
        Double offerPrice = order.gertPrice() * order.getOffer();

        //3. Precio final = precio totlal menos el descuento
        Double finalPrice = quantityPrice - offerPrice;

        //4. Calculo del precio del envio
        Double shippinPrice = order.getShipping() * 2;

         //TODO - 4.1 nuevo calculo

        //5. Precio final
        System.out.println(finalPrice + shippinPrice);
    }
}
