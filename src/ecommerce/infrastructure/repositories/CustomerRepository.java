package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.customers.Customer;
import ecommerce.domain.entities.customers.ICustomerRepository;
import ecommerce.infrastructure.context.DummyDbContext;

final class CustomerRepository extends Repository<Customer> implements ICustomerRepository {
    public CustomerRepository(DummyDbContext context) {
        super(context);
    }
}
