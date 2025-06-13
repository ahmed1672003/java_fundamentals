package ecommerce.infrastructure.repositories;

import ecommerce.domain.abstraction.IRepository;
import ecommerce.infrastructure.context.DummyDbContext;

class Repository<T> implements IRepository<T> {

    protected final DummyDbContext _context;

    public Repository(DummyDbContext context) {
        _context = context;
    }

    @Override
    public T add(T entity) {
        _context.add(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        _context.update(entity);
        return entity;
    }

    @Override
    public T delete(T entity) {
        _context.remove(entity);
        return entity;
    }
}
