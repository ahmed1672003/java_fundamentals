package ecommerce.domain.entities.products;

import ecommerce.domain.entities.base.IEntity;

public interface IProduct extends IEntity {
    void setName(String name);


    void setDiscount(double discount);

    void setPrice(double price);

    void setQuantity(int quantity);

    String getName();

    double getDiscount();

    double getPrice();

    int getQuantity();
}
