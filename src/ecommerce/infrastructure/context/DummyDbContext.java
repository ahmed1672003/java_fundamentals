package ecommerce.infrastructure.context;

public class DummyDbContext implements AutoCloseable {


    public <T> void add(T record) {

        System.out.println("Adding record: " + record.toString()); // call database here
    }

    public <T> void remove(T record) {
        System.out.println("Removing record: " + record.toString()); // call database here
    }

    public <T> void update(T record) {
        System.out.println("Updating record: " + record.toString()); // call database here
    }

    public int SaveChanges() {
        // call database to save changes
        return 5;
    }

    @Override
    public void close() throws Exception {
        // close database connection
    }
}
