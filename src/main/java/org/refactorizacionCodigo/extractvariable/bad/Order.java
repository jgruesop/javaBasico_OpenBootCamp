package org.refactorizacionCodigo.extractvariable.bad;

public class Order {

    private Double price;
    private Integer quantity;
    private Double offer;
    private Double shipping;

    public Double gertPrice() { return price;  }
    public Integer getQuantity() { return quantity; }
    public Double getOffer() { return offer; }
    public Double getShipping() { return shipping; }

    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public void setPrice(Double price) { this.price = price; }
    public void setOffer(Double offer) { this.offer = offer; }
    public void setShipping(Double shipping) { this.shipping = shipping; }


}
