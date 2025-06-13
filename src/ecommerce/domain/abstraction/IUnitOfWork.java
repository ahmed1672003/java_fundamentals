package ecommerce.domain.abstraction;

public interface IUnitOfWork {

    IDatabaseTransaction BeginTransaction();

    boolean SaveChanges(int modifiedRows);
}