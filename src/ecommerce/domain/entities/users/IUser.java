package ecommerce.domain.entities.users;

import ecommerce.building_block.shared.enums.UserType;
import ecommerce.domain.entities.base.IEntity;
import ecommerce.domain.entities.customers.Customer;
import ecommerce.domain.entities.employees.Employee;

public interface IUser extends IEntity {

    String getName();

    void setName(String name);

    void setEmail(String email);

    void setPassword(String password);

    String getEmail();

    String getPassword();

    static IUser createUser(UserType userType) {
        return switch (userType) {
            case Customer -> new Customer();
            case Employee -> new Employee();
            default -> throw new IllegalArgumentException("Invalid user type");
        };
    }
}
