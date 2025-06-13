package ecommerce.domain.abstraction;

public interface IDatabaseTransaction {
    void Commit();

    void Rollback();
}
