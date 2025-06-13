package ecommerce.domain.abstraction;

public interface IRepository<T> {
    T add(T entity);

    T update(T entity);

    T delete(T entity);
}
