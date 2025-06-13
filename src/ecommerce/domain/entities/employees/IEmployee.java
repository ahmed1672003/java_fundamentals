package ecommerce.domain.entities.employees;

import ecommerce.domain.entities.users.IUser;

public interface IEmployee extends IUser {
    void setSalary(double salary);

    double getSalary();
}
