package ecommerce.infrastructure;

import ecommerce.domain.abstraction.IDatabaseTransaction;
import ecommerce.domain.abstraction.IUnitOfWork;
import ecommerce.infrastructure.context.DummyDatabaseTransaction;
import ecommerce.infrastructure.context.DummyDbContext;

import java.util.UUID;

public class UnitOfWork implements IUnitOfWork {

    final DummyDbContext _context;

    public UnitOfWork(DummyDbContext context) {
        _context = context;
    }

    @Override
    public IDatabaseTransaction BeginTransaction() {
        return new DummyDatabaseTransaction(UUID.randomUUID().toString());
    }

    @Override
    public boolean SaveChanges(int modifiedRows) {
        return _context.SaveChanges() == modifiedRows;
    }
}
