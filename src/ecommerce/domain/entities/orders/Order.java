package ecommerce.domain.entities.orders;

import ecommerce.domain.entities.base.Entity;
import ecommerce.domain.entities.order_lines.OrderLine;

import java.util.List;

public class Order extends Entity implements IOrder {
    private String name;
    private List<OrderLine> orderLines;

    public Order(String name, List<OrderLine> orderLines) {
        this.name = name;
        this.orderLines = orderLines;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public String getName() {
        return name;
    }

    @Override
    public void display() {
        var information = new StringBuilder();
        information.append("Id: " + super.getId() + "Name: " + name);

        for (OrderLine orderLine : orderLines) {
            information.append("| " + " order line: " + orderLine.toString());
        }

        System.out.println(information);
    }
}
