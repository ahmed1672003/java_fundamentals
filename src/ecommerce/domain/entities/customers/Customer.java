package ecommerce.domain.entities.customers;

import ecommerce.domain.entities.users.User;

public class Customer extends User implements ICustomer {
    private double balance;

    public Customer(String name, String email, String password, double balance) {
        super(name, email, password);
        this.balance = balance;
    }

    public Customer() {
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void display() {
        System.out.println("Customer information => " + "id" + super.getId() + " name" + getName() + " email" + getEmail() + " balance" + getBalance());
    }
}
