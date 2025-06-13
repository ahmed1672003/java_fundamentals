package ecommerce.domain.entities.base;

public abstract class Entity implements IEntity {
    protected int id;

    public Entity(int id) {
        this.id = id;
    }

    public Entity() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
