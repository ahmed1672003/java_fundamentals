package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.order_lines.IOrderLineRepository;
import ecommerce.domain.entities.order_lines.OrderLine;
import ecommerce.infrastructure.context.DummyDbContext;

final class OrderLineRepository extends Repository<OrderLine> implements IOrderLineRepository {
    public OrderLineRepository(DummyDbContext context) {
        super(context);
    }
}
