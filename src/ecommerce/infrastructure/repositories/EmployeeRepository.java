package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.employees.Employee;
import ecommerce.domain.entities.employees.IEmployeeRepository;
import ecommerce.infrastructure.context.DummyDbContext;

final class EmployeeRepository extends Repository<Employee> implements IEmployeeRepository {
    public EmployeeRepository(DummyDbContext context) {
        super(context);
    }
}
