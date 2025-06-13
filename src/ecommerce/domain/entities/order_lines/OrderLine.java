package ecommerce.domain.entities.order_lines;

import ecommerce.domain.entities.base.Entity;
import ecommerce.domain.entities.orders.Order;
import ecommerce.domain.entities.products.Product;

public class OrderLine extends Entity implements IOrderLine {
    private int orderId;
    private int productId;
    private int quantity;
    private Product product;
    private Order order;

    public OrderLine(int orderId, int productId, int quantity, Product product, Order order) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.product = product;
        this.order = order;
    }

    public int getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public Product getProduct() {
        return product;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    @Override
    public void display() {
        System.out.println("Order Line " + orderId + " " + " product: " + product.getName() + "  quantity: " + quantity);
    }

    @Override
    public String toString() {
        return "Order Line " + orderId + " " + " product: " + product.getName() + "  quantity: " + quantity;
    }
}
