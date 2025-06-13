package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.orders.IOrderRepository;
import ecommerce.domain.entities.orders.Order;
import ecommerce.infrastructure.context.DummyDbContext;

final class OrderRepository extends Repository<Order> implements IOrderRepository {
    public OrderRepository(DummyDbContext context) {
        super(context);
    }
}
