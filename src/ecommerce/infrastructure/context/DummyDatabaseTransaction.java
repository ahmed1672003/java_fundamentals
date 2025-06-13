package ecommerce.infrastructure.context;

import ecommerce.domain.abstraction.IDatabaseTransaction;

public class DummyDatabaseTransaction implements IDatabaseTransaction, AutoCloseable {
    String id;

    public DummyDatabaseTransaction(String id) {
        this.id = id;
    }

    @Override
    public void Commit() {
        // commit this database transaction using transaction id
    }

    @Override
    public void Rollback() {
        // rollback this database transaction using transaction id
    }

    @Override
    public void close() throws Exception {
        // close database transaction
    }
}
