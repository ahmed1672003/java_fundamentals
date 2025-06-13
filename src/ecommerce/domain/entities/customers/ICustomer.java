package ecommerce.domain.entities.customers;

import ecommerce.domain.entities.users.IUser;

public interface ICustomer extends IUser {
    void setBalance(double balance);

    double getBalance();
}
