package ecommerce.domain.entities.order_lines;

import ecommerce.domain.entities.base.IEntity;
import ecommerce.domain.entities.orders.Order;
import ecommerce.domain.entities.products.Product;

public interface IOrderLine extends IEntity {

    int getQuantity();

    Order getOrder();

    int getOrderId();

    int getProductId();

    Product getProduct();

    void setQuantity(int quantity);

    void setOrder(Order order);

    void setOrderId(int orderId);

    void setProduct(Product product);

    void setProductId(int productId);
}
