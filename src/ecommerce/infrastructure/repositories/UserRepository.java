package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.users.User;
import ecommerce.infrastructure.context.DummyDbContext;

final class UserRepository extends Repository<User> {
    public UserRepository(DummyDbContext context) {
        super(context);
    }
}
