package ecommerce.domain.entities.products;

import ecommerce.domain.entities.base.Entity;

public class Product extends Entity implements IProduct {
    private String name;
    private double price;
    private int quantity;
    private double soldPrice;
    // discount by value
    private double discount;

    public Product(String name, double price, double soldPrice, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.soldPrice = soldPrice;
        this.quantity = quantity;
        this.discount = discount;
        ProductException.ThrowIfProductNotValid(this);
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void display() {
        System.out.println("name: " + name + " quantity: " + quantity + " price: " + price + " discount: " + discount);
    }
}
