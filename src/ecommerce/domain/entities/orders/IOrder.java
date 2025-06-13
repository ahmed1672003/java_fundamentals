package ecommerce.domain.entities.orders;

import ecommerce.domain.entities.order_lines.OrderLine;

import java.util.List;

public interface IOrder {

    void setName(String name);

    void setOrderLines(List<OrderLine> orderLines);

    List<OrderLine> getOrderLines();

    String getName();
}
